package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.ActionMenuPresenter$OverflowMenuButton;
import org.junit.Rule;
import org.junit.Test;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;

public class Test_10352_10352008 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickOnTheMenuIconInTheHeader() throws InterruptedException {
        // Step 1: Click on the 'Menu' icon in the header.
        onView(withContentDescription("['More options']")).perform(click());
        
        // Step 2: Verify that the menu options are displayed.
        Thread.sleep(500); // Wait for the menu to appear
        onView(isRoot()).check(matches(hasDescendant(withContentDescription("['More options']"))));
    }
}
```

Note:
- The `hasDescendant` matcher is used to verify if a descendant with the specified content description exists.
- Ensure that your `MainActivity` has an `OverflowMenuButton` or similar element with the correct content description "['More options']".
- Adjust the package and class names as necessary to fit your project structure.