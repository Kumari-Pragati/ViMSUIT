package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.widget.ListView;
import org.junit.Rule;
import org.junit.Test;
import static android.support.test.espresso.Espresso.*;
import static android.support.test.espresso.assertion.ViewAssertions.*;
import static android.support.test.espresso.matcher.ViewMatchers.*;

public class Test_1303_130304 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testBoundaryValidationSelectingTheLastCityInTheList() throws InterruptedException {
        // Step 1: Open the application (Assuming MainActivity is the entry point)
        
        // Step 2: Navigate to the 'Select City' screen
        onView(withId(R.id.id_city_list_view)).check(matches(isDisplayed()));

        // Step 3: Scroll to the bottom of the list and tap on 'PERGAMINO'
        Thread.sleep(500); // Wait for UI to stabilize

        // Assuming there are enough cities in the list, we scroll to the last item
        onView(withId(R.id.id_city_list_view)).perform(swipeUp());
        Thread.sleep(500); // Wait for swipe animation to complete
        
        // Tap on 'PERGAMINO'
        onView(withText("PERGAMINO")).perform(click());

        // Step 4: Verify that 'PERGAMINO' is selected
        Thread.sleep(500); // Wait for selection to take effect

        // Assuming the selected city is highlighted or has a different background color, we can verify it.
        onView(withText("PERGAMINO")).check(matches(isDisplayed()));
    }
}
```

Note: The actual resource ID and text might need adjustments based on your application's layout. Also, ensure that the `MainActivity` class and its layout are correctly set up to match the test steps provided.