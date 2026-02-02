package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_17032_1703210 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUserCanNavigateToTheAllLinesSectionWithAnEmptySearchBar() throws InterruptedException {
        // Wait for the UI to load and stabilize
        Thread.sleep(500);

        // Click on the 'All Lines' button
        onView(withId(R.id.id_footer_add_button)).perform(click());

        // Wait for the new screen to load
        Thread.sleep(500);

        // Assert that the All Lines section is displayed
        onView(withId(R.id.all_lines_section_container)).check(matches(isDisplayed()));
    }
}