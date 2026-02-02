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
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_14952_1495207 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUsabilityTestAgeSelectionFlow() throws InterruptedException {
        // Step 1: Open the app and navigate to the onboarding screen.
        // Assuming the onboarding screen is already shown when the app starts.

        // Step 2: Select an age group in the 'Male' section.
        onView(withText("Male")).perform(click());
        Thread.sleep(500);

        // Step 3: Select an age group in the 'Female' section.
        onView(withText("Female")).perform(click());
        Thread.sleep(500);

        // Step 4: Click on the 'SKIP' button at the bottom.
        onView(withId(R.id.id_next_btn)).perform(click());
        Thread.sleep(500);

        // Expected Result: The app should proceed to the next onboarding screen smoothly.
        // Assuming there is a view or text that indicates we are in the correct screen
        onView(withText("Next Screen Title")).check(matches(isDisplayed()));
    }
}