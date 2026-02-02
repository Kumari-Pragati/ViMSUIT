package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

@RunWith(AndroidJUnit4.class)
public class Test_12176_1217601 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifySignUpButtonFunctionality() throws InterruptedException {
        // Step 1: Click on the 'Sign Up' button.
        onView(withId(R.id.id_fragment_main_sign_up_button)).perform(click());
        
        // Wait for 500ms to ensure navigation is complete
        Thread.sleep(500);
        
        // Expected result: The app should navigate to the sign-up form.
        onView(ViewMatchers.withText("Sign Up Form Title")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}