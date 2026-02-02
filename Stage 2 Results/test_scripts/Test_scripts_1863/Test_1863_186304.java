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

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.allOf;

@RunWith(AndroidJUnit4.class)
public class Test_1863_186304 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheSubtitleTrainsYourAttentionPerceptionAbilityAndTheOverallWorkOfYourBrain() throws InterruptedException {
        // Open the app and navigate to the screen with the subtitle 'Trains your attention, perception ability and the overall work of your brain'
        
        // Verify the subtitle is visible
        onView(allOf(withId(R.id.id_subtitle), hasDescendant("Trains your attention, perception ability and the overall work of your brain")))
                .check(matches(ViewMatchers.isDisplayed()));

        // Test each element
        onView(withId(R.id.id_showHintsButton))
                .perform(click());
        Thread.sleep(500);
        // Verify state
        onView(allOf(withId(R.id.id_subtitle), hasDescendant("Trains your attention, perception ability and the overall work of your brain")))
                .check(matches(ViewMatchers.isDisplayed()));

        onView(withId(R.id.id_hintStartButton))
                .perform(click());
        Thread.sleep(500);
        // Verify state
        onView(allOf(withId(R.id.id_subtitle), hasDescendant("Trains your attention, perception ability and the overall work of your brain")))
                .check(matches(ViewMatchers.isDisplayed()));

        Espresso.pressBack();
        Thread.sleep(500);

        onView(withContentDescription("['Navigate up']"))
                .perform(click());
        Thread.sleep(500);
        // Verify state
        onView(allOf(withId(R.id.id_subtitle), hasDescendant("Trains your attention, perception ability and the overall work of your brain")))
                .check(matches(ViewMatchers.isDisplayed()));
    }
}