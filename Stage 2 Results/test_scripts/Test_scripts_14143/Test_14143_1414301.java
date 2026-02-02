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
public class Test_14143_1414301 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testPositiveFlowUserNavigatesToTheLoginScreen() throws InterruptedException {
        // Wait for the onboarding screen to load
        Thread.sleep(500);

        // Click on the 'Already a member?' button
        onView(withText("Already a member?")).perform(click());
        Thread.sleep(500);

        // Assert that the user is redirected to the login screen
        onView(withId(R.id.id_login)).check(matches(withText("Login")));
    }
}