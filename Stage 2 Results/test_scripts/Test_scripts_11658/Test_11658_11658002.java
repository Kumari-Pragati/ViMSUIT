package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_11658_11658002 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyYearlySubscriptionOption() throws InterruptedException {
        // Navigate to the Subscription Options screen (assuming it's already open)
        
        // Test each element
        for (int i = 1; i <= 3; i++) {
            String purchaseButtonId = "id_btn_purchase" + i;
            
            if (i == 1) {
                onView(withId(R.id.id_btn_purchase1))
                        .perform(click());
                Thread.sleep(500);
                // Verify state
                onView(withContentDescription("['Navigate up']"))
                        .check(matches(ViewMatchers.isDisplayed()));
                
                onView(withId(R.id.id_btn_purchase2))
                        .perform(click());
                Thread.sleep(500);
            } else if (i == 2) {
                onView(withId(R.id.id_btn_purchase2))
                        .perform(click());
                Thread.sleep(500);
                // Verify state
                onView(withContentDescription("['Navigate up']"))
                        .check(matches(ViewMatchers.isDisplayed()));
                
                onView(withId(R.id.id_btn_purchase3))
                        .perform(click());
                Thread.sleep(500);
            } else if (i == 3) {
                onView(withContentDescription("['Navigate up']"))
                        .perform(click());
                Thread.sleep(500);
                // Verify state
                onView(withId(R.id.id_btn_purchase1))
                        .check(matches(ViewMatchers.isClickable()));
                
                onView(withId(R.id.id_btn_purchase2))
                        .perform(click());
                Thread.sleep(500);
            }
            
            // Perform purchase and verify the process is initiated (assuming it's already handled in the app)
        }
    }
}
```

Note: The above code assumes that the `MainActivity` has a subscription options screen with the specified elements. The actual implementation of verifying the state and initiating the purchase process may vary based on your application's logic.