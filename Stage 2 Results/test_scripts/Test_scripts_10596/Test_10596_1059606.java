package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class Test_10596_1059606 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheAccessibilityOfTheScreen() throws InterruptedException {
        // Navigate to the Help screen (assuming it's the main screen for simplicity)
        
        // Test element 1: withId(R.id.id_hs__search)
        onView(withId(R.id.id_hs__search))
                .perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.pressBack();
        Thread.sleep(500);

        // Test element 2: withId(R.id.id_section_list)
        onView(withId(R.id.id_section_list))
                .perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.pressBack();
        Thread.sleep(500);

        // Test element 3: withContentDescription("['Navigate up']")
        onView(withContentDescription("['Navigate up']"))
                .perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.pressBack();
        Thread.sleep(500);

        // Verify that all elements are accessible and can be interacted with
        onView(withId(R.id.id_hs__search))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        onView(withId(R.id.id_section_list))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        onView(withContentDescription("['Navigate up']"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}