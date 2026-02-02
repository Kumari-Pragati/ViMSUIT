package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class Test_13897_13897005 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testCheckForAccessibilityusability() throws InterruptedException {
        // Perform a screen reader test on the back arrow button.
        Espresso.onView(ViewMatchers.withId(R.id.back_arrow_button)).perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.assertViewIsEnabled(R.id.back_arrow_button).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Perform a screen reader test on the large watermelon slice image.
        Espresso.onView(ViewMatchers.withId(R.id.drawable_fr_12)).perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.assertViewIsEnabled(R.id.drawable_fr_12).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Perform a screen reader test on the 3x3 grid of fruit images.
        for (int i = R.id.fruit_image_1; i <= R.id.fruit_image_9; i++) {
            Espresso.onView(ViewMatchers.withId(i)).perform(ViewActions.click());
            Thread.sleep(500);
            Espresso.assertViewIsEnabled(i).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        }

        // Perform a screen reader test on the navigation bar buttons.
        Espresso.onView(ViewMatchers.withId(R.id.nav_button_1)).perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.assertViewIsEnabled(R.id.nav_button_1).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        Espresso.onView(ViewMatchers.withId(R.id.nav_button_2)).perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.assertViewIsEnabled(R.id.nav_button_2).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        Espresso.onView(ViewMatchers.withId(R.id.nav_button_3)).perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.assertViewIsEnabled(R.id.nav_button_3).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}