package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.EditText;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.*;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.*;
import static org.hamcrest.Matchers.allOf;

@RunWith(AndroidJUnit4.class)
public class Test_10482_1048207 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testDataPersistence() throws InterruptedException {
        // Navigate to the 'Phone for Checkout' screen and enter a valid phone number
        onView(withId(R.id.id_drawer_layout)).perform(click());
        Thread.sleep(500);
        onView(withContentDescription("['Navigate up']")).perform(click());
        Thread.sleep(500);

        onView(withId(R.id.id_editTextField)).perform(typeText("123-456-7890"));
        Thread.sleep(500);

        // Navigate to the home screen
        onView(withId(R.id.id_drawer_layout)).perform(click());
        Thread.sleep(500);
        onView(withContentDescription("['Navigate up']")).perform(click());
        Thread.sleep(500);

        // Return to the 'Phone for Checkout' screen and verify phone number is still present
        onView(withId(R.id.id_drawer_layout)).perform(click());
        Thread.sleep(500);
        onView(withContentDescription("['Navigate up']")).perform(click());
        Thread.sleep(500);

        onView(withId(R.id.id_editTextField)).check(matches(withText("123-456-7890")));

        // Test withId(R.id.id_drawer_layout)
        onView(withId(R.id.id_drawer_layout)).perform(click());
        Thread.sleep(500);
        onView(withContentDescription("['Navigate up']")).perform(click());
        Thread.sleep(500);

        // Test withId(R.id.id_scrollView1)
        onView(withId(R.id.id_scrollView1)).perform(click());
        Thread.sleep(500);
        onView(withContentDescription("['Navigate up']")).perform(click());
        Thread.sleep(500);

        // Test withId(R.id.id_editTextField) - already tested above

        // Test withContentDescription("['Navigate up']")
        onView(withContentDescription("['Navigate up']")).perform(click());
        Thread.sleep(500);
    }
}