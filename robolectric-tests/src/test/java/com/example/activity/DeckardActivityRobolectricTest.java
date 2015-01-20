package com.example.activity;

import android.app.Activity;

import com.example.RobolectricGradleSubModuleTestRunner;
import com.github.jamesgoodwin.androidtesting.LoadingActivity;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;

@RunWith(RobolectricGradleSubModuleTestRunner.class)
public class DeckardActivityRobolectricTest {

    @Test
    public void testSomething() throws Exception {
        Activity activity = Robolectric.buildActivity(LoadingActivity.class).create().get();
        Assert.assertTrue(activity != null);
    }
}
