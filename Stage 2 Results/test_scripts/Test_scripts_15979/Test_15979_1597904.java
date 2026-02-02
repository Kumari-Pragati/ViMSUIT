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
public class Test_15979_1597904 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickOnGoToSectionButtonInModsSection() throws InterruptedException {
        // Wait for the main screen to load
        Thread.sleep(500);

        // Navigate to the menu section (assuming a method exists in MainActivity)
        onView(withText("Menu")).perform(click());
        Thread.sleep(500);

        // Click on the 'GO TO SECTION' button in the Mods section
        onView(withId(R.id.id_buttonView)).perform(click());
        Thread.sleep(500);

        // Assert that we are navigated to the Mods section (assuming a specific view or text is present)
        onView(withText("Mods Section")).check(matches(isDisplayed()));
    }
}