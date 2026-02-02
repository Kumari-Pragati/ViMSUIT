package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.ImageButton;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(JUnit4.class)
public class Test_10522_1052209 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testInputTextUsingTheTextTool throws InterruptedException {
        // Step 1: Click on the text tool
        onView(withId(R.id.id_colorBt)).perform(click());
        Thread.sleep(500); // Wait for UI to update

        // Step 2: Click on the image to place the text
        ImageButton imageButton = activityRule.getActivity().findViewById(R.id.id_colorBt);
        imageButton.perform(ViewActions.click());
        Thread.sleep(500); // Wait for UI to update

        // Step 3: Input the text 'Happy Birthday!'
        onView(withId(R.id.id_colorBt)).perform(ViewActions.typeText("Happy Birthday!"));
        Thread.sleep(500); // Wait for UI to update

        // Expected Result: The text 'Happy Birthday!' should be displayed on the image
        onView(withText("Happy Birthday!")).inRoot(isToast()).check(matches(isDisplayed()));
    }
}