package com.budgetmobile.android.budgetmobile.helper;

import android.util.Base64;
import android.util.Log;

import com.budgetmobile.android.budgetmobile.Constants;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class RemoteService {

    public static String HOST = "mvno-api01.budgetprepay.com"; // "68.67.114.30";
    public static String PORT = "8443";
    public static String PROTOCOL = "https";

    // Testing override
    static {
        // TODO Make sure to change back to DEV, before production release
        if (Constants.MODE.equals("DEV")) { // DEV
            HOST = "68.67.114.31";
            PORT = "5443";
            PROTOCOL = "http";
        }
    }

    public static String BASE_REMOTE_URL = PROTOCOL + "://" + RemoteService.HOST + ":" + RemoteService.PORT + "/BudgetMobileServer/restful/";
    public static int CONNECTION_TIMEOUT_MILLISEC = 2000;

    public static String LOGIN_URL = "login/";
    public static String USERS_URL = "users/";
    public static String MDN_URL = USERS_URL + "mdn/";
    public static String CHECKOUT_URL = USERS_URL + "checkout/";
    public static String PURCHASE_URL = USERS_URL + "purchase";
    public static String FORGOT_CREDENTIALS_URL = "forgotcredentials/";
    public static String TICKET_URL = USERS_URL + "ticket";
    public static String PROMO_URL = USERS_URL + "promo/";

    public static HttpHelper doPost(final String urlPart, final JSONObject jsonObject) {
        HttpHelper helper = new HttpHelper();
        HttpURLConnection connection = null;
        try {
            byte[] postDataBytes = jsonObject.toString().getBytes("UTF-8");
            URL url = new URL(BASE_REMOTE_URL + urlPart);
            connection = (HttpURLConnection) url.openConnection();
            byte[] auth = (Constants.ADMIN_USER + ":" + Constants.ADMIN_PASSWORD).getBytes("UTF-8");
            String basicAuth = "Basic " + Base64.encodeToString(auth, Base64.DEFAULT);
            connection.setRequestProperty("Authorization", basicAuth);
            connection.setRequestProperty("User-Agent", "Android");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Accept", "application/json");
            connection.setRequestProperty("Content-Length", String.valueOf(postDataBytes.length));
            connection.setRequestMethod("POST");
            connection.setConnectTimeout(CONNECTION_TIMEOUT_MILLISEC);
            connection.setDoInput(true);
            connection.setDoOutput(true);
            connection.connect();
            connection.getOutputStream().write(postDataBytes);

            helper.setResponseCode(connection.getResponseCode());
            helper.setResponseMessage(connection.getResponseMessage());

            StringBuilder chaine = new StringBuilder("");
            if (connection.getResponseCode() < 400){
                InputStream inputStream = connection.getInputStream();
                BufferedReader rd = new BufferedReader(new InputStreamReader(inputStream));
                String line;
                while ((line = rd.readLine()) != null)
                    chaine.append(line);
                rd.close();
                inputStream.close();
                helper.setBody(chaine.toString());
                helper.setJsonObject(new JSONObject(chaine.toString()));
            }
            else {
                InputStream errorStream = connection.getErrorStream();
                BufferedReader rd = new BufferedReader(new InputStreamReader(errorStream));
                String line;
                while ((line = rd.readLine()) != null)
                    chaine.append(line);
                rd.close();
                errorStream.close();
                helper.setError(chaine.toString());
            }
        }
        catch (MalformedURLException me) {
            helper.setError(me.getMessage());
        }
        catch (Exception e) {
            helper.setError(e.getMessage());
            e.printStackTrace();
        }
        finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
        return helper;
    }

    public static HttpHelper doPost(final String urlPart, final String body) {
        HttpHelper helper = new HttpHelper();
        HttpURLConnection connection = null;
        try {
            byte[] postDataBytes = body.toString().getBytes("UTF-8");
            URL url = new URL(BASE_REMOTE_URL + urlPart);
            connection = (HttpURLConnection) url.openConnection();
            byte[] auth = (Constants.ADMIN_USER + ":" + Constants.ADMIN_PASSWORD).getBytes("UTF-8");
            String basicAuth = "Basic " + Base64.encodeToString(auth, Base64.DEFAULT);
            connection.setRequestProperty("Authorization", basicAuth);
            connection.setRequestProperty("User-Agent", "Android");
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            //connection.setRequestProperty("Accept", "application/text");
            connection.setRequestProperty("Content-Length", String.valueOf(postDataBytes.length));
            connection.setRequestMethod("POST");
            connection.setConnectTimeout(CONNECTION_TIMEOUT_MILLISEC);
            connection.setDoInput(true);
            connection.setDoOutput(true);
            connection.connect();
            connection.getOutputStream().write(postDataBytes);

            helper.setResponseCode(connection.getResponseCode());
            helper.setResponseMessage(connection.getResponseMessage());

            Log.v("Ticket", String.valueOf(helper.getResponseCode()));
            Log.v("Ticket", helper.getResponseMessage());

            StringBuilder chaine = new StringBuilder("");
            if (connection.getResponseCode() < 400){
                InputStream inputStream = connection.getInputStream();
                BufferedReader rd = new BufferedReader(new InputStreamReader(inputStream));
                String line;
                while ((line = rd.readLine()) != null)
                    chaine.append(line);
                rd.close();
                inputStream.close();
                helper.setBody(chaine.toString());
                helper.setJsonObject(new JSONObject(chaine.toString()));
            }
            else {
                InputStream errorStream = connection.getErrorStream();
                BufferedReader rd = new BufferedReader(new InputStreamReader(errorStream));
                String line;
                while ((line = rd.readLine()) != null)
                    chaine.append(line);
                rd.close();
                errorStream.close();
                helper.setError(chaine.toString());
            }
        }
        catch (MalformedURLException me) {
            helper.setError(me.getMessage());
        }
        catch (Exception e) {
            helper.setError(e.getMessage());
            e.printStackTrace();
        }
        finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
        return helper;
    }

    public static HttpHelper doGet(final String urlPart) {
        HttpHelper helper = new HttpHelper();
        HttpURLConnection connection = null;
        try {
            URL url = new URL(BASE_REMOTE_URL + urlPart);
            connection = (HttpURLConnection) url.openConnection();
            byte[] data = (Constants.ADMIN_USER + ":" + Constants.ADMIN_PASSWORD).getBytes("UTF-8");
            String basicAuth = "Basic " + Base64.encodeToString(data, Base64.DEFAULT);
            connection.setRequestProperty("Authorization", basicAuth);
            connection.setRequestProperty("User-Agent", "");
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(CONNECTION_TIMEOUT_MILLISEC);
            connection.setDoInput(true);
            connection.connect();

            helper.setResponseCode(connection.getResponseCode());
            helper.setResponseMessage(connection.getResponseMessage());

            if (connection.getResponseCode() < 400){
                InputStream inputStream = connection.getInputStream();
                StringBuilder chaine = new StringBuilder("");
                BufferedReader rd = new BufferedReader(new InputStreamReader(inputStream));
                String line;
                while ((line = rd.readLine()) != null)
                    chaine.append(line);
                rd.close();
                inputStream.close();
                helper.setBody(chaine.toString());
            }
            else {
                InputStream errorStream = connection.getErrorStream();
                StringBuilder chaine = new StringBuilder("");
                BufferedReader rd = new BufferedReader(new InputStreamReader(errorStream));
                String line;
                while ((line = rd.readLine()) != null)
                    chaine.append(line);
                rd.close();
                errorStream.close();
                helper.setError(chaine.toString());
            }
        }
        catch (MalformedURLException me) {
            helper.setError(me.getMessage());
        }
        catch (Exception e) {
            helper.setError(e.getMessage());
            e.printStackTrace();
        }
        finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
        return helper;
    }


    public static HttpHelper doGetJson(final String urlPart) {
        HttpHelper helper = new HttpHelper();
        HttpURLConnection connection = null;
        try {
            URL url = new URL(BASE_REMOTE_URL + urlPart);
            connection = (HttpURLConnection) url.openConnection();
            byte[] data = (Constants.ADMIN_USER + ":" + Constants.ADMIN_PASSWORD).getBytes("UTF-8");
            String basicAuth = "Basic " + Base64.encodeToString(data, Base64.DEFAULT);
            connection.setRequestProperty("Authorization", basicAuth);
            connection.setRequestProperty("User-Agent", "");
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(CONNECTION_TIMEOUT_MILLISEC);
            connection.setRequestProperty("Accept", "application/json");
            connection.setDoInput(true);
            connection.connect();

            helper.setResponseCode(connection.getResponseCode());
            helper.setResponseMessage(connection.getResponseMessage());

            if (connection.getResponseCode() < 400){
                InputStream inputStream = connection.getInputStream();
                StringBuilder chaine = new StringBuilder("");
                BufferedReader rd = new BufferedReader(new InputStreamReader(inputStream));
                String line;
                while ((line = rd.readLine()) != null)
                    chaine.append(line);
                rd.close();
                inputStream.close();
                if (chaine.length() > 0) {
                    helper.setBody(chaine.toString());
                    Object json = new JSONTokener(chaine.toString()).nextValue();
                    if (json instanceof JSONObject)
                        helper.setJsonObject(new JSONObject(chaine.toString()));
                    else if (json instanceof JSONArray)
                        helper.setJsonArray(new JSONArray(chaine.toString()));
                }
            }
            else {
                InputStream errorStream = connection.getErrorStream();
                StringBuilder chaine = new StringBuilder("");
                BufferedReader rd = new BufferedReader(new InputStreamReader(errorStream));
                String line;
                while ((line = rd.readLine()) != null)
                    chaine.append(line);
                rd.close();
                errorStream.close();
                helper.setError(chaine.toString());
            }
        }
        catch (MalformedURLException me) {
            helper.setError(me.getMessage());
        }
        catch (Exception e) {
            helper.setError(e.getMessage());
            e.printStackTrace();
        }
        finally {
            if (connection != null) {
                connection.disconnect();
            }
        }

        return helper;
    }

    public static Boolean checkLogin(final String username, final String password) {
        if (username == null || password == null) {
            return Boolean.FALSE;
        }

        Boolean status = Boolean.FALSE;
        HttpHelper helper;
        try {
            helper = doGet(LOGIN_URL);

            if (helper.getResponseCode() == 200)
                status = Boolean.TRUE;
        }
        catch (Exception e) {
            //e.printStackTrace();
        }

        return status;
    }
}
