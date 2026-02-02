package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.widget.Button;
import org.junit.Rule;
import org.junit.Test;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class Test_10208_1020809 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testRegisterWithEmailAddressBoundaryvalidation() throws InterruptedException {
        // Step 1: Open the 'buzzMuslim' app (Assuming it's already open and launched)
        
        // Step 2: Click on the 'Register with Email Address' button
        onView(withId(R.id.id_register_email_btn)).perform(click());
        Thread.sleep(500); // Wait for UI to update
        
        // Expected Result: The user should be redirected to the email registration form with the correct parameters.
        onView(withText("Email")).check(matches(isDisplayed()));
    }
}