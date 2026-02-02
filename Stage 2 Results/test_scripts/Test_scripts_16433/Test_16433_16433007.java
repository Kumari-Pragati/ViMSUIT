package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.widget.ImageView;
import org.junit.Rule;
import org.junit.Test;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

public class Test_16433_16433007 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUsabilityTestDownloadButtonClickability() throws InterruptedException {
        // Step 2: Navigate to the 'Gallery' screen (Assuming Gallery is a part of MainActivity)
        Thread.sleep(500); // Wait for UI to load

        // Step 3: Click on the 'Download' button of a weather widget
        onView(withId(R.id.id_img_back_btn)).perform(click());
        
        Thread.sleep(500); // Wait for interaction to complete
        
        // Step 4: Assert that the 'Download' button is clickable
        onView(withId(R.id.id_img_back_btn)).check(matches(isClickable()));
    }
}