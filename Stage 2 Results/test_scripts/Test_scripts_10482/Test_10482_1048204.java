package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.EditText;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.InstrumentationRegistry.getInstrumentation;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(JUnit4.class)
public class Test_10482_1048204 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNavigationToCheckout() throws InterruptedException {
        // Step 1: Navigate to the 'Phone for Checkout' screen (Assuming it's already on this screen)
        
        // Step 2: Enter a valid phone number '123-456-7890'
        onView(withId(R.id.id_editTextField)).perform(ViewActions.typeText("123-456-7890"));
        Thread.sleep(500); // Wait for the input to be processed

        // Step 3: Tap on the 'Next' button to navigate to the checkout screen
        onView(withText("Next")).perform(click());
        Thread.sleep(500); // Wait for navigation to complete

        // Step 4: Verify that the user is redirected to the checkout screen
        onView(withId(R.id.checkout_screen_id)).check(matches(isDisplayed()));
    }
}
```

Note:
- Replace `MainActivity` with your actual main activity class.
- Ensure you have a resource ID `R.id.checkout_screen_id` for the checkout screen in your XML layout or use another appropriate way to identify the checkout screen.
- The `Thread.sleep(500)` is used as a workaround and should be replaced with proper Espresso actions if possible.