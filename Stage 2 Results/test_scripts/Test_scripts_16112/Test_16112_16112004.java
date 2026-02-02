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

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_16112_16112004 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyThatTheHistoryTabIsEmptyAfterClearingAllEntries() throws InterruptedException {
        // Open the app and navigate to the 'HISTORY' tab (assuming it's the first tab)
        onView(withText("HISTORY")).perform(click());
        
        // Test each element
        for (int i = 0; i < 2; i++) {
            switch (i) {
                case 0:
                    onView(withId(R.id.id_clearAll)).perform(click());
                    Thread.sleep(500);
                    break;
                case 1:
                    onView(withId(R.id.id_delete)).perform(click());
                    Thread.sleep(500);
                    break;
            }
            
            // Verify state
            onView(withId(R.id.id_history_list)).check(matches(withText("")));
        }
    }
}