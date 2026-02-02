package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.Button;

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
public class Test_13829_13829007 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(5, java.util.concurrent.TimeUnit.SECONDS);

    @Test
    public void testLoginWithFacebookDataPersistenceTest() throws InterruptedException {
        // Step 1: Log out of the Drug Index app.
        // Assuming there is a logout button with id R.id.logout_button
        onView(withId(R.id.logout_button)).perform(click());

        Thread.sleep(500);

        // Step 2: Reopen the app. This step is handled by ActivityTestRule.

        // Step 3: Click on the Facebook login prompt.
        // Assuming there is a Facebook login button with id R.id.facebook_login_button
        onView(withId(R.id.facebook_login_button)).perform(click());

        Thread.sleep(500);

        // Step 4: Click on the 'CONTINUE AS SAM' button.
        onView(withText("Continue as Sam")).perform(click());

        Thread.sleep(500);

        // Expected Result: The user is logged into the Drug Index app using their Facebook credentials.
        // Assuming there is a view with id R.id.logged_in_view that appears when login is successful
        onView(withId(R.id.logged_in_view)).check(matches(withText("Welcome Sam")));

        Thread.sleep(500);
    }
}