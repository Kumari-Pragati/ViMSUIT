package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.AppCompatImageButton;
import org.junit.Rule;
import org.junit.Test;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;

public class Test_1303_130306 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUsabilityNavigatingBackToThePreviousScreen throws InterruptedException {
        // Step 2: Navigate to the 'Select City' screen (Assuming SelectCityActivity is launched)
        // This step might require additional logic or intent to navigate to the correct screen.
        
        // Step 3: Tap on the back arrow in the header
        Thread.sleep(500);
        onView(withContentDescription("Navigate up")).perform(click());
        
        // Step 4: Verify that you are navigated back to the previous screen (Assuming MainActivity is the previous screen)
        Thread.sleep(500);
        onView(withId(R.id.main_activity_content)).check(matches(isDisplayed()));
    }
}