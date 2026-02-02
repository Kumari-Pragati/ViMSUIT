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
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_10498_10498004 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheFunctionalityOfTheSearchIconInTheHeader() throws InterruptedException {
        // Navigate to the 'Headlines' section (assuming it's already open or a default screen)
        
        // Click on the search icon in the header
        Thread.sleep(500);
        onView(withId(R.id.id_x9)).perform(click());
        Thread.sleep(500);

        // Assert that the app navigates to the search screen
        onView(withId(R.id.search_screen_container)).check(matches(isDisplayed()));
    }
}