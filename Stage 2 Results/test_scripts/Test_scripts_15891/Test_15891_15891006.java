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
public class Test_15891_15891006 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testAccessibilityHamburgerMenuIcon() throws InterruptedException {
        // Perform a screen reader action on the hamburger menu icon.
        Thread.sleep(500);
        
        // Select the hamburger menu icon using its content description.
        onView(withContentDescription("Navigate up")).perform(ViewActions.click());
        
        // Wait for 500ms to ensure the screen reader has enough time to announce the label.
        Thread.sleep(500);
        
        // Assert that the screen reader announces the label of the hamburger menu icon.
        Espresso.assertViewIsDisplayed(R.id.hamburger_menu_icon);
        Espresso.onView(AppCompatImageButton.class).perform(ViewActions.pumpAccessibilityEvents());
        Espresso.assertAll();
    }
}