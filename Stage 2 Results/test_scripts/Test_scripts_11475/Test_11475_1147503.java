package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.widget.TextView;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_11475_1147503 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    private ViewPager viewPager;

    @Before
    public void setUp() {
        // Initialize the view pager to navigate between tabs
        viewPager = activityRule.getActivity().findViewById(R.id.view_pager);
    }

    @Test
    public void testNavigateToTheInstructionsTab throws InterruptedException {
        // Step 1: Open the Nail Art App (already done by ActivityTestRule)

        // Step 2: Tap on the 'ИНСТРУКЦИИ' tab at the bottom of the screen
        Thread.sleep(500); // Wait for UI to stabilize

        onView(withId(R.id.id_tabs)).perform(ViewActions.click());

        Thread.sleep(500); // Wait for UI to stabilize

        // Step 3: Verify that the screen displays nail art instructions
        Espresso.onView(withId(R.id.view_pager))
                .check(matches(isDisplayed()));

        Fragment currentFragment = (Fragment) viewPager.getCurrentItem();
        if (currentFragment instanceof InstructionsFragment) {
            TextView instructionsTextView = currentFragment.getView().findViewById(R.id.instructions_text_view);
            onView(withText("Nail Art Instructions"))
                    .inRoot(withDecorView(not(activityRule.getActivity().getWindow().getDecorView())))
                    .check(matches(isDisplayed()));
        } else {
            fail("Expected to be on the Instructions tab, but was not.");
        }
    }
}