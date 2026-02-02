package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.EditText;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

@RunWith(AndroidJUnit4.class)
public class Test_17032_1703208 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUserCanPerformASearchWithAnInvalidInput() throws InterruptedException {
        // Step 1: Click on the search bar labeled 'Find a bus or line'.
        Espresso.onView(ViewMatchers.withId(R.id.id_search_bar)).perform(ViewActions.click());

        Thread.sleep(500);

        // Step 2: Type 'invalid' into the search bar.
        Espresso.onView(ViewMatchers.withId(R.id.id_search_edit_text))
                .perform(ViewActions.typeText("invalid"));

        Thread.sleep(500);

        // Step 3: Press the Enter key to perform the search.
        Espresso.pressKey(KeyEvent.KEYCODE_ENTER);

        Thread.sleep(500);

        // Expected Result: The search results should display an error message indicating that the input is invalid.
        Espresso.onView(ViewMatchers.withId(R.id.id_search_error_message))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}