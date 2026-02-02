package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_13575_1357502 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowAttemptToSelectANonexistentCategory() throws InterruptedException {
        // Open the app and navigate to the category selection screen
        Espresso.onView(withId(R.id.id_category_subcategory_list)).performClick();
        
        Thread.sleep(500); // Wait for 500ms
        
        // Tap on a non-existent category option (assuming it's an item in the ListView)
        Espresso.onView(withId(R.id.id_category_subcategory_list)).performScrollToPosition(1);
        Espresso.onView(withText("NonExistentCategory")).performClick();
        
        Thread.sleep(500); // Wait for 500ms
        
        // Verify that an error message is displayed indicating the category does not exist
        Espresso.onView(withText(R.string.error_category_not_found)).check(ViewAssertions.matches(withText(R.string.error_category_not_found)));
    }
}