package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.filters.LargeTest;
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
@LargeTest
public class Test_15449_1544906 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class, true, false);

    @Rule
    public Timeout timeout = new Timeout(30000); // 30 seconds

    @Test
    public void testCheckIfTheTextOfTheBiblicalPassageIsDisplayedCorrectly() throws InterruptedException {
        // Open the app (already done by ActivityTestRule)

        // Navigate to the Book of Mormon section
        onView(withText("Book of Mormon")).perform(click());
        Thread.sleep(500);

        // Select chapter 7
        onView(withText("Chapter 7")).perform(click());
        Thread.sleep(500);

        // Verify that the text of the biblical passage is displayed correctly
        onView(withId(R.id.id_lvData)).check(matches(withText("Thou shalt not steal; and that which thou hast given in trust, thou shalt bring again to him to whom it belongs.")));
    }
}