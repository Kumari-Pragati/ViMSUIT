package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_10612_1061207 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickOnMessagesOption() throws InterruptedException {
        // Wait for the initial screen to load
        Thread.sleep(500);

        // Click on 'CHECK IN' option (assuming it's the Messages option)
        onView(withId(R.id.id_checkin_item)).perform(click());

        // Wait before checking the result
        Thread.sleep(500);

        // Assert that we are now on the Messages screen
        onView(withText("Messages")).check(matches(isDisplayed()));
    }
}