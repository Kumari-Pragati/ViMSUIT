package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import static android.support.test.espresso.Espresso.*;
import static android.support.test.espresso.matcher.ViewMatchers.*;

@RunWith(AndroidJUnit4.class)
public class Test_13063_1306303 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testSelectFrenchAsTheLanguage() throws InterruptedException {
        // Navigate to the language selection screen (assuming it's the first screen)
        Thread.sleep(500); // Wait for UI initialization

        // Tap on the 'French' list row
        onView(withId(R.id.id_language_option)).perform(click());
        Thread.sleep(500); // Wait for the selection to take effect

        // Verify that 'French' is selected as the active language
        onView(withId(R.id.id_language_option)).check(matches(withText("French")));
    }
}