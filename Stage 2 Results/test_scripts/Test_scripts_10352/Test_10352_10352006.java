package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.AppCompatImageView;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

@RunWith(AndroidJUnit4.class)
public class Test_10352_10352006 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testSelectOlympiakosPiraeusAsThePrediction() throws InterruptedException {
        // Step 1: Click on the 'Olympiakos Piraeus' prediction option.
        Thread.sleep(500);
        onView(withId(R.id.id_local_shield)).perform(ViewActions.click());

        // Step 2: Verify that 'Olympiakos Piraeus' is selected as the prediction.
        Thread.sleep(500);
        Espresso.onView(isAssignableFrom(AppCompatImageView.class))
                .check(matches(withText("Olympiakos Piraeus")));
    }
}