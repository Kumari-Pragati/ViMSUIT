package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.AppCompatImageButton;
import org.junit.Rule;
import org.junit.Test;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;

public class Test_16566_16566003 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheAutomaticallyButtonIsFunctional() throws InterruptedException {
        // Step 1: Open the app and navigate to the home page.
        
        // Step 2: Click on the 'AUTOMATICALLY' button.
        Thread.sleep(500);
        onView(withContentDescription("['Navigate up']")).perform(click());
        
        // Step 3: Verify the app navigates to the automatic book addition screen.
        Thread.sleep(500);
        onView(withId(R.id.automatic_book_addition_screen)).check(matches(isDisplayed()));
    }
}