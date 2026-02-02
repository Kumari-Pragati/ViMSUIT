package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.AppCompatButton;
import org.junit.Rule;
import org.junit.Test;

public class Test_15287_1528701 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testSignUpWithValidData() throws InterruptedException {
        // Step 1: Enter 'John Doe' in the 'NAME' field
        Espresso.onView(ViewMatchers.withId(R.id.id_name_field)).perform(ViewActions.typeText("John Doe"));

        // Step 2: Enter 'johndoe@example.com' in the 'EMAIL' field
        Espresso.onView(ViewMatchers.withId(R.id.id_email_field)).perform(ViewActions.typeText("johndoe@example.com"));

        // Step 3: Enter 'P@ssw0rd' in the 'PASSWORD' field
        Espresso.onView(ViewMatchers.withId(R.id.id_password_field)).perform(ViewActions.typeText("P@ssw0rd"));

        // Step 4: Enter 'P@ssw0rd' in the 'RETYPE PASSWORD' field
        Espresso.onView(ViewMatchers.withId(R.id.id_retype_password_field)).perform(ViewActions.typeText("P@ssw0rd"));

        // Step 5: Click the 'SIGN UP' button
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withId(R.id.id_sign_up_button)).perform(ViewActions.click());

        // Expected Result: The user is successfully registered and redirected to the home screen
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("Home Screen Title")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}