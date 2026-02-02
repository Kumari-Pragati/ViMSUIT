package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers(withId);

@RunWith(AndroidJUnit4.class)
public class Test_13895_13895002 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowNoSelection() throws InterruptedException {
        // Test each element
        for (int i = 0; i < 10; i++) {
            if (i == 8 || i == 9) { // Skip the two elements with no content description
                Thread.sleep(500);
                continue;
            }

            onView(withId(getResourceId(i)))
                    .perform(click());
            Thread.sleep(500);

            // Verify state
            onView(withId(getResourceId(i)))
                    .check(matches(isDisplayed()));
        }
    }

    private int getResourceId(int index) {
        switch (index) {
            case 0: return R.id.drawable_an_31;
            case 1: return R.id.drawable_an_7;
            case 2: return R.id.drawable_an_19;
            case 3: return R.id.drawable_an_1;
            case 4: return R.id.drawable_an_13;
            case 5: return R.id.drawable_an_21;
            case 6: return R.id.drawable_an_29;
            case 7: return R.id.drawable_an_27;
            default: return -1; // Should not reach here
        }
    }
}