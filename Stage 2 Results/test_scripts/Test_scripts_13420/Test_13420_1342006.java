package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

@RunWith(AndroidJUnit4.class)
public class Test_13420_1342006 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testLoginWithEmptyEmail() throws InterruptedException {
        // Loop through all elements and perform the test steps on each

        for (int i = 1; i <= 2; i++) {
            String buttonId = "com.groupme.android:id/button_facebook";
            if (i == 2) {
                buttonId = "com.groupme.android:id/button_microsoft";
            }

            // Step 1: Open the app and navigate to the login screen
            onView(ViewMatchers.withContentDescription("[None]")).perform(click());
            Thread.sleep(500);

            // Step 2: Click on the 'Enter your email address' input field
            onView(ViewMatchers.withId(com.groupme.android.R.id.email_input)).perform(ViewActions.clearText, ViewActions.typeText(""));

            // Step 3: Enter an empty email address (already done in step 2)
            Thread.sleep(500);

            // Step 4: Click on the 'Enter your password' input field
            onView(ViewMatchers.withId(com.groupme.android.R.id.password_input)).perform(ViewActions.clearText, ViewActions.typeText("validpassword"));
            Thread.sleep(500);

            // Step 5: Click on the 'Login' button
            Espresso.onView(ViewMatchers.withId(com.groupme.android.R.id.login_button))
                    .perform(ViewActions.click());
            Thread.sleep(500);

            // Step 7: Verify that an error message is displayed indicating an empty email address
            Espresso.onView(ViewMatchers.withText("Please enter a valid email address"))
                    .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        }
    }
}