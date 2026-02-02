package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_15979_1597905 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickOnGoToSectionButtonInSkinsSection() throws InterruptedException {
        // Navigate to the menu section (assuming there is a way to do this in your app)
        Thread.sleep(500); // Wait for UI to load

        // Click on the 'GO TO SECTION' button in the Skins section
        onView(withId(R.id.id_buttonView)).perform(click());
        Thread.sleep(500); // Wait for navigation

        // Assert that we are now in the Skins section
        onView(withText("Skins")).inRoot(isDialog()).check(matches(withText("Skins")));
    }
}