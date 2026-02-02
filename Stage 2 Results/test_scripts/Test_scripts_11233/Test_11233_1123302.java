package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_11233_1123302 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyNavigationBetweenTabs() throws InterruptedException {
        // Open the app and navigate to the 'Info' screen for 'La Carne Premium Meat'
        
        // Test each element
        onView(withId(R.id.id_back))
                .perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.onView(withId(R.id.id_tab_layout)).check(matches(isDisplayed()));
        
        onView(withId(R.id.id_tab_layout))
                .perform(ViewActions.click());
        Thread.sleep(500);
        
        // Verify that the 'MENU' tab is selected
        Espresso.onView(withContentDescription("Menu")).inRoot(isDialog()).check(matches(isDisplayed()));
        
        // Tap on the 'REVIEWS' tab
        onView(withContentDescription("Reviews")).perform(ViewActions.click());
        Thread.sleep(500);
        
        // Verify that the 'REVIEWS' tab is selected
        Espresso.onView(withContentDescription("Reviews")).inRoot(isDialog()).check(matches(isDisplayed()));
        
        // Tap on the 'INFO' tab
        onView(withContentDescription("Info")).perform(ViewActions.click());
        Thread.sleep(500);
        
        // Verify that the 'INFO' tab is selected
        Espresso.onView(withContentDescription("Info")).inRoot(isDialog()).check(matches(isDisplayed()));
    }
}