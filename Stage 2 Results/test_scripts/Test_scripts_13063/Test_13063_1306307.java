package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.filters.LargeTest;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class Test_13063_1306307 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testSelectANonexistentLanguage() throws InterruptedException {
        // Thread.sleep(500) to ensure the UI is fully loaded before interacting with it.
        Thread.sleep(500);

        // Step 2: Navigate to the language selection screen (assuming there's a button or action that opens this screen)
        Espresso.onView(withText("Languages")).perform(click());

        // Step 3: Tap on the 'Portuguese' list row
        Thread.sleep(500);
        Espresso.onView(withId(R.id.id_language_option)).perform(click());

        // Step 4: Verify that 'Portuguese' is not selected as the active language
        Thread.sleep(500);
        Espresso.onView(withText("Portuguese")).check(ViewAssertions.doesNotExist());
    }
}