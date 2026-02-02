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
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_17105_17105007 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyThePropertyDetailsSection() throws InterruptedException {
        // Open the property listing for Thompson St #6.
        onView(withText("Thompson St #6")).perform(click());
        
        Thread.sleep(500); // Wait for 500ms to ensure the view is fully loaded

        // Navigate to the property details section
        onView(withId(R.id.id_expand_collapse)).perform(click());

        Thread.sleep(500); // Wait for 500ms to ensure the view is fully expanded

        // Verify that the user is navigated to the property details section
        onView(withText("Read More…")).check(matches(withText("Read More…")));
    }
}