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
public class Test_16741_1674103 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testBoundaryvalidationEmptyInputFields() throws InterruptedException {
        // Test each element
        onView(withId(R.id.id_pager))
                .perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.onView(withId(R.id.id_pager)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        onView(withId(R.id.id_list))
                .perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.onView(withId(R.id.id_list)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        for (int i = 1; i <= 4; i++) {
            String contentDescription = "[None]" + i;
            onView(withContentDescription(contentDescription))
                    .perform(ViewActions.click());
            Thread.sleep(500);
            Espresso.onView(withContentDescription(contentDescription)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        }
    }
}