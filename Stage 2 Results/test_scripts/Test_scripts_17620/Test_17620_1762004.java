package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.matcher.ViewMatchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;

public class Test_17620_1762004 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testCheckIfTheScreenIsUsable throws InterruptedException {
        // Step 1: Open the NextRadio app (assumed to be done by ActivityTestRule)
        
        // Step 2: Navigate to the screen displaying the informational message about FM radio unavailability
        // Assuming this step is handled within the MainActivity or a specific fragment

        // Step 3: Perform usability checks on the screen
        Thread.sleep(500); // Wait for UI to stabilize
        
        // Check if the image view is clickable (usability check)
        onView(withId(R.id.id_imageView1)).check(matches(isClickable()));
        
        // Additional assertions can be added here based on other UI elements or behaviors
    }
}
```

Note: The `MainActivity` class and any necessary setup for navigating to the specific screen are assumed to be in place. If additional steps are required, such as handling navigation within the app, those should be implemented accordingly.