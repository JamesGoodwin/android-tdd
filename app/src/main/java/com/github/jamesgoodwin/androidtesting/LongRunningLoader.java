package com.github.jamesgoodwin.androidtesting;

import android.content.Context;
import android.content.Loader;
import android.util.Log;

public class LongRunningLoader extends Loader<Boolean> {
    
    public LongRunningLoader(Context context) {
        super(context);
    }

    @Override
    protected void onStartLoading() {
        try {
            Thread.sleep(10000L);
        } catch (InterruptedException e) {
            Log.e("ANDROID_TESTING", e.getMessage());
        }
        deliverResult(true);
    }
}
