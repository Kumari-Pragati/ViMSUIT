package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.TimePicker;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.RootMatchers.withDecorView;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.allOf;

@RunWith(JUnit4.class)
public class Test_13696_13696002 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowInvalidDateSelection() throws InterruptedException {
        // Step 1: Open the app and navigate to the mood logging screen.
        onView(withId(R.id.id_module_tracking_edit_date)).perform(click());

        // Step 2: Select an invalid date using the date picker.
        Thread.sleep(500);
        Espresso.closeSoftKeyboard();
        onView(allOf(withClassName(is(TimePicker.class.getName())), isDisplayed())).perform(ViewActions.swipeLeft());
        Thread.sleep(500);

        // Step 3: Select a time using the time picker.
        Thread.sleep(500);
        onView(withId(android.R.id.hour)).perform(ViewActions.click());
        Thread.sleep(500);
        onView(allOf(withClassName(is("android.widget.NumberPicker")), isDisplayed())).perform(ViewActions.scrollToIndex(2), ViewActions.click());
        Thread.sleep(500);
        Espresso.closeSoftKeyboard();
        onView(withId(android.R.id.minute)).perform(ViewActions.click());
        Thread.sleep(500);
        onView(allOf(withClassName(is("android.widget.NumberPicker")), isDisplayed())).perform(ViewActions.scrollToIndex(3), ViewActions.click());

        // Step 4: Tap the checkmark (✓) button.
        Thread.sleep(500);
        onView(withId(R.id.id_module_tracking_save)).perform(click());

        // Expected Result: The app should display an error message indicating an invalid date selection.
        Thread.sleep(500);
        onView(allOf(withText("Invalid Date"), isDisplayed())).inRoot(withDecorView(not(activityRule.getActivity().getWindow().getDecorView()))).check(ViewAssertions.matches(isDisplayed()));
    }
}