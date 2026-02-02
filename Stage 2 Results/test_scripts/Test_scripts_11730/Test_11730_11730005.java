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
public class Test_11730_11730005 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUserCanNavigateToTheNextItemInTheVocabularyList() throws InterruptedException {
        // Wait for the initial screen to load
        Thread.sleep(500);

        // Click on the next item in the vocabulary list (using the selector)
        onView(withId(R.id.id_action_tip)).perform(click());

        // Wait for a moment before checking if the navigation is successful
        Thread.sleep(500);

        // Assert that the expected view is displayed after clicking
        onView(withId(R.id.your_next_item_view_id)).check(matches(isDisplayed()));
    }
}
```

**Note:** Replace `R.id.your_next_item_view_id` with the actual resource ID of the next item in your vocabulary list. This ensures that the test checks if navigation to the next item was successful by verifying the presence of a specific view.