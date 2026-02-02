package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.AppCompatImageView;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;

@RunWith(JUnit4.class)
public class Test_1281_1281004 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheBookImage() throws InterruptedException {
        // Open the product detail page for 'Harry Potter and the Cursed Child - Parts One and Two: The Official Script Book of the Original West End Production Special Rehearsals.'
        onView(ViewMatchers.withText("Harry Potter and the Cursed Child - Parts One and Two: The Official Script Book of the Original West End Production Special Rehearsals")).perform(ViewActions.click());
        
        // Wait for 500ms
        Thread.sleep(500);
        
        // Verify that the book image is displayed correctly
        onView(withContentDescription("[None]")).check(matches(isDisplayed()));
    }
}