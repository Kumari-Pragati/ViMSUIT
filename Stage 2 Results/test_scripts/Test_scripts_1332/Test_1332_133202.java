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
public class Test_1332_133202 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testCheckOffAnItemFromThePackingList() throws InterruptedException {
        // Locate and click on the checkbox next to 'Insurance cards; birth plan'
        onView(withId(R.id.id_checklist_item_checkbox)).perform(ViewActions.click());
        
        Thread.sleep(500); // Wait for 500ms

        // Assert that the checkbox is checked
        onView(withId(R.id.id_checklist_item_checkbox)).check(matches(isChecked()));
    }
}