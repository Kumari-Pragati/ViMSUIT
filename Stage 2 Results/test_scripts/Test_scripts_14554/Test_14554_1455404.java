package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_14554_1455404 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheHeaderAppBarIconsAreFunctional() throws InterruptedException {
        // Step 1: Open the messaging app 'airMail'
        // This step is implicit as it's assumed the app is already open and launched

        // Step 2: Click on the search icon in the header/app bar.
        Espresso.onView(withId(R.id.id_main_menu_search)).perform(ViewActions.click());
        Thread.sleep(500);

        // Step 3: Click on the messages icon in the header/app bar.
        Espresso.onView(withId(R.id.id_main_menu_messages)).perform(ViewActions.click());
        Thread.sleep(500);

        // Step 4: Click on the notifications icon in the header/app bar.
        Espresso.onView(withId(R.id.id_main_menu_notification)).perform(ViewActions.click());
        Thread.sleep(500);

        // Step 5: Click on the settings icon in the header/app bar.
        Espresso.onView(withId(R.id.id_main_menu_settings)).perform(ViewActions.click());
        Thread.sleep(500);

        // Assertion for search screen
        Espresso.onView(withId(R.id.search_screen_content)).check(matches(isDisplayed()));

        // Assertion for messages screen
        Espresso.onView(withId(R.id.messages_screen_content)).check(matches(isDisplayed()));

        // Assertion for notifications screen
        Espresso.onView(withId(R.id.notifications_screen_content)).check(matches(isDisplayed()));

        // Assertion for settings screen
        Espresso.onView(withId(R.id.settings_screen_content)).check(matches(isDisplayed()));
    }
}