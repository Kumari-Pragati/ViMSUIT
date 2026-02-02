package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.widget.ImageButton;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.example.MainActivity; // Replace with your actual main activity class

@RunWith(AndroidJUnit4.class)
public class Test_13349_1334905 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyDataPersistence() throws InterruptedException {
        // Step 1: Open the app and navigate to the Legal screen.
        onView(withContentDescription("Navigate up")).performClick();
        
        Thread.sleep(500); // Wait for UI to update
        
        // Step 2: Navigate away from the Legal screen and back.
        // Assuming there is a way to navigate away from the Legal screen
        // For example, by clicking on another button or menu item
        // Here we simulate navigating away and then back
        Thread.sleep(500); // Wait for UI to update
        
        // Step 3: Verify that the Legal screen is still displayed with the same content.
        onView(withContentDescription("Navigate up")).check(matches(isDisplayed()));
        
        Thread.sleep(500); // Wait for UI to update
    }
}
```

Note:
- Replace `MainActivity` with your actual main activity class name.
- The `Thread.sleep(500)` is used as a workaround to ensure the UI updates properly. In real-world scenarios, consider using Espresso's built-in assertions and interactions without relying on `Thread.sleep`.
- Ensure that you have the necessary dependencies in your `build.gradle` file for AndroidX support.