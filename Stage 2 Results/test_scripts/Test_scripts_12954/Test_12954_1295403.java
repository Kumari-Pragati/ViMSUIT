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
import static androidx.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_12954_1295403 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testAddANewImportedAddress() throws InterruptedException {
        // Open the 'Addresses' screen.
        onView(withContentDescription("Navigate up")).perform(click());
        Thread.sleep(500); // Wait for UI to update

        // Click on the plus icon under the 'Imported Addresses' section.
        onView(withId(R.id.import_address_plus_icon)).perform(click());
        Thread.sleep(500); // Wait for UI to update

        // A new imported address creation form is displayed.
        onView(withId(R.id.import_address_form)).check(matches(isDisplayed()));
    }
}