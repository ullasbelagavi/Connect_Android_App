package com.appbrains.connect;

import android.app.Application;
import com.parse.Parse;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "PURnFA7hNX3nIZ62mKobBSr4fD7LHCNRMNTYStkW", "8hbYmw8f122dckG9zolmHaDwWBYDol1mr6R0WAk1");
    }
}
