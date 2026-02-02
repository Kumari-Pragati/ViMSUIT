package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class Test_13721_1372102 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowNoInternetConnection() throws InterruptedException {
        // Test each element
        onView(withId(R.id.id_content_drawer))
                .perform(click());
        Thread.sleep(500);
        Espresso.closeSoftKeyboard();
        onView(withContentDescription("['Open menu']"))
                .perform(click());
        Thread.sleep(500);

        onView(withId(R.id.id_menu_notifications))
                .perform(click());
        Thread.sleep(500);

        // Simulate no internet connection scenario
        // This is a placeholder for the actual network simulation code
        simulateNoInternetConnection();

        // Verify state of each element after no internet connection
        onView(withId(R.id.id_note_sticky_view_action_add))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        Thread.sleep(500);

        // Expected message verification
        Espresso.onView(ViewMatchers.withText("After you share access with your spouse, siblings or other helpers, you’ll see their activity here."))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

    }

    private void simulateNoInternetConnection() {
        // Placeholder for simulating no internet connection scenario
        // This could involve stopping the network service or using a library to simulate offline mode
    }
}