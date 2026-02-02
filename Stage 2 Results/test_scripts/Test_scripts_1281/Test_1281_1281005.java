package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.matcher.ViewMatchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;

public class Test_1281_1281005 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(30000); // Set a longer timeout for the test

    @Test
    public void testCheckTheStatusBarIcons() throws InterruptedException {
        // Open the product detail page (assuming this step is handled by navigating to the correct activity)
        
        Thread.sleep(500); // Wait for 500ms before proceeding
        
        // Verify that the status bar icons are displayed correctly
        onView(withContentDescription("[None]")).check(matches(isDisplayed()));
    }
}
```

Note: The `MainActivity` class should be replaced with the actual main activity of your application. Additionally, ensure that the product detail page is navigated to properly before running this test case.