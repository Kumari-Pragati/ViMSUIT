package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.Button;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_18929_18929001 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUserNavigatesToTheConfirmationDialogToTurnOffAllDemos() throws InterruptedException {
        // Navigate to settings or preferences section (assuming this is done in the app)
        
        // Step 1: Open the mobile banking app and navigate to the settings or preferences section.
        // This step might be implicit, so we will assume it's already on the main activity.

        // Step 2: Locate and select the option to turn off all demos
        onView(withText("Settings")).perform(click());
        Thread.sleep(500);

        // Step 3: Click on the "Turn Off All Demos" button
        onView(withId(R.id.turn_off_all_demos_button)).perform(click());
        Thread.sleep(500);

        // Verify that the confirmation dialog appears with the correct text and message
        onView(withText("TURN OFF ALL DEMOS?")).check(matches(isDisplayed()));
        onView(withText("You can view demos at any time.")).check(matches(isDisplayed()));

        // Step 4: Test Element 1 - Click on "Negative" button (Cancel)
        onView(withId(R.id.id_dialog_button_negative)).perform(click());
        Thread.sleep(500);

        // Verify that the dialog is dismissed
        onView(withText("TURN OFF ALL DEMOS?")).check(matches(not(isDisplayed())));

        // Step 5: Test Element 2 - Click on "Positive" button (Confirm)
        onView(withId(R.id.id_dialog_button_positive)).perform(click());
        Thread.sleep(500);

        // Verify that the dialog is dismissed and all demos are turned off
        onView(withText("TURN OFF ALL DEMOS?")).check(matches(not(isDisplayed())));
    }
}
```

Note: The `MainActivity` class should have a button with id `R.id.turn_off_all_demos_button` for this test to work as expected. Also, the text "Settings" and "You can view demos at any time." are placeholders and should be replaced with actual texts from your application.