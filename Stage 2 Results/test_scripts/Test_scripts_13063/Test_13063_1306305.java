package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import static android.support.test.espresso.Espresso.*;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_13063_1306305 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testSelectJapaneseAsTheLanguage() throws InterruptedException {
        // Navigate to the language selection screen (assuming it's a separate activity or fragment)
        Thread.sleep(500); // Wait for UI to load

        // Tap on the 'Japanese' list row
        onView(withId(R.id.id_language_option)).perform(click());
        Thread.sleep(500); // Wait for the selection to take effect

        // Verify that 'Japanese' is selected as the active language
        onView(withText("Japanese")).check(matches(isDisplayed()));
    }
}