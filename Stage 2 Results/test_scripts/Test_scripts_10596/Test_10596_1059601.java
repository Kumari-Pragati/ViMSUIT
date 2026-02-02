package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers(withId);

@RunWith(AndroidJUnit4.class)
public class Test_10596_1059601 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyThePresenceOfAllHelpTopics() throws InterruptedException {
        // Navigate to the Help screen
        onView(withId(R.id.id_hs__search)).perform(click());
        Thread.sleep(500);
        
        // Verify that all help topics are present
        String[] helpTopics = {"Getting Started", "Caller ID", "Call Blocking", "Sync", "Contacts", "Birthdays", "Settings", "My Profile", "Privacy", "Contact Us"};
        for (String topic : helpTopics) {
            onView(withText(topic)).check(matches(isDisplayed()));
        }

        // Test Element 1: withId(R.id.id_hs__search)
        Thread.sleep(500);
        
        // Test Element 2: withId(R.id.id_section_list)
        onView(withId(R.id.id_section_list)).perform(click());
        Thread.sleep(500);

        // Verify that all help topics are present in the section list
        for (String topic : helpTopics) {
            onView(withText(topic)).check(matches(isDisplayed()));
        }

        // Test Element 3: withContentDescription("['Navigate up']")
        Thread.sleep(500);
        
        // Navigate back to the Help screen using 'Navigate up'
        Espresso.pressBack();
        Thread.sleep(500);

        // Verify that all help topics are present after navigating back
        for (String topic : helpTopics) {
            onView(withText(topic)).check(matches(isDisplayed()));
        }
    }
}