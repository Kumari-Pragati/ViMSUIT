package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.is;

@RunWith(AndroidJUnit4.class)
public class Test_10636_1063604 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNavigateToTheLatestSection() throws InterruptedException {
        // Tap on the 'Latest' tab in the navigation bar
        onView(withId(R.id.id_tablayout)).perform(ViewActions.click());
        
        // Wait for 500ms to ensure the UI updates
        Thread.sleep(500);

        // Assert that the 'Latest' section is displayed
        Espresso.onView(withId(R.id.latest_section_container))
                .check(matches(isDisplayed()));
    }
}