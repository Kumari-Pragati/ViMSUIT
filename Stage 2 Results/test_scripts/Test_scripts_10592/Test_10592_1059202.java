package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers(withId);
import static org.hamcrest.Matchers.allOf;

@RunWith(AndroidJUnit4.class)
public class Test_10592_1059202 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheFunctionalityOfTheGreenPlusSignNextToEachSocialNetwork() throws InterruptedException {
        // Test each element
        for (int i = 0; i < 6; i++) {
            switch (i) {
                case 0:
                    onView(allOf(withId(R.id.id_btn_facebook), withContentDescription("['Navigate up']")))
                            .perform(click());
                    Thread.sleep(500);
                    break;
                case 1:
                    onView(allOf(withId(R.id.id_btn_google_plus), withContentDescription("[None]")))
                            .perform(click());
                    Thread.sleep(500);
                    break;
                case 2:
                    onView(allOf(withId(R.id.id_btn_twitter), withContentDescription("['Navigate up']")))
                            .perform(click());
                    Thread.sleep(500);
                    break;
                case 3:
                    onView(allOf(withId(R.id.id_btn_vk), withContentDescription("[None]")))
                            .perform(click());
                    Thread.sleep(500);
                    break;
                case 4:
                    // Assuming the 'Navigate up' button is the last one
                    onView(withContentDescription("['Navigate up']"))
                            .perform(click());
                    Thread.sleep(500);
                    break;
                default:
                    // This should not happen as we have only 6 elements to test
                    break;
            }
        }

        // Verify state (assuming a simple verification for now)
        onView(withId(R.id.id_btn_facebook)).check(matches(isDisplayed()));
        onView(withId(R.id.id_btn_google_plus)).check(matches(isDisplayed()));
        onView(withId(R.id.id_btn_twitter)).check(matches(isDisplayed()));
        onView(withId(R.id.id_btn_vk)).check(matches(isDisplayed()));
    }
}