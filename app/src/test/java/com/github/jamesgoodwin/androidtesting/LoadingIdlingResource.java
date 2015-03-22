package com.github.jamesgoodwin.androidtesting;

import android.support.test.espresso.IdlingResource;

public class LoadingIdlingResource implements IdlingResource {

    private ResourceCallback resourceCallback;
    private LoadingActivity loadingActivity;

    public LoadingIdlingResource(LoadingActivity loadingActivity) {
        this.loadingActivity = loadingActivity;
    }

    @Override
    public String getName() {
        return "LoadingIdlingResource";
    }

    @Override
    public boolean isIdleNow() {
        return !loadingActivity.isLoading();
    }

    @Override
    public void registerIdleTransitionCallback(ResourceCallback resourceCallback) {
        this.resourceCallback = resourceCallback;
    }
}
