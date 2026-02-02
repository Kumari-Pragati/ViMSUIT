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
public class Test_15287_1528703 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testSignUpWithInvalidEmail() throws InterruptedException {
        // Step 1: Enter 'John Doe' in the 'NAME' field
        onView(withId(R.id.id_name)).perform(ViewActions.typeText("John Doe"));

        // Step 2: Enter 'johndoe@example' in the 'EMAIL' field
        Thread.sleep(500);
        onView(withId(R.id.id_email)).perform(ViewActions.typeText("johndoe@example"));

        // Step 3: Enter 'P@ssw0rd' in the 'PASSWORD' field
        Thread.sleep(500);
        onView(withId(R.id.id_password)).perform(ViewActions.typeText("P@ssw0rd"));

        // Step 4: Enter 'P@ssw0rd' in the 'RETYPE PASSWORD' field
        Thread.sleep(500);
        onView(withId(R.id.id_retype_password)).perform(ViewActions.typeText("P@ssw0rd"));

        // Step 5: Click the 'SIGN UP' button
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withId(R.id.id_sign_up_button)).perform(ViewActions.click());

        // Expected Result: An error message is displayed indicating that the email is invalid
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("Invalid email address"))
                .inRoot(ViewMatchers.withParent(ViewMatchers.isAssignableFrom(android.widget.FrameLayout.class)))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}