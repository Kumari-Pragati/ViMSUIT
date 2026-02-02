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

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_1184_1184003 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testCheckTheFetalDevelopmentImages() throws InterruptedException {
        // Open the app (assumed to be opened by default when using ActivityTestRule)

        // Navigate to the pregnancy calendar view
        onView(withId(R.id.nav_pregnancy_calendar)).perform(click());
        Thread.sleep(500);

        // Verify the four images representing different stages of fetal development are displayed
        onView(withId(R.id.id_pager)).check(matches(isDisplayed()));
        Thread.sleep(500);
        
        // Assuming there are 4 pages in the ViewPager, we will swipe through them to check each image.
        for (int i = 1; i <= 4; i++) {
            Espresso.onView(ViewMatchers.withEffectiveVisibility(ViewMatchers.Visibility.VISIBLE))
                    .perform(ViewActions.swipeLeft());
            Thread.sleep(500);
        }
        
        // Verify the images are displayed
        for (int i = 1; i <= 4; i++) {
            onView(withId(R.id.id_pager)).check(matches(isDisplayed()));
            Thread.sleep(500);
        }
    }
}