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

@RunWith(AndroidJUnit4.class)
public class Test_12504_1250402 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUserCanViewTheShoppingCart() throws InterruptedException {
        // Step 1: Click on the shopping cart icon in the header.
        Thread.sleep(500);
        onView(withContentDescription("[None]")).perform(ViewActions.click());

        // Expected Result: The user is redirected to the shopping cart screen.
        Thread.sleep(500);
        Espresso.onView(hasDescendant(R.id.shopping_cart_screen)).check(matches(isDisplayed()));
    }
}