package com.budgetmobile.android.budgetmobile.helper;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;

import com.budgetmobile.android.budgetmobile.Constants;

public class DeviceHelper {

    public static Boolean enabled = Boolean.TRUE;
    public static String phoneNumber;
    public static String deviceId;
    public static String softwareVersion;
    public static String networkOperationName;
    public static String serialNumber;
    public static String operatorName;

    public static void initializeAttribute(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
            phoneNumber = telephonyManager.getLine1Number();
            deviceId = telephonyManager.getDeviceId();
            softwareVersion = telephonyManager.getDeviceSoftwareVersion();
            networkOperationName = telephonyManager.getNetworkOperatorName();
            serialNumber = telephonyManager.getSimSerialNumber();
            operatorName = telephonyManager.getSimOperatorName();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean checkLogin() {
        return RemoteService.checkLogin(Constants.ADMIN_USER, Constants.ADMIN_PASSWORD);
    }

    public static boolean haveNetworkConnection(Context context) {
        Boolean haveConnectedWifi = Boolean.FALSE;
        Boolean haveConnectedMobile = Boolean.FALSE;

        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo[] netInfo = cm.getAllNetworkInfo();
        for (NetworkInfo ni : netInfo) {
            if (ni.getTypeName().equalsIgnoreCase("WIFI"))
                if (ni.isConnected())
                    haveConnectedWifi = Boolean.TRUE;
            if (ni.getTypeName().equalsIgnoreCase("MOBILE"))
                if (ni.isConnected())
                    haveConnectedMobile = Boolean.TRUE;
        }

        return haveConnectedWifi || haveConnectedMobile;
    }
}
