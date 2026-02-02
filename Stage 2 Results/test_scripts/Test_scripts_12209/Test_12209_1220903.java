package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.widget.ImageButton;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

@RunWith(AndroidJUnit4.class)
public class Test_12209_1220903 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickOnThePromotionsSection() throws InterruptedException {
        // Click on the 'Main Menu Closed' ImageButton
        onView(withContentDescription("['Main Menu Closed']")).perform(ViewActions.click());
        
        // Wait for 500ms to ensure the transition is complete
        Thread.sleep(500);
        
        // Assert that the promotions section content is displayed
        onView(withId(R.id.promotions_section_content)).check(matches(isDisplayed()));
    }
}