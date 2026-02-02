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

@RunWith(AndroidJUnit4.class)
public class Test_17368_17368007 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testCheckAccessibilityOfTheScreen() throws InterruptedException {
        // Navigate to the Eggless Desserts screen (assuming there's a way to navigate)
        Espresso.onView(withContentDescription("Eggless Desserts")).perform(ViewActions.click());
        Thread.sleep(500);  // Wait for the screen to load

        // Loop through all elements and perform test steps on each
        for (int i = 1; i <= 15; i++) {
            switch (i) {
                case 1:
                    onView(withContentDescription("[None]")).check(matches(isDisplayed()));
                    Thread.sleep(500);
                    break;
                case 2:
                    onView(withContentDescription("[None]")).check(matches(isDisplayed()));
                    Thread.sleep(500);
                    break;
                case 3:
                    onView(withContentDescription("[None]")).check(matches(isDisplayed()));
                    Thread.sleep(500);
                    break;
                case 4:
                    onView(withContentDescription("[None]")).check(matches(isDisplayed()));
                    Thread.sleep(500);
                    break;
                case 5:
                    onView(withContentDescription("[None]")).check(matches(isDisplayed()));
                    Thread.sleep(500);
                    break;
                case 6:
                    onView(withContentDescription("[None]")).check(matches(isDisplayed()));
                    Thread.sleep(500);
                    break;
                case 7:
                    onView(withContentDescription("[None]")).check(matches(isDisplayed()));
                    Thread.sleep(500);
                    break;
                case 8:
                    onView(withContentDescription("[None]")).check(matches(isDisplayed()));
                    Thread.sleep(500);
                    break;
                case 9:
                    onView(withContentDescription("[None]")).check(matches(isDisplayed()));
                    Thread.sleep(500);
                    break;
                case 10:
                    onView(withContentDescription("[None]")).check(matches(isDisplayed()));
                    Thread.sleep(500);
                    break;
                case 11:
                    onView(withContentDescription("[None]")).check(matches(isDisplayed()));
                    Thread.sleep(500);
                    break;
                case 12:
                    onView(withContentDescription("[None]")).check(matches(isDisplayed()));
                    Thread.sleep(500);
                    break;
                case 13:
                    onView(withContentDescription("[None]")).check(matches(isDisplayed()));
                    Thread.sleep(500);
                    break;
                case 14:
                    onView(withContentDescription("[None]")).check(matches(isDisplayed()));
                    Thread.sleep(500);
                    break;
                case 15:
                    onView(withContentDescription("[None]")).check(matches(isDisplayed()));
                    Thread.sleep(500);
                    break;
            }
        }
    }
}