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
import static org.hamcrest.CoreMatchers.is;

@RunWith(AndroidJUnit4.class)
public class Test_12952_12952002 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(30000); // 30 seconds

    @Test
    public void testNegativeFlowSkipAll() throws InterruptedException {
        // Open the app and navigate to the onboarding screen (assumed to be launched automatically)
        
        // Click on the 'Skip All' button
        Thread.sleep(500);
        onView(withContentDescription("[None]")).perform(ViewActions.click());
        
        // Wait for 500ms before checking the result
        Thread.sleep(500);

        // Assert that the user is directed to the main wallet screen
        Espresso.onView(hasDescendant(R.id.main_wallet_screen)).check(matches(isDisplayed()));
    }
}
```

Note: The `hasDescendant` matcher and `R.id.main_wallet_screen` are placeholders. You should replace them with actual matchers or resource IDs that accurately represent the main wallet screen in your application.