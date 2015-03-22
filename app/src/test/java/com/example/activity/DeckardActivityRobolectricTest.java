package com.example.activity;

import android.app.Activity;

import com.github.jamesgoodwin.androidtesting.LoadingActivity;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

@RunWith(RobolectricTestRunner.class)
@Config(manifest = "src/main/AndroidManifest.xml", emulateSdk = 18, reportSdk = 18)
public class DeckardActivityRobolectricTest {

    @Test
    public void testSomething() throws Exception {
        Activity activity = Robolectric.buildActivity(LoadingActivity.class).create().get();
        
        Assert.assertTrue(activity != null);
    }
}
