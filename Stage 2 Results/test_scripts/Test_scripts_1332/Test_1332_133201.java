package com.example.tests;

import android.view.View;
import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityTestRule;
import androidx.test.filters.LargeTest;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import android.widget.EditText;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

@RunWith(androidx.test.runner.AndroidJUnit4.class)
@LargeTest
public class Test_1332_133201 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testAddANewItemToThePackingList() throws InterruptedException {
        // Step 1: Click on the 'Add Item' input field.
        onView(withId(R.id.add_item_field)).perform(click());

        // Step 2: Type 'Baby blanket' into the input field.
        onView(withId(R.id.add_item_field)).perform(ViewActions.typeText("Baby blanket"));

        // Step 3: Press 'Enter' to add the item to the list.
        Espresso.pressKey(KeyEvent.KEYCODE_ENTER);

        // Wait for 500ms
        Thread.sleep(500);

        // Expected result: The item 'Baby blanket' is added to the packing list.
        onView(withText("Baby blanket")).inRoot(isDialog()).check(matches(isDisplayed()));
    }
}