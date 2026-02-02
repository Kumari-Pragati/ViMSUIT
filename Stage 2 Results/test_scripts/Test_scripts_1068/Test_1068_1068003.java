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
public class Test_1068_1068003 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUserCanEditTheirProfileInformation() throws InterruptedException {
        // Step 1: Click on the edit pencil icon next to the name 'Sam, 32'.
        onView(ViewMatchers.withId(R.id.id_profile)).perform(ViewActions.click());
        
        Thread.sleep(500); // Wait for UI to update
        
        // Step 2: Enter new information and save.
        onView(ViewMatchers.withText("Name")).inRoot(isDialog()).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withClassName(EditText.class.getName()))
                .perform(ViewActions.typeText("New Name"));
        
        Thread.sleep(500); // Wait for UI to update
        
        Espresso.onView(ViewMatchers.withText("Save"))
                .inRoot(isDialog())
                .perform(ViewActions.click());
        
        Thread.sleep(500); // Wait for UI to update

        // Expected Result: The profile information is successfully updated.
        onView(ViewMatchers.withText("New Name")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}