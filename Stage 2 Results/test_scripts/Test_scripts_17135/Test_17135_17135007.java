package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.v4.widget.DrawerLayout;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_17135_17135007 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyThePostAnAdButtonIsNotClickableWhenNoMessagesArePresent() throws InterruptedException {
        // Step 1: Open the app and navigate to the 'My Messages' section.
        onView(withId(R.id.id_drawer_layout)).perform(ViewActions.click());
        Thread.sleep(500);

        // Step 2: Verify the 'Post an Ad' button is not clickable when no messages are present.
        onView(withText("Post an Ad")).check(ViewAssertions.notClickable()).check(ViewAssertions.isNotFocusable());
    }
}