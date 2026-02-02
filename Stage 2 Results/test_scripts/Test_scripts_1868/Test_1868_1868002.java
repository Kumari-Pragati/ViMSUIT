package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

@RunWith(AndroidJUnit4.class)
public class Test_1868_1868002 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testSolveTheMathProblemIncorrectlyToEnsureTheAlarmRemains() throws InterruptedException {
        // Test each element
        onView(withId(R.id.id_ibMute))
                .perform(click());
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("Mute"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        onView(withId(R.id.id_btn1))
                .perform(click());
        Thread.sleep(500);

        onView(withId(R.id.id_btn5))
                .perform(click());
        Thread.sleep(500);

        onView(withId(R.id.id_btn2))
                .perform(click());
        Thread.sleep(500);

        onView(withId(R.id.id_btn3))
                .perform(click());
        Thread.sleep(500);

        onView(withId(R.id.id_btn4))
                .perform(click());
        Thread.sleep(500);

        onView(withId(R.id.id_btn5))
                .perform(click());
        Thread.sleep(500);

        onView(withId(R.id.id_btn6))
                .perform(click());
        Thread.sleep(500);

        onView(withId(R.id.id_btn7))
                .perform(click());
        Thread.sleep(500);

        onView(withId(R.id.id_btn8))
                .perform(click());
        Thread.sleep(500);

        onView(withId(R.id.id_btn9))
                .perform(click());
        Thread.sleep(500);

        onView(withId(R.id.id_btn0))
                .perform(click());
        Thread.sleep(500);

        onView(withId(R.id.id_ibAnswer))
                .perform(ViewActions.click());
        Thread.sleep(500);

        // Verify state
        Espresso.onView(ViewMatchers.withText("Incorrect"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}