package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.Button;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

@RunWith(AndroidJUnit4.class)
public class Test_18869_18869002 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowCreateANewAccountWithInvalidEmail throws InterruptedException {
        // Step 1: Open the app and navigate to the login screen (Assuming it's already on the login screen)
        
        // Step 2: Click on the 'NEW ACCOUNT' title
        onView(ViewMatchers.withText("NEW ACCOUNT")).perform(ViewActions.click());
        Thread.sleep(500);

        // Step 3: Enter an invalid email address into the 'EMAIL' input field
        onView(withId(R.id.email_input)).perform(ViewActions.typeText("invalidemail"));
        Thread.sleep(500);

        // Step 4: Click on the 'CREATE ACCOUNT' button
        onView(withId(R.id.id_reset_pass)).perform(ViewActions.click());
        Thread.sleep(500);

        // Expected Result: The app should display an error message indicating the email is invalid
        onView(ViewMatchers.withText("Invalid Email")).inRoot(isToast()).check(matches(isDisplayed()));
    }
}