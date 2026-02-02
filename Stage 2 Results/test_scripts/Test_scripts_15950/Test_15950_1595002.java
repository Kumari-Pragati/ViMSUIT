package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.CardView;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

@RunWith(AndroidJUnit4.class)
public class Test_15950_1595002 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testSearchFunctionalityNegativeFlow() throws InterruptedException {
        // Step 1: Open the app and navigate to the 'Teams' screen.
        // Assuming Teams screen is already open or can be navigated directly

        // Step 2: Click on the search bar
        onView(withId(R.id.id_search_query_section)).perform(ViewActions.click());

        // Step 3: Type 'Non-existent team name' into the search bar
        Thread.sleep(500);
        Espresso.onView(withId(R.id.id_search_query_section))
                .perform(ViewActions.typeText("Non-existent team name"));

        // Step 4: Press the 'Enter' key to perform the search
        Thread.sleep(500);
        Espresso.pressKey(KeyEvent.KEYCODE_ENTER);

        // Expected Result: The search results should not display any teams.
        Thread.sleep(500);
        onView(withId(R.id.search_results_container)).check(ViewAssertions.doesNotExist());
    }
}
```

Note:
- `MainActivity` is assumed to be the entry point of your app. If it's different, replace accordingly.
- `R.id.id_search_query_section` and `R.id.search_results_container` are placeholders for actual resource IDs in your application. You should replace them with the correct ones from your project.
- The `Thread.sleep(500)` calls are used to simulate delays that might be necessary due to network requests or UI updates, but they can be removed if you have a more robust way of handling these scenarios.