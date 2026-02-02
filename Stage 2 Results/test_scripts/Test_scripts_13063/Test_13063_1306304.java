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
public class Test_13063_1306304 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testSelectItalianAsTheLanguage() throws InterruptedException {
        // Thread.sleep(500) to ensure the UI is fully loaded before interacting with it
        Thread.sleep(500);

        // Step 2: Navigate to the language selection screen (assuming there's a button or action that opens this screen)
        onView(withText("Languages")).perform(click());

        // Step 3: Tap on the 'Italian' list row
        Thread.sleep(500);
        onView(withId(R.id.id_language_option)).perform(click());

        // Step 4: Verify that 'Italian' is selected as the active language
        Thread.sleep(500);
        onView(withText("Italian")).check(matches(withText("Italian")));
    }
}