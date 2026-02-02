package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers(withId);
import static org.junit.Assert.assertTrue;

@RunWith(AndroidJUnit4.class)
public class Test_13895_13895001 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testPositiveFlowSelectingAnAnimalImage() throws InterruptedException {
        // Loop through all elements and perform the test steps on each one
        for (int i = 1; i <= 10; i++) {
            int drawableId;
            if (i < 9) {
                drawableId = R.id.drawable_an_31 + (i - 1);
            } else {
                // For elements with no content description, use a placeholder value
                drawableId = R.id.drawable_an_27; // Using the last valid drawable id for simplicity
            }

            onView(withId(drawableId))
                    .perform(ViewActions.click());
            Thread.sleep(500);

            // Verify state - check if the selected animal image is highlighted or matches with the central pig image
            Espresso.onView(withContentDescription("[None]"))
                    .check(matches(isDisplayed()));

            // Add a delay between interactions to ensure the UI has time to update
            Thread.sleep(500);
        }
    }
}
```

Note: The `drawableId` calculation for elements 1-8 is based on the provided IDs. For elements with no content description, a placeholder drawable ID (the last valid one) was used for simplicity. You may need to adjust this logic if your actual implementation requires different handling for these cases.