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

import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;

@RunWith(AndroidJUnit4.class)
public class Test_1281_1281008 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheShareFunctionality() throws InterruptedException {
        // Open the product detail page for 'Harry Potter and the Cursed Child - Parts One and Two: The Official Script Book of the Original West End Production Special Rehearsals.'
        Espresso.onView(ViewMatchers.withText("Harry Potter and the Cursed Child - Parts One and Two: The Official Script Book of the Original West End Production Special Rehearsals")).perform(ViewActions.click());

        // Click on the share icon in the header/App Bar
        Thread.sleep(500);
        Espresso.onView(withContentDescription("[None]")).perform(ViewActions.click());

        // Verify that the share options are displayed correctly
        Thread.sleep(500);
        Espresso.onView(isDisplayed()).inRoot(isDialog()).check(ViewAssertions.matches(isDisplayed()));
    }
}