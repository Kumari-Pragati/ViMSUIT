package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.EditText;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.InstrumentationRegistry.getInstrumentation;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(JUnit4.class)
public class Test_14862_14862007 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testLoginWithInvalidEmailFormat() throws InterruptedException {
        // Step 1: Open the app and navigate to the login screen (Assuming it's already on the login screen)
        
        // Step 2: Enter 'invalidemail' into the email input field
        onView(withId(R.id.id_login_edittext_email)).perform(typeText("invalidemail"), ViewActions.closeSoftKeyboard);
        Thread.sleep(500);

        // Step 3: Enter 'SecurePassword123' into the password input field
        onView(withId(R.id.id_login_edittext_password)).perform(clearText(), typeText("SecurePassword123"), ViewActions.closeSoftKeyboard);
        Thread.sleep(500);

        // Step 4: Tap the 'LOGIN' button (Assuming the login button has id R.id.id_login_button)
        onView(withId(R.id.id_login_button)).perform(ViewActions.click());
        Thread.sleep(500);

        // Expected Result: An error message is displayed indicating invalid email format
        onView(ViewMatchers.withText("Invalid email format")).inRoot(ViewMatchers.withParent(ViewMatchers.isAssignableFrom(EditText.class)))
                .check(matches(ViewMatchers.isDisplayed()));
    }
}