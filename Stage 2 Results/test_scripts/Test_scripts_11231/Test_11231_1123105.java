package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.Button;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_11231_1123105 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickableButtonsUserClicksOnTheFindRestaurantsButton() throws InterruptedException {
        // Element 1: Open the 'Menu' button
        onView(withId(R.id.id_menu_open))
                .perform(click());
        Thread.sleep(500);
        // Verify state of 'Menu' button after click
        onView(withId(R.id.id_menu_open)).check(matches(isDisplayed()));

        // Element 2: Click on the 'FIND RESTAURANTS' button
        onView(withId(R.id.id_btnFindRestaurants))
                .perform(click());
        Thread.sleep(500);
        // Verify state of 'FIND RESTAURANTS' button after click
        onView(withId(R.id.id_btnFindRestaurants)).check(matches(isDisplayed()));

        // Element 3: Click on the 'LOGIN' button
        onView(withId(R.id.id_btnLogin))
                .perform(click());
        Thread.sleep(500);
        // Verify state of 'LOGIN' button after click
        onView(withId(R.id.id_btnLogin)).check(matches(isDisplayed()));
    }
}