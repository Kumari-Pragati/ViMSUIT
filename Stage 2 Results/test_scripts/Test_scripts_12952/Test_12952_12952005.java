package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.CoreMatchers.allOf;

@RunWith(AndroidJUnit4.class)
public class Test_12952_12952005 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(30000); // 30 seconds

    @Test
    public void testUsabilityTestProgressIndicator() throws InterruptedException {
        // Open the app and navigate to the onboarding screen.
        Espresso.onView(allOf(withId(R.id.drawer_layout), withContentDescription("[None]"))).perform(ViewActions.click());
        
        Thread.sleep(500); // Wait for 500ms

        // Verify the progress indicator shows the user is on the first of three steps.
        Espresso.onView(withContentDescription("[None]")).check(matches(isDisplayed()));
        Espresso.onView(withId(R.id.step_indicator)).check(matches(hasProgress(1, 3)));
    }

    private static boolean hasProgress(int currentStep, int totalSteps) {
        // This method should be implemented to check the progress indicator's state.
        // For simplicity, we assume it returns true if the current step matches the expected one.
        return currentStep == 1;
    }
}
```

Note: The `hasProgress` method is a placeholder and needs to be implemented based on how your app handles the progress indicator. You may need to use custom matchers or interact with the view in a more complex way depending on your application's implementation.