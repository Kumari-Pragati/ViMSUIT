package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.CoreMatchers.not;

@RunWith(AndroidJUnit4.class)
public class Test_18817_18817006 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowEmptyEmail() throws InterruptedException {
        // Element 1: withId(R.id.id_previousButton)
        onView(withId(R.id.id_previousButton)).perform(click());
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("Email is required")).check(matches(not(ViewMatchers.isNull())));

        // Element 2: withId(R.id.id_sendButton)
        onView(withId(R.id.id_sendButton)).perform(click());
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("Email is required")).check(matches(not(ViewMatchers.isNull())));

        // Element 3: withContentDescription("['Navigate up']")
        onView(withContentDescription("[None]")).perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("Email is required")).check(matches(not(ViewMatchers.isNull())));

        // Element 4: withContentDescription("[None]")
        onView(withContentDescription("[None]")).perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("Email is required")).check(matches(not(ViewMatchers.isNull())));

        // Element 5: withContentDescription("[None]")
        onView(withContentDescription("[None]")).perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("Email is required")).check(matches(not(ViewMatchers.isNull())));

        // Element 6: withContentDescription("[None]")
        onView(withContentDescription("[None]")).perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("Email is required")).check(matches(not(ViewMatchers.isNull())));
    }
}