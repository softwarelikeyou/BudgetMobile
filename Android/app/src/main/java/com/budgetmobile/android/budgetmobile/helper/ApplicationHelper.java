package com.budgetmobile.android.budgetmobile.helper;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;

import com.budgetmobile.android.budgetmobile.Constants;
import com.budgetmobile.android.budgetmobile.entity.TopUpProduct;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Set;

public class ApplicationHelper {

    private Context context;

    public ApplicationHelper(Context context) {
        this.context = context;
        if (settings == null)
            settings = context.getSharedPreferences("MyPrefsFile", 0);
    }

    private static SharedPreferences settings;

    public static String getAdminUser() {
        return settings.getString("ADMIN_USER", Constants.ADMIN_USER);
    }

    public static String getAdminPassword() {
        return settings.getString("ADMIN_PASSWORD", Constants.ADMIN_PASSWORD);
    }

    public static String getUsername() {
        return settings.getString("USER", null);
    }

    public static String getUserPassword() {
        return settings.getString("USER_PASSWORD", null);
    }

    public static String encode(final CharSequence rawPassword) {
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("SHA-1");
        }
        catch (NoSuchAlgorithmException ne) {
            throw new RuntimeException(ne);
        }

        try {
            md.update(rawPassword.toString().getBytes("UTF-8"));
        }
        catch(UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }

        byte raw[] = md.digest();
        return Base64.encodeToString(raw, Base64.DEFAULT);
    }

    public static TopUpProduct getProduct(final Set<TopUpProduct> products, final Integer id) {
        for (TopUpProduct product : products) {
            if (product.getTopUpProductID().equals(id))
                return product;
        }
        return null;
    }

    public static String padLeft(String str, int totalLength, char padChar) {
        String padding = "";
        for(int i = 0; i < (totalLength - str.length()); i++)
            padding += padChar;
        return padding + str;
    }

    public static Boolean isNumeric(final String string) {
        try {
            if(string.matches("\\d+(?:\\.\\d+)?"))
                return Boolean.TRUE;
        }
        catch (Exception e) {
        }
        return Boolean.FALSE;
    }

    public static String decorateUnlimitedBalance(final String value) {
        try {
            if (isNumeric(value)) {
                if (Double.valueOf(value) > Constants.UNLIMITED_THRESHOLD)
                    return "Unlimited";
            }
        }
        catch (Exception e) {
            return value;
        }
        return value;
    }

    public static String decorateProductDescription(String product, final String decorate) {
        product = product.replaceAll("/", decorate);
        product = product.replaceAll("VOICE", "Voice");
        product = product.replaceAll("MINUTES", "Minutes");
        product = product.replaceAll("TEXT", "Text");
        product = product.replaceAll("DATA", "Data");
        return product.replaceAll("UNLIMITED", "Unlimited");
    }
}
