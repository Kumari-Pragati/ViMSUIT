package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
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
public class Test_15034_15034005 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(20000); // Set a longer timeout for the test

    @Test
    public void testClickOnTheDraftPunkAppListing() throws InterruptedException {
        // Step 1: Open the Earthquake Alert app (Assuming MainActivity is the entry point)
        
        // Step 2: Navigate to the promotional section
        onView(withId(R.id.id_scrollView)).perform(ViewActions.scrollTo());
        Thread.sleep(500); // Wait for ScrollView content to be visible

        // Step 3: Click on the 'Draft Punk' app listing (Assuming it's a child view of ScrollView)
        onView(withId(R.id.id_draftPunkListing)).perform(click());
        Thread.sleep(500); // Wait before assertions
        
        // Expected Result: The app should navigate to the 'Draft Punk' app page
        onView(withId(R.id.id_draftPunkPage)).check(matches(isDisplayed()));
    }
}
```

Note:
- `MainActivity` is assumed as the entry point of your application.
- `R.id.id_draftPunkListing` and `R.id.id_draftPunkPage` are placeholders for actual resource IDs. You need to replace them with the correct IDs from your app's resources.
- The `Thread.sleep(500)` calls are used to ensure that the UI is fully updated before performing actions or assertions. This can be replaced with more robust waiting mechanisms if needed.