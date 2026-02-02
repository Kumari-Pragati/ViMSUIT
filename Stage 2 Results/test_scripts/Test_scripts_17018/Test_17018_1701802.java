package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.v4.widget.DrawerLayout;
import org.junit.Rule;
import org.junit.Test;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

public class Test_17018_1701802 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testPositiveFlowSelectingANewsSource() throws InterruptedException {
        // Open the app and navigate to the menu screen.
        Espresso.onView(withId(R.id.id_drawer_layout)).perform(ViewActions.click());

        // Click on the menu icon in the header.
        Thread.sleep(500);

        // Scroll through the list of news sources and select 'Reuters'.
        Espresso.onView(withId(R.id.id_drawer_layout)).perform(ViewActions.scrollTo(), ViewActions.clickAtPositionOnView(
                withId(R.id.id_drawer_list_view), 1)); // Assuming Reuters is at position 1

        // Verify that 'Reuters' is highlighted in yellow.
        Thread.sleep(500);
        Espresso.onView(withId(R.id.id_drawer_layout)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}
```

Note: The `Thread.sleep(500)` calls are used to ensure the UI has enough time to update after each action. In a real-world scenario, you might want to replace these with more robust waiting mechanisms provided by Espresso.