package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_15065_1506501 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testPositiveFlowNavigatingThroughTheSettingsPage() throws InterruptedException {
        // Navigate to the Contacts settings page (assuming it's a separate activity or fragment)
        Espresso.onView(withId(R.id.nav_contacts)).perform(click());
        Thread.sleep(500);

        // Verify header title
        Espresso.onView(withText("Contacts")).check(matches(isDisplayed()));
        Thread.sleep(500);

        // Test Element 1: withId(R.id.id_invisibleContacts)
        onView(withId(R.id.id_invisibleContacts))
                .perform(click());
        Thread.sleep(500);
        Espresso.onView(withText("Enable to show hidden contacts"))
                .check(matches(isDisplayed()));

        // Test Element 2: withId(R.id.id_showPhoto)
        onView(withId(R.id.id_showPhoto))
                .perform(click());
        Thread.sleep(500);
        Espresso.onView(withText("Enable to show the photos of the contacts"))
                .check(matches(isDisplayed()));

        // Test Element 3: withId(R.id.id_photoSelection)
        onView(withId(R.id.id_photoSelection))
                .perform(click());
        Thread.sleep(500);
        Espresso.onView(withText("Prefer the photo from Facebook"))
                .check(matches(isDisplayed()));
    }
}