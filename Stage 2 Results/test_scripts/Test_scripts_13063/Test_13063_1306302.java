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
public class Test_13063_1306302 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testSelectGermanAsTheLanguage() throws InterruptedException {
        // Thread.sleep(500) to ensure the UI is fully loaded before interacting with it
        Thread.sleep(500);

        // Step 2: Navigate to the language selection screen (assuming there's a way to navigate here)
        onView(withId(R.id.language_selection_screen)).perform(click());

        // Step 3: Tap on the 'German' list row
        Thread.sleep(500);
        onView(withText("German")).perform(click());

        // Step 4: Verify that 'German' is selected as the active language
        Thread.sleep(500);
        onView(withId(R.id.id_language_option)).check(matches(withText("German")));
    }
}