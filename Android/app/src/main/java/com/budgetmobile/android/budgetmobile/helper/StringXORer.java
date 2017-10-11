package com.budgetmobile.android.budgetmobile.helper;

import android.util.Base64;

public class StringXORer {

    public static String encode(String s, String key) {
        return base64Encode(xorWithKey(s.getBytes(), key.getBytes()));
    }

    public static String decode(String s, String key) {
        return new String(xorWithKey(base64Decode(s), key.getBytes()));
    }

    private static byte[] xorWithKey(byte[] a, byte[] key) {
        byte[] out = new byte[a.length];
        for (int i = 0; i < a.length; i++) {
            out[i] = (byte) (a[i] ^ key[i % key.length]);
        }
        return out;
    }

    private static byte[] base64Decode(String s) {
        return Base64.decode(s.getBytes(), Base64.DEFAULT);
    }

    private static String base64Encode(byte[] bytes) {
        return Base64.encodeToString(bytes, Base64.DEFAULT).replaceAll("\\s", "");
    }
}
