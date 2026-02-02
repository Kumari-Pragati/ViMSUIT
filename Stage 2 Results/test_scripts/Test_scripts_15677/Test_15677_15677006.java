package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.widget.ListView;
import org.junit.Rule;
import org.junit.Test;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

public class Test_15677_15677006 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testCheckUsabilityOfTheScreen() throws InterruptedException {
        // Navigate to the Help & Contact screen (assuming it's a button click or similar action)
        onView(withId(R.id.id_btn_help)).perform(click());
        
        Thread.sleep(500); // Wait for 500ms
        
        // Perform usability test
        // Check if the ListView is clickable and focusable
        onView(withId(R.id.id_lv_help_sub))
                .check(matches(isClickable()))
                .check(matches(isFocusable()));
        
        Thread.sleep(500); // Wait for 500ms
    }
}
```

Note: The `R.id.id_btn_help` used in the code is an assumption based on the context. You should replace it with the actual resource ID of the button that navigates to the Help & Contact screen.