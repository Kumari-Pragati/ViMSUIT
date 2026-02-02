package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_14143_1414305 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUsabilityTestVerifyTheAlreadyAMemberButtonLeadsToTheLoginScreen() throws InterruptedException {
        // Step 2: Navigate to the onboarding screen (Assuming it's already there or manually navigate)
        
        // Step 3: Click on the 'Already a member?' button
        Thread.sleep(500);
        onView(withId(R.id.id_login)).perform(ViewActions.click());

        // Step 4: Verify the user is redirected to the login screen
        Thread.sleep(500);
        Espresso.onView(withText("Login")).check(ViewAssertions.matches(withId(R.id.id_login)));
    }
}