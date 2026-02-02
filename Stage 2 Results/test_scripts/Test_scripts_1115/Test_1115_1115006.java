package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.widget.ImageButton;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static org.hamcrest.Matchers.allOf;

@RunWith(JUnit4.class)
public class Test_1115_1115006 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testHeaderBackArrowShouldBeClickable() throws InterruptedException {
        // Wait for the view to be available and then click on it
        Thread.sleep(500);
        onView(allOf(withContentDescription("Navigate up"), isAssignableFrom(ImageButton.class)))
                .perform(ViewActions.click());

        // Wait for a short period before checking the result
        Thread.sleep(500);

        // Assert that the back arrow was clickable and performed its action (e.g., navigating back)
        Espresso.pressBack();
        Espresso.onView(withContentDescription("Navigate up")).check(matches(isDisplayed()));
    }
}