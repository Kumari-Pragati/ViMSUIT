package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.EditText;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.*;
import static android.support.test.espresso.assertion.ViewAssertions.*;
import static android.support.test.espresso.matcher.ViewMatchers.*;

@RunWith(AndroidJUnit4.class)
public class Test_11231_1123101 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testPositiveFlowUserNavigatesToTheHomePageAndPerformsASearch() throws InterruptedException {
        // Test each element
        onView(withId(R.id.id_menu_open)).perform(click());
        Thread.sleep(500);
        verifyElementState();

        onView(withId(R.id.id_btnFindRestaurants)).perform(click());
        Thread.sleep(500);
        verifyElementState();

        onView(withId(R.id.id_btnLogin)).perform(click());
        Thread.sleep(500);
        verifyElementState();
    }

    private void verifyElementState() {
        // Verify state of the elements after each interaction
        onView(withId(R.id.id_menu_open)).check(matches(isDisplayed()));
        onView(withId(R.id.id_btnFindRestaurants)).check(matches(isDisplayed()));
        onView(withId(R.id.id_btnLogin)).check(matches(isDisplayed()));
    }
}