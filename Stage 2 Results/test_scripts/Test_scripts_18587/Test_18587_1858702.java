package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_18587_1858702 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowInvalidUsername() throws InterruptedException {
        // Step 1: Open the app (already done by ActivityTestRule)

        // Step 2: Attempt to navigate to the profile page for 'invalid_username'
        Thread.sleep(500); // Wait for UI to stabilize

        onView(withId(R.id.id_mainMenu)).perform(click());
        Thread.sleep(500);

        // Assuming there is a search input field with id R.id.searchInput
        Espresso.onView(withId(R.id.searchInput))
                .perform(typeText("invalid_username"), pressKey(KeyEvent.KEYCODE_ENTER));
        Thread.sleep(500);

        // Step 3: Verify the error message or notification is displayed
        Espresso.onView(withText("Username does not exist"))
                .check(ViewAssertions.matches(isDisplayed()));
    }
}
```

Note:
- The `MainActivity` class should be defined in your project.
- The resource ID for the search input field (`R.id.searchInput`) is assumed based on common UI patterns. You may need to adjust this according to your actual application's layout.
- The error message text ("Username does not exist") is also an assumption and should match the actual error message displayed by your app.