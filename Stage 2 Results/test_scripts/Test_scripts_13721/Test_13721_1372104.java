package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static org.hamcrest.Matchers.allOf;

@RunWith(AndroidJUnit4.class)
public class Test_13721_1372104 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(5, java.util.concurrent.TimeUnit.SECONDS);

    @Test
    public void testUsabilityNavigation() throws InterruptedException {
        // Step 1: Open the app and navigate to the menu.
        
        // Step 2: Locate and tap on the menu icon in the header.
        onView(allOf(withContentDescription("Open menu"))).perform(click());
        Thread.sleep(500);

        // Step 3: Locate and tap on the option to share access with family members or helpers.
        // Assuming the resource ID for "share access" is R.id.share_access
        onView(allOf(withId(R.id.share_access))).perform(click());
        Thread.sleep(500);

        // Step 4: Navigate back to the previous screen.
        Espresso.pressBack();
        Thread.sleep(500);

        // Assertion: The app navigates back to the previous screen correctly.
        onView(withContentDescription("Open menu")).check(matches(isDisplayed()));
    }
}