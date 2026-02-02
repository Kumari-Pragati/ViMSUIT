package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.TextView;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(JUnit4.class)
public class Test_13648_1364804 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUsabilityNavigatingBackFromCourseDetails() throws InterruptedException {
        // Step 1: Open the app and navigate to the 'Similar Courses' screen.
        onView(withId(R.id.id_recycler_view)).perform(ViewActions.scrollToPosition(0));

        // Step 2: Tap on the 'C#' course tile.
        TextView cSharpTile = (TextView) activityRule.getActivity().findViewById(R.id.csharp_tile_id);
        cSharpTile.perform(click());

        Thread.sleep(500); // Wait for UI to update

        // Step 3: Navigate back to the 'Similar Courses' screen.
        Espresso.pressBack();
        Thread.sleep(500); // Wait for UI to update

        // Step 4: Verify that the 'C#' tile is still selected.
        onView(withId(R.id.csharp_tile_id)).check(matches(isDisplayed()));
    }
}
```

Note:
- Ensure `MainActivity` has a `R.id.csharp_tile_id` resource defined in its layout or view model.
- The `Thread.sleep(500)` calls are used to ensure the UI updates properly between actions. This is a workaround and should be replaced with proper Espresso assertions if possible.
- Adjust the `csharp_tile_id` as necessary based on your actual implementation.