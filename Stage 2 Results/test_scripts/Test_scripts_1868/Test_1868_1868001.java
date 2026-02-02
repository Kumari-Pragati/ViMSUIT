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

@RunWith(AndroidJUnit4.class)
public class Test_1868_1868001 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testSolveTheMathProblemCorrectlyToDismissTheAlarm() throws InterruptedException {
        // Test each element
        onView(withId(R.id.id_ibMute))
                .perform(click());
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("1"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        onView(withId(R.id.id_btn1))
                .perform(click());
        Thread.sleep(500);

        onView(withId(R.id.id_btn5))
                .perform(click());
        Thread.sleep(500);

        Espresso.onView(ViewMatchers.withText("5"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        onView(withId(R.id.id_btn2))
                .perform(click());
        Thread.sleep(500);

        onView(withId(R.id.id_btn3))
                .perform(click());
        Thread.sleep(500);

        Espresso.onView(ViewMatchers.withText("2"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        onView(withId(R.id.id_btn4))
                .perform(click());
        Thread.sleep(500);

        onView(withId(R.id.id_btn6))
                .perform(click());
        Thread.sleep(500);

        Espresso.onView(ViewMatchers.withText("3"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        onView(withId(R.id.id_btn7))
                .perform(click());
        Thread.sleep(500);

        onView(withId(R.id.id_btn8))
                .perform(click());
        Thread.sleep(500);

        Espresso.onView(ViewMatchers.withText("2"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        onView(withId(R.id.id_btn9))
                .perform(click());
        Thread.sleep(500);

        Espresso.onView(ViewMatchers.withText("3"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        onView(withId(R.id.id_btn0))
                .perform(click());
        Thread.sleep(500);

        Espresso.onView(ViewMatchers.withText("+"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        onView(withId(R.id.id_ibAnswer))
                .perform(click());
        Thread.sleep(500);

        // Verify the progress indicator and alarm dismissal
        Espresso.onView(ViewMatchers.withText("Progress Indicator"))
                .check(ViewAssertions.doesNotExist());

        Espresso.onView(ViewMatchers.withText("Alarm Dismissed"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}