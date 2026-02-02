package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.ListView;

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
public class Test_10128_10128003 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testSelectAnArticleFromTheKnowledgeBase() throws InterruptedException {
        // Open the Help section.
        onView(withText("Help")).perform(click());
        Thread.sleep(500);

        // Navigate to the 'Knowledge Base' section.
        onView(withContentDescription("[None]")).perform(click());
        Thread.sleep(500);

        // Select an article from the 'Locations' category.
        // Assuming there is a ListView with id R.id.list and we select the first item in Locations category
        onView(withId(R.id.list)).perform(ViewActions.scrollToPosition(1)); // Scroll to second position (index 1)
        Thread.sleep(500);
        onView(withText("Locations")).perform(click());
        Thread.sleep(500);

        // Verify that the selected article is displayed.
        onView(withText("Article from Locations category")).check(matches(isDisplayed()));
    }
}