package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.AppCompatImageButton;
import org.junit.Rule;
import org.junit.Test;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;

public class Test_16566_16566008 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheManuallyButtonIsClickableWhenTheAppIsInTheForeground() throws InterruptedException {
        // Step 1: Open the app and navigate to the home page.
        
        // Step 2: Click on the 'MANUALLY' button.
        onView(withContentDescription("['Navigate up']")).perform(click());
        Thread.sleep(500); // Wait for 500ms
        
        // Step 3: Verify the 'MANUALLY' button is clickable when the app is in the foreground.
        onView(withContentDescription("['Navigate up']")).check(isClickable());
    }
}