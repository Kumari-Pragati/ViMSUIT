package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_1868_1868004 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testEnsureTheProgressIndicatorRemainsWhenTheIncorrectAnswerIsSubmitted() throws InterruptedException {
        // Test each element
        onView(withId(R.id.id_ibMute))
                .perform(click());
        Thread.sleep(500);
        verifyElementState(isDisplayed());

        onView(withId(R.id.id_btn1))
                .perform(click());
        Thread.sleep(500);
        verifyElementState(isDisplayed());

        onView(withId(R.id.id_btn2))
                .perform(click());
        Thread.sleep(500);
        verifyElementState(isDisplayed());

        onView(withId(R.id.id_btn3))
                .perform(click());
        Thread.sleep(500);
        verifyElementState(isDisplayed());

        onView(withId(R.id.id_btn4))
                .perform(click());
        Thread.sleep(500);
        verifyElementState(isDisplayed());

        onView(withId(R.id.id_btn5))
                .perform(click());
        Thread.sleep(500);
        verifyElementState(isDisplayed());

        onView(withId(R.id.id_ibDelete))
                .perform(click());
        Thread.sleep(500);
        verifyElementState(isDisplayed());

        onView(withId(R.id.id_btn6))
                .perform(click());
        Thread.sleep(500);
        verifyElementState(isDisplayed());

        onView(withId(R.id.id_btn7))
                .perform(click());
        Thread.sleep(500);
        verifyElementState(isDisplayed());

        onView(withId(R.id.id_btn8))
                .perform(click());
        Thread.sleep(500);
        verifyElementState(isDisplayed());

        onView(withId(R.id.id_btn9))
                .perform(click());
        Thread.sleep(500);
        verifyElementState(isDisplayed());

        onView(withId(R.id.id_btn0))
                .perform(click());
        Thread.sleep(500);
        verifyElementState(isDisplayed());

        onView(withId(R.id.id_ibAnswer))
                .perform(click());
        Thread.sleep(500);
        verifyProgressIndicator();
    }

    private void verifyElementState(final Matcher<View> matcher) {
        onView(matcher).check(matches(isDisplayed()));
    }

    private void verifyProgressIndicator() {
        Espresso.onIdle();
        // Assuming the progress indicator is a view with id R.id.progress_indicator
        onView(withId(R.id.progress_indicator)).check(matches(isDisplayed()));
    }
}