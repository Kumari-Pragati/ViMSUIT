package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;

@RunWith(AndroidJUnit4.class)
public class Test_16499_16499007 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUserCanResumeReadingAChapterAfterInterruption() throws InterruptedException {
        // Open the app and navigate to the manga '俺のメンタルは限界です' by 藤アイリ.
        onView(withText("俺のメンタルは限界です")).perform(click());
        Thread.sleep(500);

        // Click on the '話一覧' (Chapter List) tab.
        onView(withContentDescription("['Navigate up']")).perform(click());
        Thread.sleep(500);
        onView(withText("話一覧")).check(matches(isDisplayed()));
        Thread.sleep(500);

        // Click on the '今すぐ読めます!' (Read Now!) button for the first chapter.
        onView(withContentDescription("['More options']")).perform(click());
        Thread.sleep(500);
        onView(withText("今すぐ読めます!")).check(matches(isDisplayed()));
        Thread.sleep(500);

        // Pause the reading session.
        Espresso.pressBack();
        Thread.sleep(500);

        // Resume the reading session.
        onView(withContentDescription("['Navigate up']")).perform(click());
        Thread.sleep(500);
        onView(withText("話一覧")).check(matches(isDisplayed()));
        Thread.sleep(500);
        Espresso.pressBack();
        Thread.sleep(500);

        // Verify state
        onView(withText("今すぐ読めます!")).check(matches(isDisplayed()));

        // Test each element
        for (int i = 1; i <= 2; i++) {
            if (i == 1) {
                // Element 1: withContentDescription("['Navigate up']")
                onView(withContentDescription("['Navigate up']")).perform(click());
                Thread.sleep(500);
                // Verify state
                onView(withText("話一覧")).check(matches(isDisplayed()));
            } else if (i == 2) {
                // Element 2: withContentDescription("['More options']")
                onView(withContentDescription("['More options']")).perform(click());
                Thread.sleep(500);
                // Verify state
                onView(withText("今すぐ読めます!")).check(matches(isDisplayed()));
            }
        }

        // Resume the reading session after navigating back to the chapter list.
        Espresso.pressBack();
        Thread.sleep(500);
        onView(withContentDescription("['Navigate up']")).perform(click());
        Thread.sleep(500);
        onView(withText("話一覧")).check(matches(isDisplayed()));
        Thread.sleep(500);

        // Verify the user can resume reading from where they left off.
        Espresso.pressBack();
        Thread.sleep(500);
        onView(withText("今すぐ読めます!")).check(matches(isDisplayed()));
    }
}