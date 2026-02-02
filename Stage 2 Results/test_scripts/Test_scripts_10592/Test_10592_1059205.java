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
public class Test_10592_1059205 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyThatTheScreenIsAccessibleAndUsable() throws InterruptedException {
        // Open the application and navigate to the 'Social Networks' screen.
        
        // Perform a screen reader test to ensure all elements are accessible.
        // Perform a usability test to ensure the screen is easy to navigate and understand.

        // Element 1: withId(R.id.id_btn_facebook)
        onView(withId(R.id.id_btn_facebook))
                .perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.onView(withContentDescription("['Navigate up']"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        
        // Element 2: withId(R.id.id_btn_google_plus)
        onView(withId(R.id.id_btn_google_plus))
                .perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.onView(withContentDescription("['Navigate up']"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Element 3: withId(R.id.id_btn_twitter)
        onView(withId(R.id.id_btn_twitter))
                .perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.onView(withContentDescription("['Navigate up']"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Element 4: withId(R.id.id_btn_vk)
        onView(withId(R.id.id_btn_vk))
                .perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.onView(withContentDescription("['Navigate up']"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Element 5: withContentDescription("['Navigate up']")
        Espresso.onView(withContentDescription("['Navigate up']"))
                .perform(ViewActions.click());
        Thread.sleep(500);

        // Element 6: withContentDescription("[None]")
        Espresso.onView(withContentDescription("[None]"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}