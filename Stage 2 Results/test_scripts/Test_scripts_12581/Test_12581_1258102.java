package com.example.tests;

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
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_12581_1258102 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testCheckIfTheCircularButtonWithAMapIconIsClickable() throws InterruptedException {
        // Wait for the loading page to appear (assuming it takes some time)
        Thread.sleep(500);

        // Step 3: Click on the circular button with a map icon located at the bottom right.
        onView(withId(R.id.id_fab)).perform(click());

        // Wait for the map view to be displayed
        Thread.sleep(500);

        // Step 4: Assert that the map view is displayed
        onView(withId(R.id.map_view_id)).check(matches(isDisplayed()));
    }
}
```

Note:
- Replace `R.id.map_view_id` with the actual resource ID of the map view in your application.
- Ensure that you have the necessary dependencies for Espresso and AndroidX in your `build.gradle` file.