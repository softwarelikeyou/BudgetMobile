package com.budgetmobile.android.budgetmobile;

import android.Manifest;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.Paint;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.PermissionChecker;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import com.budgetmobile.android.budgetmobile.entity.Checkout;
import com.budgetmobile.android.budgetmobile.entity.CheckoutResult;
import com.budgetmobile.android.budgetmobile.entity.Order;
import com.budgetmobile.android.budgetmobile.entity.Promo;
import com.budgetmobile.android.budgetmobile.entity.PromoResult;
import com.budgetmobile.android.budgetmobile.entity.Purchase;
import com.budgetmobile.android.budgetmobile.entity.PurchaseResult;
import com.budgetmobile.android.budgetmobile.entity.Tax;
import com.budgetmobile.android.budgetmobile.entity.TopUpProduct;
import com.budgetmobile.android.budgetmobile.entity.User;
import com.budgetmobile.android.budgetmobile.facade.UserFacade;
import com.budgetmobile.android.budgetmobile.helper.ApplicationHelper;
import com.budgetmobile.android.budgetmobile.helper.DeviceHelper;
import com.budgetmobile.android.budgetmobile.helper.Toaster;
import com.zopim.android.sdk.api.ZopimChat;
import com.zopim.android.sdk.model.VisitorInfo;
import com.zopim.android.sdk.prechat.PreChatForm;
import com.zopim.android.sdk.prechat.ZopimChatActivity;

import java.text.DecimalFormat;
import java.util.HashSet;

public class MainActivity extends AppCompatActivity {

