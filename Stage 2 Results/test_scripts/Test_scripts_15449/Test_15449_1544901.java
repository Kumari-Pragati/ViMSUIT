package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_15449_1544901 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testOpenTheAppAndNavigateToTheBookOfMormonChapter() throws InterruptedException {
        // Step 1: Open the app (already done by ActivityTestRule)

        // Step 2: Navigate to the Book of Mormon section
        onView(withId(R.id.id_main_page_menu_btn)).perform(click());
        Thread.sleep(500);

        // Step 3: Select chapter 7
        onView(withText("Book of Mormon")).perform(click());
        Thread.sleep(500);
        onView(withText("Chapter 7")).perform(click());
        Thread.sleep(500);

        // Expected Result: The screen should display the text of chapter 7 from the Book of Mormon
        onView(withId(R.id.chapter_text_view)).check(matches(withText("Chapter 7")));
    }
}