package com.example.tests;

import android.support.test.rule.ActivityTestRule;
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
import static android.support.test.espresso.matcher.ViewMatchers(withId);

@RunWith(AndroidJUnit4.class)
public class Test_14247_14247001 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class, true, false);

    @Test
    public void testOpenTheAppAndVerifyTheMainContentArea() throws InterruptedException {
        // Verify the main content area displays a large image of a dog with multiple text overlays
        onView(withId(R.id.main_content_area))
                .check(matches(isDisplayed()));

        // Test each element
        for (int i = 0; i < 4; i++) {
            switch (i) {
                case 0:
                    onView(withId(R.id.id_action_share))
                            .perform(click());
                    Thread.sleep(500);
                    break;
                case 1:
                    onView(withId(R.id.id_action_clear))
                            .perform(click());
                    Thread.sleep(500);
                    break;
                case 2:
                    onView(withId(R.id.id_action_add_head))
                            .perform(click());
                    Thread.sleep(500);
                    break;
                case 3:
                    onView(withContentDescription("More options"))
                            .perform(click());
                    Thread.sleep(500);
                    break;
            }
        }

        // Verify the main content area still displays a large image of a dog with multiple text overlays
        onView(withId(R.id.main_content_area))
                .check(matches(isDisplayed()));
    }
}