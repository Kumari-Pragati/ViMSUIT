package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import org.junit.Rule;
import org.junit.Test;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;

public class Test_11746_11746008 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUsabilityTestCalltoactionButton() throws InterruptedException {
        // Test each element
        onView(withId(R.id.id_button_play_entity))
                .perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("content / contente"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        onView(withContentDescription("['Navigate up']"))
                .perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("content / contente"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}