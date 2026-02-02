package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_11231_1123103 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testBoundaryValidationUserSelectsAValidCuisine() throws InterruptedException {
        // Element 1: Click on the search icon in the header
        onView(withId(R.id.id_menu_open)).perform(click());
        Thread.sleep(500);
        Espresso.onView(withText("All Cuisines")).check(matches(ViewMatchers.isDisplayed()));

        // Element 2: Enter 'Italian' in the 'All Cuisines' input field and click on the 'FIND RESTAURANTS' button
        onView(withId(R.id.id_btnFindRestaurants)).perform(click());
        Thread.sleep(500);

        // Element 3: Click on the 'Login' button (assuming it's part of the flow)
        Espresso.onView(withId(R.id.id_btnLogin)).perform(click());
        Thread.sleep(500);
        
        // Verify that the app displays a list of Italian restaurants
        Espresso.onView(withText("Italian")).check(matches(ViewMatchers.isDisplayed()));
    }
}