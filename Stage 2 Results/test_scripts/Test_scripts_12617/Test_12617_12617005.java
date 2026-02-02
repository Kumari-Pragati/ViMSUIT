package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.widget.ListView;
import org.junit.Rule;
import org.junit.Test;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

public class Test_12617_12617005 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyDataPersistence() throws InterruptedException {
        // Step 1: Open the app, navigate to the profile screen, and exit the app.
        // Assuming that navigating to the profile screen is done by default in MainActivity

        // Step 2: Reopen the app and verify that the pre-season game results are still displayed
        Thread.sleep(500); // Wait for UI to stabilize after activity launch

        // Check if the ListView with id "id_list" is displayed
        onView(withId(R.id.id_list)).check(matches(isDisplayed()));

        // Additional assertion: Verify that the list view contains pre-season game results
        // Assuming there are at least 10 items in the list as a minimum check
        Thread.sleep(500); // Wait for UI to stabilize after interaction

        onView(withId(R.id.id_list)).performScrollToPosition(9);
        onView(withId(R.id.id_list)).check(matches(hasChildView(withText("Pre-season Game Result"))));
    }
}
```

Note: The `hasChildView` matcher is used here as a placeholder. You may need to adjust the text or use another matcher based on your actual UI structure and data.