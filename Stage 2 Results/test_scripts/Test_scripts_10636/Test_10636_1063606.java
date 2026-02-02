package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.TextView;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class Test_10636_1063606 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickOnTheHeadlineArsenalDrawnAgainstBayernMunichInLast() throws InterruptedException {
        // Step 1: Tap on the headline 'Arsenal drawn against Bayern Munich in last 16'
        Thread.sleep(500);
        onView(withId(R.id.id_recyclerview)).perform(click());

        // Expected Result: A detailed article about the Champions League draw is displayed
        Thread.sleep(500);
        Espresso.onView(withText("Arsenal drawn against Bayern Munich in last 16"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        Thread.sleep(500);
        Espresso.onView(withId(R.id.article_content))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}