package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.AppCompatImageView;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.allOf;

@RunWith(AndroidJUnit4.class)
public class Test_1281_1281002 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheTitleAndSubtitleOfTheProductDetailPage() throws InterruptedException {
        // Step 1: Open the product detail page for 'Harry Potter and the Cursed Child - Parts One and Two: The Official Script Book of the Original West End Production Special Rehearsals.'
        onView(allOf(withContentDescription("[None]"), isDisplayed())).perform(click());
        Thread.sleep(500);

        // Step 2: Verify that the title and subtitle match the expected values.
        String expectedTitle = "Harry Potter and the Cursed Child - Parts One and Two: The Official Script Book of the Original West End Production Special Rehearsals";
        String expectedSubtitle = "The Official Script Book of the Original West End Production";

        // Assuming there are TextViews with ids for title and subtitle
        onView(withText(expectedTitle)).check(matches(isDisplayed()));
        Thread.sleep(500);

        onView(withText(expectedSubtitle)).check(matches(isDisplayed()));

        // Additional assertion to ensure both views are clickable if needed
        onView(allOf(withContentDescription("[None]"), isDisplayed())).perform(click());
    }
}