package com.app.gitdemolib;

import android.app.Activity;
import android.widget.Toast;

public class TestClass {

    public static void showToast(Activity activity, String msg) {

        Toast.makeText(activity, "" + msg, Toast.LENGTH_SHORT).show();
    }
}
