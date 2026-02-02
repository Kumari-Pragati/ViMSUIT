package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_11730_11730003 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUserCanViewTheEnglishTranslationOfThePhraseCommentVastu() throws InterruptedException {
        // Wait for the view to be ready
        Thread.sleep(500);

        // Observe the English translation 'How are you?' displayed below the French phrase
        onView(withId(R.id.id_fragment_viewpager_exercise))
                .check(matches(isDisplayed()));

        // Add a sleep to ensure the UI is updated before proceeding
        Thread.sleep(500);

        // Assert that the text "How are you?" is visible
        onView(ViewMatchers.withText("How are you?"))
                .check(matches(isDisplayed()));
    }
}