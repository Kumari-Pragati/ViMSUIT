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
import static org.junit.Assert.assertTrue;

@RunWith(AndroidJUnit4.class)
public class Test_13895_13895003 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowInvalidSelection() throws InterruptedException {
        // Loop through all elements and perform actions
        for (int i = 1; i <= 10; i++) {
            switch (i) {
                case 1:
                    onView(withId(R.id.drawable_an_31)).perform(ViewActions.click());
                    break;
                case 2:
                    onView(withId(R.id.drawable_an_7)).perform(ViewActions.click());
                    break;
                case 3:
                    onView(withId(R.id.drawable_an_19)).perform(ViewActions.click());
                    break;
                case 4:
                    onView(withId(R.id.drawable_an_1)).perform(ViewActions.click());
                    break;
                case 5:
                    onView(withId(R.id.drawable_an_13)).perform(ViewActions.click());
                    break;
                case 6:
                    onView(withId(R.id.drawable_an_21)).perform(ViewActions.click());
                    break;
                case 7:
                    onView(withId(R.id.drawable_an_29)).perform(ViewActions.click());
                    break;
                case 8:
                    onView(withId(R.id.drawable_an_27)).perform(ViewActions.click());
                    break;
                case 9:
                    onView(withContentDescription("[None]")).perform(ViewActions.click());
                    break;
                case 10:
                    onView(withContentDescription("[None]")).perform(ViewActions.click());
                    break;
            }
            Thread.sleep(500);
            // Verify state
            assertTrue("Element should not have caused any action", isDisplayed().check(matches(isDisplayed())));
        }
    }
}