    public DecimalFormat currency = new DecimalFormat(Constants.NO_DECIMAL);
    public DecimalFormat currencyNoSign = new DecimalFormat(Constants.NO_DOLLAR_SIGN);
    public DecimalFormat currencySign = new DecimalFormat(Constants.DOLLAR_SIGN);
    private Menu myMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int permissionCheck = ContextCompat.checkSelfPermission(this, Manifest.permission.READ_SMS);
        if (permissionCheck != PackageManager.PERMISSION_GRANTED)
            DeviceHelper.enabled = Boolean.FALSE;
        else
            DeviceHelper.initializeAttribute(getApplicationContext());
        Cache.getInstance();
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);

        if (R.id.content_main == getCurrentContent()) {
            replaceContent(R.layout.content_main);
            TextView username = (TextView) findViewById(R.id.username);
            TextView password = (TextView) findViewById(R.id.password);
            if (Constants.MODE.equals("DEV")) {
                username.setText(Constants.DEV_USERNAME);
                password.setText(Constants.DEV_PASSWORD);
            }
        }

        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        Log.v("Screen", (getString(R.string.format_screen,
                String.valueOf(metrics.widthPixels),
                String.valueOf(metrics.heightPixels),
                String.valueOf(metrics.densityDpi))));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        if (myMenu == null)
            myMenu = menu;
        getMenuInflater().inflate(R.menu.menu_main, menu);
        if (Boolean.FALSE.equals(DeviceHelper.enabled))
            menu.getItem(6).setVisible(false);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_logoff:
                if (R.id.content_main == getCurrentContent())
                    return true;
                Cache.putUser(null);
                replaceContent(R.layout.content_main);
                return true;
            case R.id.action_account:
                goAccount(getCurrentFocus());
                return true;
            case R.id.action_topup:
                goTopup(getCurrentFocus());
                return true;
            case R.id.action_regulatory:
                goRegulatory(getCurrentFocus());
                return true;
            case R.id.action_support:
                if (R.id.content_support == getCurrentContent())
                    return true;
                replaceContent(R.layout.content_support);
                return true;
            case R.id.action_settings:
                if (Boolean.FALSE.equals(DeviceHelper.enabled)) {
                    Toaster.makeLongToast(getApplicationContext(), getString(R.string.label_settings_not_supported), Toaster.MEDIUM_DURATION);
                    return true;
                }
                if (R.id.content_settings == getCurrentContent())
                    return true;
                replaceContent(R.layout.content_settings);
                TextView applicationId = (TextView) findViewById(R.id.applicationId);
                applicationId.setText(BuildConfig.APPLICATION_ID);
                TextView buildType = (TextView) findViewById(R.id.buildType);
                buildType.setText(BuildConfig.BUILD_TYPE);
                TextView debug = (TextView) findViewById(R.id.debug);
                debug.setText(String.valueOf(BuildConfig.DEBUG));
                TextView sdk = (TextView) findViewById(R.id.sdk);
                sdk.setText(String.valueOf(Build.VERSION.SDK_INT));
                TextView versionName = (TextView) findViewById(R.id.versionName);
                versionName.setText(BuildConfig.VERSION_NAME);
                TextView phoneNumber = (TextView) findViewById(R.id.phoneNumber);
                phoneNumber.setText(DeviceHelper.phoneNumber);
                TextView deviceId = (TextView) findViewById(R.id.deviceId);
                deviceId.setText(Build.DISPLAY);
                TextView softwareVersion = (TextView) findViewById(R.id.softwareVersion);
                softwareVersion.setText(Build.PRODUCT);
                TextView networkOperationName = (TextView) findViewById(R.id.networkOperationName);
                networkOperationName.setText(DeviceHelper.networkOperationName);
                TextView serialNumber = (TextView) findViewById(R.id.serialNumber);
                serialNumber.setText(DeviceHelper.serialNumber);
                TextView operatorName = (TextView) findViewById(R.id.operatorName);
                operatorName.setText(Build.BRAND);
                DisplayMetrics metrics = new DisplayMetrics();
                getWindowManager().getDefaultDisplay().getMetrics(metrics);
                TextView screen = (TextView) findViewById(R.id.screen);
                screen.setText(getString(R.string.format_screen,
                                         String.valueOf(metrics.widthPixels),
                                         String.valueOf(metrics.heightPixels),
                                         String.valueOf(metrics.densityDpi)));
                TextView json = (TextView) findViewById(R.id.json);
                if (Cache.getUser() != null) {
                    if (Cache.getUser().getJsonObject() != null)
                        json.setText(Cache.getUser().getJsonObject().toString());
                }
                else {
                    json.setText("Not Logged In");
                    json.setLines(1);
                }
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        super.onPrepareOptionsMenu(menu);
        if (Cache.getUser() == null)
            menu.getItem(0).setVisible(false);
        else
            menu.getItem(0).setVisible(true);
        return true;
    }

    private int getCurrentContent() {
        ScrollView content = (ScrollView) findViewById(R.id.content);
        return content.getChildAt(0).getId();
    }

    private View replaceContent(final int layout) {
        ScrollView content = (ScrollView) findViewById(R.id.content);
        content.removeAllViews();
        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        return inflater.inflate(layout, content, true);
    }

    public void goSupport(View view) {
        if (R.id.content_support == getCurrentContent())
            return;
        replaceContent(R.layout.content_support);
    }

    public void goHome(View view) {
        if (Cache.getUser() == null) {
            Toaster.makeLongToast(getApplicationContext(), getString(R.string.label_please_login), Toaster.MEDIUM_DURATION);
            if (R.id.content_main != getCurrentContent())
                replaceContent(R.layout.content_main);
            return;
        }
        if (R.id.content_home == getCurrentContent())
            return;
        replaceContent(R.layout.content_home);
    }

    public void goCall(View view) {
        if (PermissionChecker.checkCallingOrSelfPermission(getApplicationContext(), "android.permission.CALL_PHONE") != PermissionChecker.PERMISSION_GRANTED) {
            Toaster.makeLongToast(getApplicationContext(), getString(R.string.label_calling_permission_denied), Toaster.MEDIUM_DURATION);
            return;
        }
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + Constants.BM_TOLLFREE));
        startActivity(intent);
    }

    public void goWebsite(View view) {
        if (DeviceHelper.haveNetworkConnection(MainActivity.this) == Boolean.FALSE) {
            Toaster.makeLongToast(getApplicationContext(), getString(R.string.label_no_internet_connection), Toaster.MEDIUM_DURATION);
            return;
        }
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.label_bm_website)));
        startActivity(Intent.createChooser(intent, "Chose browser"));
    }

    public void goChat(View view) {
        PreChatForm defaultPreChat = new PreChatForm.Builder()
                .name(PreChatForm.Field.REQUIRED_EDITABLE)
                .email(PreChatForm.Field.REQUIRED_EDITABLE)
                .phoneNumber(PreChatForm.Field.REQUIRED_EDITABLE)
                .department(PreChatForm.Field.OPTIONAL_EDITABLE)
                .message(PreChatForm.Field.OPTIONAL_EDITABLE)
                .build();

        ZopimChat.trackEvent("Application created");
        ZopimChat.init(Constants.ZOPIM_ACCOUNT_KEY).preChatForm(defaultPreChat).build();
        VisitorInfo visitorInfo = new VisitorInfo.Builder().build();
        if (Cache.getOrder() != null) {
            visitorInfo.setName(getString(R.string.format_first_last_names, Cache.getOrder().getFirstName(), Cache.getOrder().getLastName()));
            visitorInfo.setEmail(Cache.getOrder().getEmailAddress());
            visitorInfo.setPhoneNumber(Cache.getOrder().getPhoneNumber());
        }
        ZopimChat.setVisitorInfo(visitorInfo);
        startActivity(new Intent(this, ZopimChatActivity.class));
    }

    public void goAccount(View view) {
        if (Cache.getUser() == null) {
            Toaster.makeLongToast(getApplicationContext(), getString(R.string.label_please_login), Toaster.MEDIUM_DURATION);
            if (R.id.content_main != getCurrentContent())
                replaceContent(R.layout.content_main);
            return;
        }
        if (R.id.content_account == getCurrentContent())
            return;
        replaceContent(R.layout.content_account);
        Order order = Cache.getOrder();
        if (order != null) {
            TextView discount = (TextView) findViewById(R.id.discount);
            TextView plan = (TextView) findViewById(R.id.plan);
            TextView expirationDate = (TextView) findViewById(R.id.expirationDate);
            TextView voiceBalance = (TextView) findViewById(R.id.voiceBalance);
            TextView textBalance = (TextView) findViewById(R.id.textBalance);
            TextView dataBalance = (TextView) findViewById(R.id.dataBalance);
            TextView phone = (TextView) findViewById(R.id.phone);
            TextView name = (TextView) findViewById(R.id.name);
            TextView serviceAddress = (TextView) findViewById(R.id.serviceAddress);
            TextView serviceAddressCityStateZip = (TextView) findViewById(R.id.serviceAddressCityStateZip);
            TextView billingAddress = (TextView) findViewById(R.id.billingAddress);
            TextView billingAddressCityStateZip = (TextView) findViewById(R.id.billingAddressCityStateZip);

            if (order.getMobileAccountCredit() == 0) {
                TableLayout accountTable = (TableLayout) findViewById(R.id.accountTable);
                TableRow tableRow = (TableRow) findViewById(R.id.discountRow);
                accountTable.removeView(tableRow);
            }
            else
                discount.setText(currency.format(Constants.CREDIT_VALUE * order.getMobileAccountCredit()));

            plan.setText(order.getServicePlan());
            expirationDate.setText(order.getServiceEndDate());
            voiceBalance.setText(order.getPlanBalance_Voice());
            textBalance.setText(order.getPlanBalance_Text());
            dataBalance.setText(order.getPlanBalance_Data());
            phone.setText(order.getPhoneNumber());
            name.setText(getString(R.string.format_first_last_names, order.getFirstName(),
                                                                     order.getLastName()));
            serviceAddress.setText(getString(R.string.format_address1_address2, order.getServiceAddress().getAddress1(),
                                                                                order.getServiceAddress().getAddress2()));
            serviceAddressCityStateZip.setText(getString(R.string.format_city_state_zip,
                                                         order.getServiceAddress().getCity(),
                                                         order.getServiceAddress().getState(),
                                                         order.getServiceAddress().getZip()));
            billingAddress.setText(getString(R.string.format_address1_address2,
                                             order.getBillingAddress().getAddress1(),
                                             order.getBillingAddress().getAddress2()));
            billingAddressCityStateZip.setText(getString(R.string.format_city_state_zip,
                                                         order.getBillingAddress().getCity(),
                                                         order.getBillingAddress().getState(),
                                                         order.getBillingAddress().getZip()));
        }
    }

    public void goTopup(View view) {
        if (Cache.getUser() == null) {
            Toaster.makeLongToast(getApplicationContext(), getString(R.string.label_please_login), Toaster.MEDIUM_DURATION);
            if (R.id.content_main != getCurrentContent())
                replaceContent(R.layout.content_main);
            return;
        }
        if (Cache.getOrder().getMigrationInProgress()) {
            Toaster.makeLongToast(getApplicationContext(), getString(R.string.label_no_changes_at_this_time), Toaster.MEDIUM_DURATION);
            if (R.id.content_main != getCurrentContent())
                replaceContent(R.layout.content_home);
            return;
        }
        if (R.id.content_topup_products == getCurrentContent())
            return;
        Order order = Cache.getOrder();
        if (order == null) {
            Toaster.makeLongToast(getApplicationContext(), "No Topup orders found", Toaster.MEDIUM_DURATION);
            return;
        }
        replaceContent(R.layout.content_topup_products);
        TextView expirationDate = (TextView) findViewById(R.id.expirationDate);
        TextView voiceBalance = (TextView) findViewById(R.id.voiceBalance);
        TextView textBalance = (TextView) findViewById(R.id.textBalance);
        TextView dataBalance = (TextView) findViewById(R.id.dataBalance);

        expirationDate.setText(order.getTopUpExpiration());
        voiceBalance.setText(order.getTopUpBalance_Voice());
        textBalance.setText(order.getTopUpBalance_Text());
        dataBalance.setText(order.getTopUpBalance_Data());

        if (order.getMobileAccountCredit() > 0) {
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.creditLayout);
            frameLayout.setVisibility(View.VISIBLE);
            CheckBox useCreditCheckbox = (CheckBox) findViewById(R.id.useCreditCheckbox);
            if (Boolean.TRUE.equals(Cache.getUseCredits()))
                useCreditCheckbox.setChecked(Boolean.TRUE);
            else
                useCreditCheckbox.setChecked(Boolean.FALSE);
            TextView useCreditCrditLabel = (TextView) findViewById(R.id.useCreditCrditLabel);
            useCreditCrditLabel.setText(getString(R.string.format_use_credits,
                    currency.format(Constants.CREDIT_VALUE * order.getMobileAccountCredit())));
            useCreditCheckbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (buttonView.isChecked())
                        Cache.setUseCredits(Boolean.TRUE);
                    else
                        Cache.setUseCredits(Boolean.FALSE);
                }
            });
        }
        else {
            LinearLayout parent = (LinearLayout) findViewById(R.id.content_topup_products);
            parent.removeView(findViewById(R.id.creditLayout));
        }

        TableLayout productsList = (TableLayout) findViewById(R.id.productsList);

        if (order.getTopUpProducts() == null) {
            Toaster.makeLongToast(getApplicationContext(), "No Topup orders found", Toaster.MEDIUM_DURATION);
            return;
        }

        for (TopUpProduct topUpProduct : order.getTopUpProducts()) {
            TableRow row = new TableRow(this);
            row.setPadding(0, 0, 0, 10); // int left, int top, int right, int bottom
            row.setLayoutParams(new TableRow.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            row.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);

            Button button = new Button(this);
            button.setText(R.string.label_buy);
            button.setAllCaps(false);
            button.setTextSize(15);
            button.setGravity(Gravity.CENTER | Gravity.CENTER_HORIZONTAL);
            button.setLayoutParams(new TableRow.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT));
            button.setBackgroundResource(R.drawable.orange_rectangle);
            button.setTextColor(Color.parseColor("#fbf8ff"));
            button.setId(topUpProduct.getTopUpProductID());
            button.setPadding(0, 0, 0, 0); // int left, int top, int right, int bottom
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Checkout checkout = new Checkout();
                    checkout.setBmid(Cache.getOrder().getBudgetMobileId());
                    checkout.setProduct(v.getId());
                    if (Boolean.TRUE.equals(Cache.getUseCredits())) {
                        TopUpProduct product = ApplicationHelper.getProduct(new HashSet(Cache.getOrder().getTopUpProducts()), checkout.getProduct());
                        if (Cache.getOrder().getMobileAccountCredit() > product.getCreditsRequired())
                            checkout.setCredits(product.getCreditsRequired());
                        else
                            checkout.setCredits(Cache.getOrder().getMobileAccountCredit());
                    }
                    new TopUpCheckout().execute(checkout);
                }
            });
            row.addView(button, 0);

            TextView description = new TextView(this);
            description.setLines(3);
            description.setGravity(Gravity.START | Gravity.CENTER_VERTICAL);
            description.setTextColor(Color.BLACK);
            description.setTextSize(15);
            description.setAllCaps(false);
            description.setText(Html.fromHtml(ApplicationHelper.decorateProductDescription(topUpProduct.getDescription(), "<br>")));
            description.setPadding(10, 0, 0, 0); // int left, int top, int right, int bottom
            row.addView(description, 1);

            TextView price = new TextView(this);
            price.setText(currency.format(topUpProduct.getFaceValue()));
            price.setTextColor(Color.BLACK);
            price.setGravity(Gravity.END|Gravity.CENTER_VERTICAL);
            price.setAllCaps(false);
            price.setTextSize(18);
            row.addView(price, 2);

            productsList.addView(row);
        }
    }

    public void goRegulatory(View view) {
        if (Cache.getUser() == null) {
            Toaster.makeLongToast(getApplicationContext(), getString(R.string.label_please_login), Toaster.MEDIUM_DURATION);
            if (R.id.content_main != getCurrentContent())
                replaceContent(R.layout.content_main);
            return;
        }
        if (R.id.content_regulatory == getCurrentContent())
            return;
        replaceContent(R.layout.content_regulatory);
        if (Cache.getUser() != null) {
            TextView lifeline_expiration_date = (TextView) findViewById(R.id.lifeline_expiration_date);
            lifeline_expiration_date.setText(Cache.getOrder().getLifeline_Expiration());
            TextView lifeline_last_used_date = (TextView) findViewById(R.id.lifeline_last_used_date);
            lifeline_last_used_date.setText(Cache.getOrder().getLastCallDateTime());
        }
    }

    private void hideKeyboard(View view) {
        if (view != null) {
            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void goRenewNow(View view) {
        if (Cache.getOrder() == null)
            return;
        String URL = "https://www.budgetmobile.com/recertification/index.cfm";
        if (Cache.getOrder().getServiceAddress().getState().equals("CA"))
            URL = "http://www.budgetmobile.com/california/recertification/";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(URL));
        startActivity(Intent.createChooser(intent, "Chose browser"));
    }

    public void goTC(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(Constants.TERMS_CONDITIONS_URL));
        startActivity(Intent.createChooser(intent, "Chose browser"));
    }

    public void goLogin(View view) {
        TextView username = (TextView) findViewById(R.id.username);
        TextView password = (TextView) findViewById(R.id.password);

        if (username.getText().toString().equals("15977")) {
            username.setText(Constants.DEV_USERNAME);
            password.setText(Constants.DEV_PASSWORD);
        }

        if (username.getText().toString().matches("")) {
            Toaster.makeLongToast(getApplicationContext(), getString(R.string.label_password_not_entered), Toaster.MEDIUM_DURATION);
            return;
        }

        if (password.getText().toString().matches("")) {
            Toaster.makeLongToast(getApplicationContext(), getString(R.string.label_password_not_entered), Toaster.MEDIUM_DURATION);
            return;
        }

        Cache.setUsername(username.getText().toString());
        Cache.setPassword(password.getText().toString());
        new Login().execute(username.getText().toString(), password.getText().toString());
    }

    private class Login extends AsyncTask<String, Boolean, User> {

        ProgressDialog pd;
        Boolean noInternet = Boolean.FALSE;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            pd = new ProgressDialog(MainActivity.this);
            pd.setMessage("Attempting Login");
            pd.show();
        }

        @Override
        protected void onProgressUpdate(Boolean... values) {

        }

        @Override
        protected User doInBackground(String... params) {
            if (DeviceHelper.haveNetworkConnection(MainActivity.this) == Boolean.FALSE) {
                Toaster.makeLongToast(getApplicationContext(), getString(R.string.label_no_internet_connection), Toaster.MEDIUM_DURATION);
                noInternet = Boolean.TRUE;
                return null;
            }

            try {
                return UserFacade.getUserByUsernamePassword(params[0], params[1]);
            } catch (Exception e) {
                return null;
            }
        }

        @Override
        protected void onPostExecute(User result) {
            pd.dismiss();
            String message = "Unable to login";
            if (result == null) {
                if (noInternet) {
                    Toaster.makeLongToast(getApplicationContext(), getString(R.string.label_no_internet_connection), Toaster.MEDIUM_DURATION);
                    return;
                }
                Toaster.makeLongToast(getApplicationContext(), message, Toaster.MEDIUM_DURATION);
                return;
            } else {
                if (result.getIsError()) {
                    message = result.getErrorMessage();
                    Toaster.makeLongToast(getApplicationContext(),  message, Toaster.MEDIUM_DURATION);
                    return;
                }
                else {
                    Cache.putUser(result);
                    replaceContent(R.layout.content_home);
                }
            }
        }
    }

    public void goLookupAccount(View view) {
        EditText phone = (EditText) findViewById(R.id.phone_number);
        if (phone.getText().length() < 10) {
            Toaster.makeLongToast(getApplicationContext(), "Please enter a Budget Mobile #", Toaster.MEDIUM_DURATION);
            return;
        }
        new LookupAccount().execute(phone.getText().toString());
    }

    private class LookupAccount extends AsyncTask<String, Boolean, User> {

        ProgressDialog pd;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            pd = new ProgressDialog(MainActivity.this);
            pd.setMessage("Looking for Account");
            pd.show();
        }

        @Override
        protected void onProgressUpdate(Boolean... values) {

        }

        @Override
        protected User doInBackground(String... params) {
            if (DeviceHelper.haveNetworkConnection(getApplicationContext()) == Boolean.FALSE) {
                Toaster.makeLongToast(getApplicationContext(), getString(R.string.label_no_internet_connection), Toaster.MEDIUM_DURATION);
                return null;
            }

            try {
                return UserFacade.getUserByMDN(params[0]);
            } catch (Exception e) {
                return null;
            }
        }

        @Override
        protected void onPostExecute(User result) {
            pd.dismiss();
            if (result == null) {
                Toaster.makeLongToast(getApplicationContext(), "Unable to login", Toaster.MEDIUM_DURATION);
                replaceContent(R.layout.content_main);
            } else {
                if (Boolean.TRUE.equals(result.getIsError())) {
                    Toaster.makeLongToast(getApplicationContext(), "Unable to find account", Toaster.MEDIUM_DURATION);
                    replaceContent(R.layout.content_main);
                    return;
                }

                replaceContent(R.layout.content_lookup_account);
                TextView userId = (TextView) findViewById(R.id.userid);
                userId.setText(String.valueOf(result.getUserId()));
                TextView email = (TextView) findViewById(R.id.email);
                email.setText(result.getEmail());
            }
        }
    }

    public void goLookupAccountSendEmail(View view) {
        TextView userId = (TextView) findViewById(R.id.userid);
        TextView email = (TextView) findViewById(R.id.email);
        new LookupAccountSendEmail().execute(userId.getText().toString(), email.getText().toString());
    }

    private class LookupAccountSendEmail extends AsyncTask<String, Boolean, Boolean> {

        ProgressDialog pd;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            pd = new ProgressDialog(MainActivity.this);
            pd.setMessage("Sending Email");
            pd.show();
        }

        @Override
        protected void onProgressUpdate(Boolean... values) {

        }

        @Override
        protected Boolean doInBackground(String... params) {
            if (DeviceHelper.haveNetworkConnection(getApplicationContext()) == Boolean.FALSE) {
                Toaster.makeLongToast(getApplicationContext(), getString(R.string.label_no_internet_connection), Toaster.MEDIUM_DURATION);
            }

            try {
                return UserFacade.forgotCredentials(params[0], params[1]);
            } catch (Exception e) {
                return null;
            }
        }

        @Override
        protected void onPostExecute(Boolean result) {
            pd.dismiss();
            Toaster.makeLongToast(getApplicationContext(), "Email sent", Toaster.MEDIUM_DURATION);
            replaceContent(R.layout.content_main);
        }
    }

    protected class TopUpCheckout extends AsyncTask<Checkout, Boolean, CheckoutResult> {

        ProgressDialog pd;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            pd = new ProgressDialog(MainActivity.this);
            pd.setMessage("Attempting Checkout");
            pd.show();
        }

        @Override
        protected void onProgressUpdate(Boolean... values) {

        }

        @Override
        protected CheckoutResult doInBackground(Checkout... params) {
            if (DeviceHelper.haveNetworkConnection(getApplicationContext()) == Boolean.FALSE) {
                Toaster.makeLongToast(getApplicationContext(), getString(R.string.label_no_internet_connection), Toaster.MEDIUM_DURATION);
                return null;
            }

            try {
                return UserFacade.checkOut(params[0]);
            } catch (Exception e) {
                return null;
            }
        }

        @Override
        protected void onPostExecute(CheckoutResult result) {
            pd.dismiss();
            if (result == null) {
                Toaster.makeLongToast(getApplicationContext(), "Unable to login", Toaster.MEDIUM_DURATION);
            } else {
                replaceContent(R.layout.content_topup_checkout);
                Cache.putCheckoutResult(result);
                TextView productDescription = (TextView) findViewById(R.id.productDescription);
                productDescription.setText(Html.fromHtml(ApplicationHelper.decorateProductDescription(result.getTopUpDescription(), " ")));

                TextView productPrice = (TextView) findViewById(R.id.productPrice);
                if (result.getTaxes().size() == 0) {
                    productPrice.getPaint().setStrokeWidth(7);
                    productPrice.setPaintFlags(productPrice.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                }
                productPrice.setText(currencySign.format(Double.valueOf(result.getTopUpCost())));

                TableLayout costTableLayout = (TableLayout) findViewById(R.id.costTableLayout);
                int i = 1;
                for (Tax tax : result.getTaxes()) {
                    TableRow row = new TableRow(getApplicationContext());
                    TextView taxDecscription = new TextView(getApplicationContext());
                    taxDecscription.setTextSize(12);
                    taxDecscription.setText(tax.getDescription());
                    taxDecscription.setTextColor(Color.BLACK);
                    taxDecscription.setGravity(Gravity.START);
                    row.addView(taxDecscription);

                    TextView taxAmount = new TextView(getApplicationContext());
                    taxAmount.setTextSize(14);
                    taxAmount.setTextColor(Color.BLACK);
                    taxAmount.setGravity(Gravity.END);
                    if (i == result.getTaxes().size()) {
                        taxAmount.getPaint().setStrokeWidth(7);
                        taxAmount.setPaintFlags(taxAmount.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                        taxAmount.setText(ApplicationHelper.padLeft(currencyNoSign.format(tax.getAmount()), 10, ' '));
                    }
                    else
                        taxAmount.setText(currencyNoSign.format(tax.getAmount()));
                    row.addView(taxAmount);

                    costTableLayout.addView(row, i++);
                }

                TextView totalPrice = (TextView) findViewById(R.id.totalPrice);
                if (result.getOrderTotal() == "0.0")
                    totalPrice.setText("$0.00");
                else
                    totalPrice.setText(currencySign.format(Double.valueOf(result.getOrderTotal())));

                if (Cache.getOrder() != null) {
                    if (Boolean.TRUE.equals(Cache.getOrder().getAssociateWithClerk())) {
                        TableRow tablerow_promo_code = (TableRow) findViewById(R.id.tablerow_promo_code);
                        TableLayout carditCardLayout = (TableLayout) findViewById(R.id.carditCardLayout);
                        carditCardLayout.removeView(tablerow_promo_code);
                    }
                }

                if (Constants.MODE.equals("DEV")) {
                    EditText credit_card = (EditText) findViewById(R.id.credit_card);
                    EditText cc_exp = (EditText) findViewById(R.id.cc_exp);
                    EditText cc_ccc = (EditText) findViewById(R.id.cc_ccc);
                    credit_card.setText(Constants.DEV_CC);
                    cc_exp.setText(Constants.DEV_CC_EXP);
                    cc_ccc.setText(Constants.DEV_CCV);
                }

                if (Cache.getUser() != null) {
                    Order order = Cache.getOrder();
                    if (order != null) {
                        EditText card_holder_name = (EditText) findViewById(R.id.card_holder_name);
                        card_holder_name.setText(getString(R.string.format_first_last_names,
                                                           order.getFirstName(),
                                                           order.getLastName()));
                        EditText card_holder_address1 = (EditText) findViewById(R.id.card_holder_address1);
                        card_holder_address1.setText(getString(R.string.format_address1_address2,
                                order.getBillingAddress().getAddress1(),
                                order.getBillingAddress().getAddress2()));
                        EditText cc_city = (EditText) findViewById(R.id.cc_city);
                        cc_city.setText(order.getBillingAddress().getCity());
                        EditText cc_state = (EditText) findViewById(R.id.cc_state);
                        cc_state.setText(order.getBillingAddress().getState());
                        EditText cc_zip = (EditText) findViewById(R.id.cc_zip);
                        cc_zip.setText(order.getBillingAddress().getZip());
                    }
                }
            }
        }
    }

    public void goPayNow(View view) {
        EditText credit_card = (EditText) findViewById(R.id.credit_card);
        EditText cc_exp = (EditText) findViewById(R.id.cc_exp);
        EditText cc_ccc = (EditText) findViewById(R.id.cc_ccc);
        EditText card_holder_name = (EditText) findViewById(R.id.card_holder_name);
        EditText card_holder_address1 = (EditText) findViewById(R.id.card_holder_address1);
        EditText cc_city = (EditText) findViewById(R.id.cc_city);
        EditText cc_state = (EditText) findViewById(R.id.cc_state);
        EditText cc_zip = (EditText) findViewById(R.id.cc_zip);

        String message = null;

        if (Cache.getOrder() != null) {
            if (Boolean.FALSE.equals(Cache.getOrder().getAssociateWithClerk())) {
                EditText promoCode = (EditText) findViewById(R.id.promo_code);
                if (!promoCode.getText().toString().matches(""))
                    Cache.setPromoCode(promoCode.getText().toString());
            }
        }
        if (cc_zip.getText().toString().matches(""))
            message = "Zip code cannot be empty";
        if (cc_state.getText().toString().matches(""))
            message = "State cannot be empty";
        if (cc_city.getText().toString().matches(""))
            message = "City cannot be empty";
        if (card_holder_address1.getText().toString().matches(""))
            message = "Address cannot be empty";
        if (card_holder_name.getText().toString().matches(""))
            message = "Cardholder name cannot be empty";
        if (cc_ccc.getText().toString().matches(""))
            message = "Verfication code cannot be empty";
        if (cc_exp.getText().toString().matches(""))
            message = "Expiration date cannot be empty";
        if (credit_card.getText().toString().matches(""))
            message = "Credit card cannot be empty";

        if (message != null) {
            Toaster.makeLongToast(getApplicationContext(), message, Toaster.MEDIUM_DURATION);
            return;
        }

        Purchase purchase = new Purchase();
        purchase.setCheckoutResult(Cache.getCheckoutResult());
        purchase.setZip(cc_zip.getText().toString());
        purchase.setState(cc_state.getText().toString());
        purchase.setCity(cc_city.getText().toString());
        purchase.setCcc(cc_ccc.getText().toString());
        purchase.setCreditCard(credit_card.getText().toString());
        purchase.setExpiration(cc_exp.getText().toString());
        purchase.setName(card_holder_name.getText().toString());
        purchase.setStreetAddress1(card_holder_address1.getText().toString());

        purchase.setPhone(Cache.getOrder().getPhoneNumber());
        purchase.setEmail(Cache.getUser().getEmail());
        new TopUpPurchase().execute(purchase);
    }

    private class TopUpPurchase extends AsyncTask<Purchase, Boolean, PurchaseResult> {

        ProgressDialog pd;
        Purchase purchase;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            pd = new ProgressDialog(MainActivity.this);
            pd.setMessage("Attempting Purchase");
            pd.show();
        }

        @Override
        protected void onProgressUpdate(Boolean... values) {

        }

        @Override
        protected PurchaseResult doInBackground(Purchase... params) {
            if (DeviceHelper.haveNetworkConnection(getApplicationContext()) == Boolean.FALSE) {
                Toaster.makeLongToast(getApplicationContext(), getString(R.string.label_no_internet_connection), Toaster.MEDIUM_DURATION);
                return null;
            }

            try {
                purchase = params[0];
//                if (Constants.MODE.equals("DEV"))
//                    return PurchaseResult.MOCK();
                return UserFacade.purchase(params[0]);
            } catch (Exception e) {
                return null;
            }
        }

        @Override
        protected void onPostExecute(PurchaseResult result) {
            pd.dismiss();
            if (result == null)
                Toaster.makeLongToast(getApplicationContext(), "Unable execute payment", Toaster.MEDIUM_DURATION);
            else {
                replaceContent(R.layout.content_topup_purchase_result);

                TextView authorizationCodeLabel = (TextView) findViewById(R.id.label_authorization_code);
                TextView orderIdLabel = (TextView) findViewById(R.id.label_order_id);
                TextView txRefNumLabel = (TextView) findViewById(R.id.label_tx_fef_num);
                TextView requestAmountLabel = (TextView) findViewById(R.id.label_request_amount);

                TextView approvalStatus = (TextView) findViewById(R.id.approval_status);
                TextView authorizationCode = (TextView) findViewById(R.id.authorization_code);
                TextView orderId = (TextView) findViewById(R.id.order_id);
                TextView txRefNum = (TextView) findViewById(R.id.tx_fef_num);
                TextView requestAmount = (TextView) findViewById(R.id.request_amount);

                TableLayout tableLayout = (TableLayout) findViewById(R.id.table_layout);

                if (result.getErrorCode() != null) {
                    tableLayout.setColumnShrinkable(2, true);
                    tableLayout.setColumnStretchable(1, true);
                    approvalStatus.setText(result.getErrorCode());
                    approvalStatus.setLines(3);
                    authorizationCodeLabel.setVisibility(View.INVISIBLE);
                    authorizationCode.setVisibility(View.INVISIBLE);
                    orderIdLabel.setVisibility(View.INVISIBLE);
                    txRefNumLabel.setVisibility(View.INVISIBLE);
                    requestAmountLabel.setVisibility(View.INVISIBLE);
                    orderId.setVisibility(View.INVISIBLE);
                    txRefNum.setVisibility(View.INVISIBLE);
                    requestAmount.setVisibility(View.INVISIBLE);

                    try {
                        Cache.putUser(UserFacade.getUserByUsernamePassword(Cache.getUsername(), Cache.getPassword()));
                        Toaster.makeLongToast(getApplicationContext(), "Data refreshed", Toaster.MEDIUM_DURATION);
                    }
                    catch (Exception e) {
                        Toaster.makeLongToast(getApplicationContext(), "Unable refresh data", Toaster.MEDIUM_DURATION);
                    }
                }
                else {
                    tableLayout.setStretchAllColumns(true);
                    approvalStatus.setText(result.getProcStatusMessage());
                    authorizationCode.setText(result.getAuthorizationCode());
                    orderId.setText(result.getOrderID());
                    txRefNum.setText(result.getTopUpId());
                    DecimalFormat currency = new DecimalFormat(Constants.DOLLAR_SIGN);
                    requestAmount.setText(currency.format(Double.valueOf(purchase.getCheckoutResult().getOrderTotal())));

                    if (Cache.getPromoCode() != null) {
                        Promo promo = new Promo();
                        promo.setUsername(Cache.getPromoCode());
                        promo.setBmi(Cache.getOrder().getBudgetMobileId());
                        new SavePromo().execute(promo);
                    }
                }
            }
        }
    }

    private class SavePromo extends AsyncTask<Promo, Boolean, PromoResult> {

        ProgressDialog pd;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            pd = new ProgressDialog(MainActivity.this);
            pd.setMessage("Verifying Promo Code");
            pd.show();
        }

        @Override
        protected void onProgressUpdate(Boolean... values) {

        }

        @Override
        protected PromoResult doInBackground(Promo... params) {
            if (DeviceHelper.haveNetworkConnection(getApplicationContext()) == Boolean.FALSE) {
                Toaster.makeLongToast(getApplicationContext(), getString(R.string.label_no_internet_connection), Toaster.MEDIUM_DURATION);
                return null;
            }

            try {
                return UserFacade.savePromo(params[0]);
            } catch (Exception e) {
                return null;
            }
        }

        @Override
        protected void onPostExecute(PromoResult result) {
            pd.dismiss();
            if (result == null) {
                Toaster.makeLongToast(getApplicationContext(), "Unable to login", Toaster.MEDIUM_DURATION);
            }
            else {
                if (Cache.getOrder() != null) {
                    if (Boolean.FALSE.equals(Cache.getOrder().getAssociateWithClerk())) {
                        TableRow promo_code_row = (TableRow) findViewById(R.id.promo_code_row);
                        promo_code_row.setVisibility(View.VISIBLE);
                        TextView promo_code_result = (TextView) findViewById(R.id.promo_code_result);
                        if (Boolean.TRUE.equals(result.getIsError()))
                            promo_code_result.setText(result.getErrorMessage());
                        else {
                            Cache.getOrder().setAssociateWithClerk(Boolean.TRUE);
                            promo_code_result.setTextSize(14);
                            promo_code_result.setText("Verified/Saved");
                        }
                    }
                }
            }
        }
    }
}
