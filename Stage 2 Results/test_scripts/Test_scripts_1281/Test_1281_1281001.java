package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.TextView;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_1281_1281001 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testOpenTheProductDetailPageForHarryPotterAndTheCursedChildPartsOneAndTwoTheOfficialScriptBookOfTheOriginalWestEndProductionSpecialRehearsals() throws InterruptedException {
        // Step 1: Open the app (Assuming it's already open, or this step is handled by ActivityTestRule)

        // Step 2: Navigate to the product detail page
        Thread.sleep(500); // Wait for UI to stabilize

        onView(withContentDescription("Search")).perform(click());
        Thread.sleep(500);

        // Assuming there's a TextView with the book title in the product detail page
        onView(withId(R.id.product_title)).check(matches(withText("Harry Potter and the Cursed Child - Parts One and Two: The Official Script Book of the Original West End Production Special Rehearsals")));
    }
}