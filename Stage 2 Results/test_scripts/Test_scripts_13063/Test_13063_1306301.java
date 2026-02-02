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
public class Test_13063_1306301 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testSelectSpanishAsTheLanguage() throws InterruptedException {
        // Navigate to the language selection screen (assuming it's the first screen)
        Thread.sleep(500); // Wait for 500ms

        // Tap on the 'Spanish' list row
        onView(withId(R.id.id_language_option)).perform(click());
        Thread.sleep(500); // Wait for 500ms

        // Verify that 'Spanish' is selected as the active language
        onView(withText("Spanish")).check(matches(withText("Spanish")));
    }
}