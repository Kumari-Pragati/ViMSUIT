package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers(withId);

@RunWith(AndroidJUnit4.class)
public class Test_13896_13896003 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testSelectAllAnimalFaceImages() throws InterruptedException {
        // Test each element
        onView(withId(R.id.drawable_an_31))
                .perform(ViewActions.click());
        Thread.sleep(500);
        verifyElementSelection(withId(R.id.drawable_an_31));

        onView(withId(R.id.drawable_an_7))
                .perform(ViewActions.click());
        Thread.sleep(500);
        verifyElementSelection(withId(R.id.drawable_an_7));

        // Assuming there are more elements with [None] content description
        onView(withContentDescription("[None]"))
                .perform(ViewActions.click());
        Thread.sleep(500);
        verifyElementSelection(withContentDescription("[None]"));

        onView(withContentDescription("[None]"))
                .perform(ViewActions.click());
        Thread.sleep(500);
        verifyElementSelection(withContentDescription("[None]"));
    }

    private void verifyElementSelection(Object viewMatcher) {
        onView(viewMatcher)
                .check(matches(isDisplayed()));
        // Add more specific checks if necessary
    }
}