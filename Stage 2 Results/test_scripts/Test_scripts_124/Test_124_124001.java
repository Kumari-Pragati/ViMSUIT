package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.Button;
import android.widget.EditText;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

@RunWith(AndroidJUnit4.class)
public class Test_124_124001 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testPositiveFlowCalculateWaistToHeightRatio() throws InterruptedException {
        // Open the app and navigate to the Waist to Height Ratio screen (assuming it's already there)
        
        // Step 1: Enter age as 26
        onView(ViewMatchers.withId(R.id.id_age_edit_text))
                .perform(ViewActions.typeText("26"));
        Thread.sleep(500);

        // Loop through all elements and perform test steps on each
        for (int i = 1; i <= 5; i++) {
            switch (i) {
                case 1:
                    // Element 1: Select gender as Female
                    onView(withId(R.id.id_gender_woman_button))
                            .perform(click());
                    Thread.sleep(500);
                    break;
                case 2:
                    // Element 2: Select measure system as Metric
                    onView(withId(R.id.id_measureSystemButton_metric))
                            .perform(click());
                    Thread.sleep(500);
                    break;
                case 3:
                    // Element 3: Enter height as 6 feet (72 inches)
                    onView(ViewMatchers.withId(R.id.id_height_edit_text))
                            .perform(ViewActions.typeText("72"));
                    Thread.sleep(500);
                    break;
                case 4:
                    // Element 4: Enter waist measurement as 0 cm
                    onView(ViewMatchers.withId(R.id.id_waist_edit_text))
                            .perform(ViewActions.typeText("0"));
                    Thread.sleep(500);
                    break;
                case 5:
                    // Element 5: Click on the 'WAIST TO HEIGHT RATIO' button
                    Espresso.onView(ViewMatchers.withContentDescription("Navigate up"))
                            .perform(ViewActions.click());
                    Thread.sleep(500);
                    break;
            }
        }

        // Verify state after all interactions
        onView(withId(R.id.id_waist_to_height_ratio_text_view))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        
        onView(withId(R.id.id_ideal_waist_text_view))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Add more assertions as needed to verify the calculated values
    }
}