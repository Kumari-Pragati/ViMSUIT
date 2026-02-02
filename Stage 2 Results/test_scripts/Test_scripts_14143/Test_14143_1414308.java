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
public class Test_14143_1414308 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testValidationTestEnsureTheAlreadyAMemberButtonLeadsToTheLoginScreen() throws InterruptedException {
        // Step 2: Navigate to the onboarding screen (assuming it's already there or manually navigated)
        
        // Step 3: Click on the 'Already a member?' button
        Thread.sleep(500);
        onView(withId(R.id.id_login)).perform(ViewActions.click());

        // Step 4: Verify the user is redirected to the login screen
        Thread.sleep(500);
        Espresso.onView(hasDesc("Login")).check(ViewAssertions.matches(isDisplayed()));
    }
}