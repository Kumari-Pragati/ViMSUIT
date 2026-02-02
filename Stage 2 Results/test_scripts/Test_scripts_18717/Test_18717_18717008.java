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
public class Test_18717_18717008 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheResetAndRunButtonInteraction() throws InterruptedException {
        // Step 1: Click on the 'Reset' button.
        onView(withId(R.id.id_btnResetTest)).perform(click());
        
        Thread.sleep(500); // Wait for UI to update
        
        // Step 2: Click on the 'Run' button.
        onView(withId(R.id.id_btnRunTest)).perform(click());
        
        Thread.sleep(500); // Wait for sorting process to complete

        // Expected Result Assertions
        // Assuming that after running the Bubble Sort, a specific view or text is updated
        // to indicate the array has been sorted. Replace with actual UI elements.
        onView(withText("Array Sorted")).check(matches(ViewMatchers.isDisplayed()));
    }
}
```

Note: The `MainActivity` class and the `R.id.id_btnRunTest` resource ID need to be defined in your project for this test to work correctly. Additionally, you should replace `"Array Sorted"` with the actual text or UI element that indicates the array has been sorted after running the Bubble Sort algorithm.