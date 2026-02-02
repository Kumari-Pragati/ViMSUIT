package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.isChecked;
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static java.lang.Thread.sleep;

@RunWith(AndroidJUnit4.class)
public class Test_10352_10352004 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testSelectOsmanlisporAsThePrediction() throws InterruptedException {
        // Step 1: Click on the 'Osmanlispor' prediction option.
        onView(withId(R.id.id_local_shield)).perform(click());
        sleep(500); // Wait for UI to update

        // Step 2: Verify that 'Osmanlispor' is selected as the prediction.
        Espresso.onView(withId(R.id.id_local_shield))
                .check(ViewAssertions.matches(isChecked()))
                .check(ViewAssertions.matches(withText("Osmanlispor")));
    }
}