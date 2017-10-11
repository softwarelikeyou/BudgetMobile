package com.budgetmobile.android.budgetmobile.helper;

import android.content.Context;
import android.os.CountDownTimer;
import android.view.Gravity;
import android.widget.Toast;

public class Toaster {
    public static final int SHORT_DURATION = 2000;
    public static final int MEDIUM_DURATION = 4000;
    public static final int LONG_DURATION = 6000;

    private Toaster() {}

    public static void makeLongToast(Context context, String text, long durationInMillis) {
        final Toast t = Toast.makeText(context, text, Toast.LENGTH_SHORT);
        t.setGravity(Gravity.CENTER, 0, 0);

        new CountDownTimer(Math.max(durationInMillis, 1000), 1000) {
            @Override
            public void onFinish() {
                t.show();
            }

            @Override
            public void onTick(long millisUntilFinished) {
                t.show();


            }
        }.start();
    }
}