package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.Button;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

@RunWith(AndroidJUnit4.class)
public class Test_124_124002 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowInvalidWaistMeasurement() throws InterruptedException {
        // Step 1: Open the app and navigate to the Waist to Height Ratio screen.
        
        // Step 2: Enter the age as 26.
        Espresso.onView(ViewMatchers.withId(R.id.id_age_edit_text))
                .perform(ViewActions.typeText("26"));
        Thread.sleep(500);

        // Step 3: Select the gender as Female.
        onView(withId(R.id.id_gender_woman_button)).perform(click());
        Thread.sleep(500);
        
        // Step 4: Enter the height as 6 feet.
        Espresso.onView(ViewMatchers.withId(R.id.id_height_edit_text))
                .perform(ViewActions.typeText("6"));
        Thread.sleep(500);

        // Step 5: Enter the waist measurement as -1 cm.
        Espresso.onView(ViewMatchers.withId(R.id.id_waist_edit_text))
                .perform(ViewActions.typeText("-1"));
        Thread.sleep(500);
        
        // Step 6: Click on the 'WAIST TO HEIGHT RATIO' button.
        Espresso.onView(ViewMatchers.withId(R.id.id_calculate_button)).perform(click());
        Thread.sleep(500);

        // Verify error message for invalid waist measurement
        onView(ViewMatchers.withText("Waist measurement cannot be negative."))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}
```

Note: The above code assumes that the `MainActivity` has an `id_age_edit_text`, `id_gender_woman_button`, `id_height_edit_text`, `id_waist_edit_text`, and `id_calculate_button`. Also, it assumes that the error message is displayed with a specific text. Adjust the IDs and text as per your actual UI elements.