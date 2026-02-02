package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

@RunWith(AndroidJUnit4.class)
public class Test_14987_14987002 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowEmptyFields() throws InterruptedException {
        // Element 1: withContentDescription("[None]")
        onView(withContentDescription("[None]"))
                .perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("Please enter a valid value"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Element 2: withId(com.tradesy.android:id/facebook)
        onView(withContentDescription("[None]"))
                .perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("Please enter a valid value"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Element 3: withId(com.tradesy.android:id/facebook)
        onView(withId(R.id.facebook))
                .perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("Please enter a valid value"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}
```

Note:
- The `withContentDescription("[None]")` is used twice in the example, but it should be replaced with actual content descriptions or IDs.
- Ensure that the error message "Please enter a valid value" is correctly displayed for each element. Adjust the text as necessary based on your application's UI.
- The `MainActivity` class and its layout should have elements with appropriate IDs and content descriptions to match the selectors used in this test case.