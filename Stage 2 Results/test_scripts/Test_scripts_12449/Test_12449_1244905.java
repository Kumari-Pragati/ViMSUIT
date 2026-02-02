package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.RecyclerView;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

@RunWith(AndroidJUnit4.class)
public class Test_12449_1244905 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testAccessibilityEnsuringTheOkButtonIsAccessible throws InterruptedException {
        // Step 1: Open the app and navigate to the search functionality
        Espresso.onView(withId(R.id.id_countries_list)).perform(ViewActions.click());

        // Step 2: Tap on the 'Choose country to search in' header (assuming it's a header within RecyclerView)
        Thread.sleep(500);

        // Step 3: Ensure the 'OK' button is accessible
        Espresso.onView(withId(R.id.id_countries_list))
                .check(ViewAssertions.matches(ViewMatchers.isClickable()))
                .perform(ViewActions.click());

        // Step 4: Tap the 'OK' button to confirm the selection
        Thread.sleep(500);

        // Assuming there's an OK button within the RecyclerView, we need to find it and click it.
        Espresso.onView(withId(R.id.ok_button)) // Replace with actual ID if different
                .check(ViewAssertions.matches(ViewMatchers.isClickable()))
                .perform(ViewActions.click());

        // Expected result: The 'OK' button is accessible and functional
    }
}
```

Note:
- Ensure that `MainActivity` has an `id_countries_list` RecyclerView.
- The `ok_button` ID should be replaced with the actual ID of the OK button within your layout.
- Adjust any delays (`Thread.sleep(500)`) as necessary based on your application's performance.