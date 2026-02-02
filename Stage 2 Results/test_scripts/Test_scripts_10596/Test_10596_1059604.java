package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.RecyclerView;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;

@RunWith(JUnit4.class)
public class Test_10596_1059604 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheFooterText() throws InterruptedException {
        // Open the app and navigate to the Help screen.
        Espresso.onView(ViewMatchers.withId(R.id.id_section_list)).check(matches(isDisplayed()));

        // Verify that the footer text 'POWERED BY HELPSHIFT' is displayed.
        Thread.sleep(500); // Add a delay to ensure the view is fully loaded
        Espresso.onView(ViewMatchers.isAssignableFrom(RecyclerView.class))
                .performScrollToPosition(R.id.id_section_list, 1) // Assuming the footer is at position 1
                .check(matches(isDisplayed()));

        Thread.sleep(500); // Additional delay for stability

        // Assertion to check if the footer text is displayed
        Espresso.onView(ViewMatchers.withText("POWERED BY HELPSHIFT"))
                .inRoot(ViewMatchers.withParent(ViewMatchers.isAssignableFrom(RecyclerView.class)))
                .check(matches(isDisplayed()));
    }
}