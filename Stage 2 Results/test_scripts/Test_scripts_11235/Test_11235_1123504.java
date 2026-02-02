package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.AppCompatImageButton;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class Test_11235_1123504 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUiTestHeaderNavigation() throws InterruptedException {
        // Navigate to the 'Biancorosso' restaurant page (Assuming this step is handled by some navigation logic)
        
        // Click on the back arrow in the Header/App Bar
        Thread.sleep(500);
        onView(withId(R.id.id_back)).perform(ViewActions.click());

        // Verify that we are navigated back to the previous screen
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("Previous Screen Title")).check(matches(isDisplayed()));

        // Click on the shopping cart icon in the Header/App Bar
        Thread.sleep(500);
        onView(withId(R.id.id_cart)).perform(ViewActions.click());

        // Verify that we are navigated to the shopping cart screen
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("Shopping Cart Screen Title")).check(matches(isDisplayed()));
    }
}