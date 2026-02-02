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
public class Test_124_124004 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testToggleStateClassificationSection() throws InterruptedException {
        // Open the app and navigate to the Waist to Height Ratio screen.
        Espresso.onView(ViewMatchers.withText("Waist to Height Ratio")).perform(ViewActions.click());

        // Enter the age as 26.
        Espresso.onView(ViewMatchers.withId(R.id.id_age_edit_text)).perform(ViewActions.typeText("26"));

        // Select the gender as Female.
        onView(withId(R.id.id_gender_woman_button))
                .perform(click());
        Thread.sleep(500);

        // Enter the height as 6 feet.
        Espresso.onView(ViewMatchers.withId(R.id.id_height_edit_text)).perform(ViewActions.typeText("6"));

        // Enter the waist measurement as 0 cm.
        Espresso.onView(ViewMatchers.withId(R.id.id_waist_edit_text)).perform(ViewActions.typeText("0"));

        // Click on the 'WAIST TO HEIGHT RATIO' button.
        Espresso.onView(ViewMatchers.withId(R.id.id_calculate_button))
                .perform(ViewActions.click());

        // Click on the 'UnderWeight' classification.
        Espresso.onView(ViewMatchers.withText("UnderWeight"))
                .perform(ViewActions.click());
        Thread.sleep(500);

        // Click on the 'Normal' classification.
        Espresso.onView(ViewMatchers.withText("Normal"))
                .perform(ViewActions.click());
        Thread.sleep(500);

        // Click on the 'OverWeight' classification.
        Espresso.onView(ViewMatchers.withText("OverWeight"))
                .perform(ViewActions.click());
        Thread.sleep(500);

        // Click on the 'Obese' classification.
        Espresso.onView(ViewMatchers.withText("Obese"))
                .perform(ViewActions.click());
        Thread.sleep(500);

        // Click on the 'Morbidly Obese' classification.
        Espresso.onView(ViewMatchers.withText("Morbidly Obese"))
                .perform(ViewActions.click());
        Thread.sleep(500);

        // Verify state of each element
        onView(withId(R.id.id_gender_woman_button))
                .check(ViewAssertions.matches(ViewMatchers.isChecked()));

        onView(withId(R.id.id_measureSystemButton_metric))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        onView(withId(R.id.id_measureSystemButton_imperial))
                .check(ViewAssertions.matches(ViewMatchers.isNotChecked()));

        // Add assertions for other elements as needed
    }
}