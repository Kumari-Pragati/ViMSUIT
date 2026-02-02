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
import static android.support.test.espresso.matcher.ViewMatchers.isEnabled;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_17544_17544007 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testToggleStateOfButtons() throws InterruptedException {
        // Test each element
        onView(withId(R.id.id_LoginButton))
                .perform(click());
        Thread.sleep(500);
        verifyStateChange(withId(R.id.id_LoginButton));

        onView(withId(R.id.id_RegisterButton))
                .perform(click());
        Thread.sleep(500);
        verifyStateChange(withId(R.id.id_RegisterButton));

        onView(withId(R.id.id_fb_login_button))
                .perform(click());
        Thread.sleep(500);
        verifyStateChange(withId(R.id.id_fb_login_button));
    }

    private void verifyStateChange(int viewId) throws InterruptedException {
        // Verify state
        onView(withId(viewId)).check(matches(isEnabled()));
        Thread.sleep(500); // Wait for the UI to update
        // Optionally, you can add more checks or interactions here if needed
    }
}