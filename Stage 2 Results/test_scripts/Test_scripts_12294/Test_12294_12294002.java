package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.assertion.ViewAssertions.doesNotExist;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_12294_12294002 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowAttemptingToNavigateToANonexistentSection() throws InterruptedException {
        // Test each element
        onView(withId(R.id.id_pager))
                .perform(ViewActions.click());
        Thread.sleep(500);
        
        Espresso.onView(withId(R.id.id_pager)).check(doesNotExist());
        Thread.sleep(500);

        onView(withId(R.id.id_skipButton))
                .perform(ViewActions.click());
        Thread.sleep(500);
        
        Espresso.onView(withId(R.id.id_skipButton)).check(doesNotExist());
        Thread.sleep(500);
    }
}