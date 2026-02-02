package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.v7.widget.RecyclerView;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.pressImeActionButton;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_15891_15891007 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUsabilitySearchBar() throws InterruptedException {
        // Step 1: Click on the search bar and type '123 Main St'.
        onView(withId(R.id.search_bar)).perform(click());
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("123 Main St")).perform(ViewActions.typeText("123 Main St"));
        Thread.sleep(500);

        // Step 2: Press the enter key.
        Espresso.pressBack();
        Thread.sleep(500);
        Espresso.closeSoftKeyboard();
        Thread.sleep(500);
        onView(withContentDescription("['Outdated Version']")).perform(click());
        Thread.sleep(500);

        // Expected Result: The app should display nearby food options based on the entered address.
        onView(withId(R.id.recycler_view)).check(matches(ViewMatchers.isDisplayed()));
    }
}