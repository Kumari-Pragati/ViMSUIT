package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.AppCompatImageButton;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_17032_1703206 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUserCanClearTheSearchBar() throws InterruptedException {
        // Type 'Taraval' into the search bar.
        onView(withId(R.id.search_edit_text)).perform(ViewActions.typeText("Taraval"));

        // Click on the 'X' icon next to the search bar to clear the text.
        Thread.sleep(500);
        onView(withId(R.id.id_footer_add_button)).perform(click());

        // Wait for 500ms to ensure the view updates
        Thread.sleep(500);

        // Assert that the search bar is cleared of any text
        onView(withId(R.id.search_edit_text)).check(matches(withText("")));

        // Additional assertion to check if the clear button is still visible (optional)
        onView(withId(R.id.id_footer_add_button)).check(matches(isDisplayed()));
    }
}