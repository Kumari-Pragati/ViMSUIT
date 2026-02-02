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
public class Test_12675_1267503 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testLoginWithEmptyFields() throws InterruptedException {
        // Open the app and navigate to the login screen (assuming it's already open)

        // Element 1: Tap on 'Sign In' button with forgotten password
        onView(withContentDescription("[None]")).inRoot(isDialog()).perform(click());
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("Email"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        Espresso.onView(ViewMatchers.withText("Password"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Element 2: Tap on 'Sign In' button
        onView(withContentDescription("[None]")).inRoot(isDialog()).perform(click());
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("Email"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        Espresso.onView(ViewMatchers.withText("Password"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Element 3: Tap on 'Cancel' button
        onView(withContentDescription("[None]")).inRoot(isDialog()).perform(click());
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("Email"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        Espresso.onView(ViewMatchers.withText("Password"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Verify that an error message is displayed for each element
        Espresso.onView(ViewMatchers.withText("Please enter your email address."))
                .inRoot(isToast()).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        Espresso.onView(ViewMatchers.withText("Please enter your password."))
                .inRoot(isToast()).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Additional assertions can be added here if necessary
    }
}
```

Note: The above code assumes that the error messages are displayed as toasts or dialogs and uses Espresso matchers to verify their presence. Adjustments may be needed based on the actual UI structure of your application.