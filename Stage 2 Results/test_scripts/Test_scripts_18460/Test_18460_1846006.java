package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
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
public class Test_18460_1846006 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class, true, false);

    @Rule
    public Timeout timeout = new Timeout(5000); // 5 seconds

    @Test
    public void testNegativeFlowSelectIExerciseRegularlyAndThenSelectConsiderMeANewbie throws InterruptedException {
        // Step 1: Click on the 'I exercise regularly' option.
        onView(withId(R.id.id_active_regularly_button)).perform(click());
        Thread.sleep(500);

        // Step 2: Click on the 'NEXT >' button.
        onView(withText("NEXT >")).perform(click());
        Thread.sleep(500);

        // Step 3: Click on the 'Consider me a newbie' option.
        onView(withId(R.id.id_newbie_button)).perform(click());
        Thread.sleep(500);

        // Step 4: Click on the 'NEXT >' button.
        onView(withText("NEXT >")).perform(click());
        Thread.sleep(500);

        // Expected Result: The user should be directed to the next step of the fitness assessment process.
        onView(withId(R.id.next_step)).check(matches(withText("Next Step"))); // Assuming "Next Step" is the text for the next screen
    }
}