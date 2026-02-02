package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
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
import static org.hamcrest.CoreMatchers.allOf;

@RunWith(AndroidJUnit4.class)
public class Test_13420_1342001 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(5, java.util.concurrent.TimeUnit.SECONDS);

    @Test
    public void testLoginWithGoogle() throws InterruptedException {
        // Open the app and navigate to the login screen (assumed to be the default behavior)
        
        // Click on the Google button in the 'Connect with' section
        Thread.sleep(500);
        onView(allOf(withId(R.id.button_facebook), withContentDescription("[None]"))).perform(click());
        
        // Sign in with the provided Google account credentials (mocked for this test)
        Thread.sleep(500);
        Espresso.closeSoftKeyboard();
        // Assuming a text input field is present and can be filled
        onView(allOf(withId(R.id.email_input), withText("email@example.com"))).perform(ViewActions.typeText("email@example.com"));
        
        Thread.sleep(500);
        onView(allOf(withId(R.id.password_input), withText("password123"))).perform(ViewActions.typeText("password123"));
        
        Thread.sleep(500);
        Espresso.pressBack();
        
        // Verify that the user is logged in successfully
        Thread.sleep(500);
        onView(withText("Signed In")).check(matches(isDisplayed()));
    }
}