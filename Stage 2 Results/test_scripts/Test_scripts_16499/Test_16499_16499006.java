package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.ImageButton;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(JUnit4.class)
public class Test_16499_16499006 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUserCanNavigateBackToTheChapterListAfterReadingAChapter() throws InterruptedException {
        // Step 1: Open the app and navigate to the manga '俺のメンタルは限界です' by 藤アイリ.
        onView(withText("俺のメンタルは限界です")).perform(click());

        // Step 2: Click on the '話一覧' (Chapter List) tab.
        Thread.sleep(500);
        onView(withId(R.id.chapter_list_tab)).perform(click());

        // Step 3: Click on the '今すぐ読めます!' (Read Now!) button for the first chapter.
        Thread.sleep(500);
        onView(withText("今すぐ読めます!")).perform(click());

        // Step 4: Navigate back to the chapter list page.
        Thread.sleep(500);
        onView(withId(R.id.navigate_up)).perform(click());

        // Expected Result: The user should be back on the chapter list page for the manga '俺のメンタルは限界です'.
        Thread.sleep(500);
        onView(withText("話一覧")).check(matches(isDisplayed()));
    }
}