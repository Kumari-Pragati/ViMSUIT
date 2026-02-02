package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isChecked;
import android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_15065_1506506 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUsabilityDataPersistence() throws InterruptedException {
        // Navigate to Contacts settings page (assuming it's the main activity)
        
        // Test Element 1: Invisible Contacts
        onView(withId(R.id.id_invisibleContacts)).perform(click());
        Thread.sleep(500);
        onView(withId(R.id.id_invisibleContacts)).check(matches(isChecked()));
        
        // Test Element 2: Show Photo
        onView(withId(R.id.id_showPhoto)).perform(click());
        Thread.sleep(500);
        onView(withId(R.id.id_showPhoto)).check(matches(isChecked()));
        
        // Test Element 3: Photo Selection
        onView(withId(R.id.id_photoSelection)).perform(click());
        Thread.sleep(500);
        onView(withId(R.id.id_photoSelection)).check(matches(isChecked()));
    }
}