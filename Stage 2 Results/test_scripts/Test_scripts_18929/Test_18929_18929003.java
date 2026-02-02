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
public class Test_18929_18929003 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUserSelectsYesButtonInTheConfirmationDialog() throws InterruptedException {
        // Navigate to settings or preferences section (assuming this is done in the MainActivity)
        
        // Step 3: Locate and select the option to turn off all demos (this step might vary based on your app's UI)
        onView(withId(R.id.turn_off_demos)).perform(click());
        
        Thread.sleep(500);
        
        // Step 4: In the confirmation dialog, select the 'Yes' button
        onView(withId(R.id.id_dialog_button_negative))
                .check(matches(isDisplayed()))
                .perform(click());
        Thread.sleep(500);

        // Verify state (assuming there is a view that indicates demos are turned off)
        onView(withId(R.id.demos_turned_off_indicator)).check(matches(isDisplayed()));

        Thread.sleep(500);
        
        // Step 4: In the confirmation dialog, select the 'Yes' button
        onView(withId(R.id.id_dialog_button_positive))
                .check(matches(isDisplayed()))
                .perform(click());
        Thread.sleep(500);

        // Verify state (assuming there is a view that indicates demos are turned off)
        onView(withId(R.id.demos_turned_off_indicator)).check(matches(isDisplayed()));
    }
}
```

Note: The `turn_off_demos` and `demos_turned_off_indicator` IDs are placeholders. You should replace them with the actual IDs used in your application's UI. Additionally, the `Thread.sleep(500)` calls are for demonstration purposes and may not be necessary depending on your app's performance characteristics.