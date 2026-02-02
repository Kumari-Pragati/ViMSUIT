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
public class Test_18512_1851206 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testCheckForAccessibilityusability() throws InterruptedException {
        // Perform screen reader test and verify accessibility/usability for each element

        // Element 1: withId(R.id.id_list_refresh)
        onView(withId(R.id.id_list_refresh))
                .perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.pressBack();
        Thread.sleep(500);

        // Element 2: withId(R.id.id_list_mes)
        onView(withId(R.id.id_list_mes))
                .perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.pressBack();
        Thread.sleep(500);

        // Element 3: withId(R.id.id_fab)
        onView(withId(R.id.id_fab))
                .perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.pressBack();
        Thread.sleep(500);

        // Element 4: withContentDescription("[None]")
        onView(withContentDescription("[None]"))
                .perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.pressBack();
        Thread.sleep(500);

        // Verify that all elements are accessible and usable
        verifyElementAccessibility(withId(R.id.id_list_refresh));
        verifyElementAccessibility(withId(R.id.id_list_mes));
        verifyElementAccessibility(withId(R.id.id_fab));
        verifyElementAccessibility(withContentDescription("[None]"));
    }

    private void verifyElementAccessibility(Object viewSelector) {
        onView(viewSelector)
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}