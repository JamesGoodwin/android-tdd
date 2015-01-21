package com.github.jamesgoodwin.androidtesting;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.IdlingResource;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.LargeTest;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.registerIdlingResources;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@LargeTest
public class LoadingActivityTest extends ActivityInstrumentationTestCase2<LoadingActivity> {

    public LoadingActivityTest() {
        super(LoadingActivity.class);
    }

    public void testCheckText() {
        LoadingActivity activity = getActivity();
        LoadingIdlingResource loadingIdlingResource = new LoadingIdlingResource(activity);

        registerIdlingResources(loadingIdlingResource);

        onView(withId(R.id.result_text))
                .check(matches(withText("Espresso worked!")));
    }
}
