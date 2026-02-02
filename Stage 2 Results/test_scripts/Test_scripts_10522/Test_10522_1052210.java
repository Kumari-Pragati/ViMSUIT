package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.AppCompatImageButton;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class Test_10522_1052210 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testSelectAColorUsingThePaintTool() throws InterruptedException {
        // Step 1: Click on the paint tool
        onView(withId(R.id.id_colorBt)).perform(ViewActions.click());
        Thread.sleep(500); // Wait for UI to update

        // Step 2: Select the color 'Red'
        Espresso.closeSoftKeyboard(); // Ensure no keyboard is open
        AppCompatImageButton colorButton = (AppCompatImageButton) activityRule.getActivity().findViewById(R.id.id_colorBt);
        colorButton.performClick();
        Thread.sleep(500); // Wait for UI to update

        // Expected Result: The selected color should be applied to the image
        Espresso.onView(ViewMatchers.withId(R.id.your_image_view_id)).check(matches(hasColor(Color.RED)));
    }

    private Matcher<View> hasColor(int color) {
        return new ViewAssertion() {
            @Override
            public void check(View view, NoMatchingViewException noViewFoundException) {
                if (noViewFoundException != null) throw noViewFoundException;
                // Implement logic to verify the image's color here
                // This is a placeholder for actual implementation
            }
        };
    }
}
```

Note: Replace `R.id.your_image_view_id` with the actual resource ID of the image view where the selected color should be applied. The `hasColor` method is a placeholder and needs to be implemented based on your application's specific logic for verifying the color of an image.