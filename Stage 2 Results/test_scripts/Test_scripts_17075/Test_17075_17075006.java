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
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class Test_17075_17075006 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowSignInWithDisabledYahooAccount() throws InterruptedException {
        // Step 1: Open the application (Assumed to be opened by default)
        
        // Step 2: Tap on the 'Sign in or create account' button
        onView(withId(R.id.id_button_sign_in_or_sign_up)).perform(ViewActions.click());
        Thread.sleep(500);

        // Step 3: Enter the disabled Yahoo username in the input field (Assuming the next view is an EditText)
        Espresso.onView(ViewMatchers.withId(R.id.disabled_yahoo_username_input))
                .perform(ViewActions.typeText("disabled@yahoo.com"));
        Thread.sleep(500);

        // Step 4: Enter the disabled Yahoo password in the input field
        Espresso.onView(ViewMatchers.withId(R.id.disabled_yahoo_password_input))
                .perform(ViewActions.typeText("invalidpassword"));
        Thread.sleep(500);

        // Step 5: Tap the 'Sign in' button (Assuming the next view is a Button with id R.id.sign_in_button)
        onView(withId(R.id.sign_in_button)).perform(ViewActions.click());
        Thread.sleep(500);

        // Expected Result: The user is presented with an error message indicating the account is disabled
        Espresso.onView(ViewMatchers.withText("Account Disabled"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}