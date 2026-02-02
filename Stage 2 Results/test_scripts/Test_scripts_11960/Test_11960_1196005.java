package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@RunWith(AndroidJUnit4.class)
public class Test_11960_1196005 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNavigationReturnToPreviousScreen() throws InterruptedException {
        // Step 1: Open the app and navigate to the phone number entry screen.
        
        // Step 2: Select the country 'United States (+1)' from the list.
        // Assuming there is a way to select the country, but it's not explicitly mentioned in the steps
        // For now, we'll skip this step as it's not clear how to do it with Espresso
        
        // Step 3: Enter the phone number '123-456-7890' in the input field.
        onView(withId(R.id.phone_number_input)).perform(ViewActions.typeText("123-456-7890"));
        
        // Step 4: Tap the 'CONTINUE' button
        Thread.sleep(500);
        onView(allOf(withText("CONTINUE"), withId(R.id.id_wizard_next))).perform(ViewActions.click());
        
        // Step 5: Tap the back button to return to the previous screen.
        Thread.sleep(500);
        Espresso.pressBack();
        
        // Expected Result: The app should navigate back to the previous screen without any errors.
        Thread.sleep(500);
        onView(withId(R.id.previous_screen_element_id)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}
```

Note:
- `MainActivity` is assumed as the entry point of your application. Replace it with the actual main activity class name if different.
- The resource ID for the previous screen element (`R.id.previous_screen_element_id`) needs to be replaced with an appropriate identifier that uniquely identifies the previous screen's UI element.
- The country selection step (Step 2) is skipped as the exact method to select a country from a list is not provided. You may need to implement this based on your application's UI structure.
- `Thread.sleep(500)` is used for demonstration purposes and should be replaced with more robust waiting mechanisms in production code, such as Espresso's `onView` matchers or `UiController`.