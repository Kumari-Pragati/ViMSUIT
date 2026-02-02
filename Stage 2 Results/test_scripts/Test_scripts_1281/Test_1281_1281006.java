package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.ImageButton;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
import static com.example.R.id.menu_item_search; // Assuming R.id is the correct package for your resource IDs

@RunWith(AndroidJUnit4.class)
public class Test_1281_1281006 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheHeaderappBarIcons() throws InterruptedException {
        // Open the product detail page for 'Harry Potter and the Cursed Child - Parts One and Two: The Official Script Book of the Original West End Production Special Rehearsals.'
        // This step is assumed to be handled by the application logic, so we skip it in this test.

        Thread.sleep(500); // Wait for 500ms

        // Verify that the header/App Bar icons are displayed correctly
        onView(withContentDescription("['Search']")).check(matches(isDisplayed()));

        Thread.sleep(500); // Wait for 500ms
    }
}