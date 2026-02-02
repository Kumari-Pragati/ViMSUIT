package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class Test_16112_16112002 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyThatTheClearAllButtonClearsAllHistoryEntries() throws InterruptedException {
        // Navigate to the HISTORY tab (assuming it's a separate view or action)
        Espresso.onView(ViewMatchers.withText("HISTORY")).perform(ViewActions.click());
        Thread.sleep(500);

        // Test CLEAR ALL button
        onView(withId(R.id.id_clearAll)).perform(click());
        Thread.sleep(500);
        Espresso.onView(withId(R.id.id_delete)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        
        // Verify state (assuming there are no history entries)
        Espresso.onView(withText("No history available")).check(matches(isDisplayed()));

        // Test DELETE button
        onView(withId(R.id.id_delete)).perform(click());
        Thread.sleep(500);
        Espresso.onView(withId(R.id.id_clearAll)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        
        // Verify state (assuming there are no history entries)
        Espresso.onView(withText("No history available")).check(matches(isDisplayed()));
    }
}
```

Note: The above code assumes that the `MainActivity` has a tab or view for the "HISTORY" section and that it displays a message like "No history available" when there are no history entries. Adjust the assertions as per your actual UI elements and behavior.