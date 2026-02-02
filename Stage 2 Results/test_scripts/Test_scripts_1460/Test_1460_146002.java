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
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(JUnit4.class)
public class Test_1460_146002 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowAddPersonWithoutEnteringAName() throws InterruptedException {
        // Step 1: Open the app and navigate to the 'People' screen.
        // Assuming that navigating to the People screen is already done by the ActivityTestRule

        // Step 2: Click on the 'Add person' button
        onView(withId(R.id.add_person_button)).perform(click());

        // Step 3: Click on the 'FINISH' button without entering a name
        Thread.sleep(500); // Wait for UI to update after adding person
        onView(withId(R.id.id_finish)).perform(click());

        // Step 4: Verify that an error message is displayed indicating that a name is required
        Thread.sleep(500); // Wait for the error message to appear
        onView(withText("Name is required")).inRoot(isToast()).check(matches(ViewMatchers.isDisplayed()));
    }
}
```

Note:
- `R.id.add_person_button` should be replaced with the actual resource ID of the 'Add person' button.
- The method `isToast()` is a custom matcher that checks if the view is a toast message. If you are using Espresso 3 or later, you can use `withText("Name is required").inRoot(isToast())`. For earlier versions, you might need to implement this custom matcher or use other methods.
- Ensure that your `MainActivity` has an `add_person_button` with the correct resource ID and that it navigates to the appropriate screen.