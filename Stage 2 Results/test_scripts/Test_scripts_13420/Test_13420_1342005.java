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
public class Test_13420_1342005 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testLoginWithInvalidEmail() throws InterruptedException {
        // Loop through all elements and perform test steps on each

        for (int i = 1; i <= 2; i++) {
            if (i == 1) {
                // Element 1: withContentDescription("[None]") - com.groupme.android:id/button_facebook
                onView(withContentDescription("[None]")).perform(click());
                Thread.sleep(500);
                Espresso.onView(ViewMatchers.withId(com.groupme.android.R.id.button_facebook)).perform(click());
            } else if (i == 2) {
                // Element 2: withContentDescription("[None]") - com.groupme.android:id/button_microsoft
                onView(withContentDescription("[None]")).perform(click());
                Thread.sleep(500);
                Espresso.onView(ViewMatchers.withId(com.groupme.android.R.id.button_microsoft)).perform(click());
            }

            Thread.sleep(500);

            // Enter an invalid email address
            Espresso.onView(ViewMatchers.withId(com.groupme.android.R.id.email_input))
                    .perform(ViewActions.typeText("invalidemail@"));
            Thread.sleep(500);

            // Enter a valid password
            Espresso.onView(ViewMatchers.withId(com.groupme.android.R.id.password_input))
                    .perform(ViewActions.typeText("validpassword123"));
            Thread.sleep(500);

            // Click on the 'Login' button
            Espresso.onView(ViewMatchers.withId(com.groupme.android.R.id.login_button)).perform(click());
            Thread.sleep(500);

            // Verify that an error message is displayed indicating an invalid email address
            if (i == 1) {
                Espresso.onView(ViewMatchers.withText("Invalid email or password.")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
            } else if (i == 2) {
                Espresso.onView(ViewMatchers.withText("Invalid email or password.")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
            }
        }
    }
}