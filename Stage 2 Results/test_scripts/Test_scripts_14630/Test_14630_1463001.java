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
public class Test_14630_1463001 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyThatTheCuteTabIsSelectedAndDisplaysCuteCatImages() throws InterruptedException {
        // Navigate to the 'CUTE' tab in the gallery section
        onView(withId(R.id.id_viewpager_layout))
                .perform(ViewActions.click());
        Thread.sleep(500);

        // Verify state of each element

        // Element 1: withId(R.id.id_viewpager_layout)
        onView(withId(R.id.id_viewpager_layout))
                .check(ViewAssertions.matches(org.hamcrest.core.IsNot.not(org.espresso.matcher.ViewMatchers.withEffectiveVisibility(ViewMatchers.Visibility.GONE))));

        // Element 2: withId(R.id.id_imageView13)
        onView(withId(R.id.id_imageView13))
                .check(ViewAssertions.matches(org.hamcrest.core.IsNot.not(org.espresso.matcher.ViewMatchers.withEffectiveVisibility(ViewMatchers.Visibility.GONE))));
        Thread.sleep(500);

        // Element 3: withId(R.id.id_imageView14)
        onView(withId(R.id.id_imageView14))
                .check(ViewAssertions.matches(org.hamcrest.core.IsNot.not(org.espresso.matcher.ViewMatchers.withEffectiveVisibility(ViewMatchers.Visibility.GONE))));
        Thread.sleep(500);

        // Element 4: withId(R.id.id_imageView15)
        onView(withId(R.id.id_imageView15))
                .check(ViewAssertions.matches(org.hamcrest.core.IsNot.not(org.espresso.matcher.ViewMatchers.withEffectiveVisibility(ViewMatchers.Visibility.GONE))));
        Thread.sleep(500);

        // Element 5: withId(R.id.id_imageView16)
        onView(withId(R.id.id_imageView16))
                .check(ViewAssertions.matches(org.hamcrest.core.IsNot.not(org.espresso.matcher.ViewMatchers.withEffectiveVisibility(ViewMatchers.Visibility.GONE))));
        Thread.sleep(500);

        // Element 6: withId(R.id.id_imageView17)
        onView(withId(R.id.id_imageView17))
                .check(ViewAssertions.matches(org.hamcrest.core.IsNot.not(org.espresso.matcher.ViewMatchers.withEffectiveVisibility(ViewMatchers.Visibility.GONE))));
        Thread.sleep(500);

        // Element 7: withId(R.id.id_imageView18)
        onView(withId(R.id.id_imageView18))
                .check(ViewAssertions.matches(org.hamcrest.core.IsNot.not(org.espresso.matcher.ViewMatchers.withEffectiveVisibility(ViewMatchers.Visibility.GONE))));
        Thread.sleep(500);

        // Element 8: withId(R.id.id_action_volume)
        onView(withId(R.id.id_action_volume))
                .check(ViewAssertions.matches(org.hamcrest.core.IsNot.not(org.espresso.matcher.ViewMatchers.withEffectiveVisibility(ViewMatchers.Visibility.VISIBLE))));
        Thread.sleep(500);

        // Element 9: withId(R.id.id_action_repeat)
        onView(withId(R.id.id_action_repeat))
                .check(ViewAssertions.matches(org.hamcrest.core.IsNot.not(org.espresso.matcher.ViewMatchers.withEffectiveVisibility(ViewMatchers.Visibility.VISIBLE))));
        Thread.sleep(500);

        // Element 10: withContentDescription("['Navigate up']")
        Espresso.onView(withContentDescription("Navigate up"))
                .check(ViewAssertions.matches(org.hamcrest.core.IsNot.not(org.espresso.matcher.ViewMatchers.withEffectiveVisibility(ViewMatchers.Visibility.VISIBLE))));
        Thread.sleep(500);

        // Elements 11 to 16: withContentDescription("[None]")
        for (int i = 11; i <= 16; i++) {
            Espresso.onView(withContentDescription("[None]"))
                    .check(ViewAssertions.matches(org.hamcrest.core.IsNot.not(org.espresso.matcher.ViewMatchers.withEffectiveVisibility(ViewMatchers.Visibility.VISIBLE))));
            Thread.sleep(500);
        }
    }
}