package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class Test_13829_13829008 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testLoginWithFacebookNavigationTest() throws InterruptedException {
        // Step 1: Open the Drug Index app (Assuming it's already opened by the rule)
        
        // Step 2: Click on the Facebook login prompt
        Espresso.onView(withId(R.id.facebook_login_button)).perform(ViewActions.click());
        Thread.sleep(500);

        // Step 3: Click on the 'CONTINUE AS SAM' button
        Espresso.onView(withId(R.id.id_gdp_dialog_continue_button)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        Espresso.onView(withId(R.id.id_gdp_dialog_continue_button)).perform(ViewActions.click());
        Thread.sleep(500);

        // Step 4: Navigate to another screen in the app (Assuming there's a button or action that navigates to another screen)
        Espresso.onView(withId(R.id.some_screen_id)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        Thread.sleep(500);

        // Step 5: Return to the Facebook login prompt
        Espresso.pressBack();
        Thread.sleep(500);

        // Step 6: Click on the 'CONTINUE AS SAM' button again
        Espresso.onView(withId(R.id.id_gdp_dialog_continue_button)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        Espresso.onView(withId(R.id.id_gdp_dialog_continue_button)).perform(ViewActions.click());
        Thread.sleep(500);

        // Expected Result: The user is logged into the Drug Index app using their Facebook credentials
        // Assuming there's a view or action that confirms login (e.g., a welcome message)
        Espresso.onView(withId(R.id.welcome_message_id)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}