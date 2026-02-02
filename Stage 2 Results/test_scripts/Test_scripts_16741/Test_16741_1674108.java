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
public class Test_16741_1674108 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testInputNoInputFieldsPresent() throws InterruptedException {
        // Open the app and navigate to the news screen (assuming it's already open)

        // Test each element
        for (int i = 0; i < 6; i++) {
            if (i == 0) {
                onView(withId(R.id.id_pager))
                        .perform(ViewActions.click());
                Thread.sleep(500);
                verifyElement();
            } else if (i == 1) {
                onView(withId(R.id.id_list))
                        .perform(ViewActions.click());
                Thread.sleep(500);
                verifyElement();
            } else {
                // For elements with no content description, we can use a generic approach
                String contentDescription = "[None]";
                onView(withContentDescription(contentDescription))
                        .perform(ViewActions.click());
                Thread.sleep(500);
                verifyElement();
            }
        }

        // Verify state after each element interaction
        void verifyElement() {
            Espresso.onView(withId(R.id.title)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
            Espresso.onView(withId(R.id.image)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
            Espresso.onView(withId(R.id.subtitle)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
            Espresso.onView(withId(R.id.headline)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        }
    }
}