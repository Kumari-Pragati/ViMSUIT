package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.filters.LargeTest;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class Test_10636_1063605 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickOnTheLargeImageOfAPersonHoldingACardLabeledFcBayernMnchenGer throws InterruptedException {
        // Tap on the large image of a person holding a card labeled 'FC Bayern München (GER)'
        onView(withContentDescription("[None]")).perform(click());
        
        Thread.sleep(500); // Wait for 500ms to ensure the next view is loaded

        // Verify that the detailed page about FC Bayern München (GER) is displayed
        onView(ViewMatchers.withText("FC Bayern München (GER)")).check(matches(isDisplayed()));
    }
}