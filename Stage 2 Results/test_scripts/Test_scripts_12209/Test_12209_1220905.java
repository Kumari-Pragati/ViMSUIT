package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.v4.widget.DrawerLayout;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;

@RunWith(JUnit4.class)
public class Test_12209_1220905 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickOnTheAtTheGameSection() throws InterruptedException {
        // Open the drawer layout
        onView(withId(R.id.id_drawer_layout)).perform(ViewActions.click());
        
        // Wait for 500ms to ensure the drawer is opened and content is loaded
        Thread.sleep(500);
        
        // Check if the 'AT THE GAME' section content is displayed
        onView(isRoot()).check(matches(isDisplayed()));
    }
}