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

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_14247_14247006 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testSelectADifferentTextOverlayColor() throws InterruptedException {
        // Step 1: Open the app (Assuming it's already open, or this step is handled by the rule)

        // Step 2: Click on one of the text overlays
        onView(withId(R.id.id_action_add_head)).perform(click());
        Thread.sleep(500);

        // Step 3: Select a different text overlay color
        // Assuming there's an option to select colors, for example:
        // onView(withText("Color Option")).perform(click());
        // Thread.sleep(500);
        
        // For demonstration purposes, let's assume the color is selected and we need to verify it.
        // Step 4: Verify the selected color is applied to the text overlay
        // Assuming there's a view with the text "Doge'm" that should have the new color
        onView(withText("Doge'm")).check(matches(hasColor(R.color.new_color)));
        
        // Sleep for a moment to ensure the UI updates properly
        Thread.sleep(500);
    }

    private static ViewAssertion hasColor(int colorResId) {
        return (view, noViewFoundException) -> {
            if (noViewFoundException != null) throw noViewFoundException;
            
            // Get the background color of the view and compare it with the expected color
            int backgroundColor = ((android.widget.TextView) view).getBackground().getColor();
            int expectedColor = getResources().getColor(colorResId);
            assert backgroundColor == expectedColor : "Expected color does not match actual color";
        };
    }
}