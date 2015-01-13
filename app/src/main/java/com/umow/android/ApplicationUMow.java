package com.umow.android;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by xuejianyu on 11/19/14.
 */
public class ApplicationUMow extends Application {

    private final String PARSE_APPLICATION_ID = "JefLhC0MeD4KlvLMN8849IEqr0hxAbLAzuTD9Oi9";
    private final String PARSE_CLIENT_KEY = "UAEOvs60xLmmtdpxCvlRzqMZVWWrc4DGx3QX3vrq";

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, PARSE_APPLICATION_ID, PARSE_CLIENT_KEY);
    }
}
