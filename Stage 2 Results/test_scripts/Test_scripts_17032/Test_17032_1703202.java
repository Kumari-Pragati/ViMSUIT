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
public class Test_17032_1703202 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUserCanNavigateToTheAllLinesSection() throws InterruptedException {
        // Wait for the view to be available and then click on it
        Thread.sleep(500);
        onView(withId(R.id.id_footer_add_button)).perform(click());

        // Wait for the next screen to load
        Thread.sleep(500);

        // Assert that the All Lines section is displayed
        onView(withId(R.id.all_lines_section_container)).check(matches(isDisplayed()));
    }
}