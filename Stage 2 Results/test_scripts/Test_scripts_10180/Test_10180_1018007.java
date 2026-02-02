package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.*;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.*;
import static java.lang.Thread.sleep;

@RunWith(AndroidJUnit4.class)
public class Test_10180_1018007 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testCheckIfTheAppCanHandleDataPersistence() throws InterruptedException {
        // Element 1: withId(R.id.id_drawer_layout)
        onView(withId(R.id.id_drawer_layout)).perform(click());
        sleep(500);
        onView(withContentDescription("Navigate up")).perform(click());

        // Element 2: withId(R.id.id_menu_search)
        onView(withId(R.id.id_menu_search)).perform(click());
        sleep(500);

        // Element 3: withId(R.id.id_grid_view)
        onView(withId(R.id.id_grid_view)).check(matches(isDisplayed()));
        sleep(500);

        // Element 4: withId(R.id.id_content_wrapper)
        onView(withId(R.id.id_content_wrapper)).check(matches(isDisplayed()));
        sleep(500);

        // Element 5: withId(R.id.id_login_btn)
        onView(withId(R.id.id_login_btn)).perform(click());
        sleep(500);
        
        // Element 6: withId(R.id.id_content_wrapper) - same as element 4
        onView(withId(R.id.id_content_wrapper)).check(matches(isDisplayed()));
        sleep(500);

        // Element 7: withId(R.id.id_login_btn) - same as element 5
        onView(withId(R.id.id_login_btn)).perform(click());
        sleep(500);
        
        // Element 8: withContentDescription("['Navigate up']")
        onView(withContentDescription("Navigate up")).perform(click());
        sleep(500);

        // Close the app and reopen it
        activityRule.getActivity().finish();
        Thread.sleep(2000); // Wait for the app to close

        // Reopen the app
        activityRule.launchActivity(null);
        
        // Navigate to the MOVIES screen again
        onView(withId(R.id.id_drawer_layout)).perform(click());
        sleep(500);
        onView(withContentDescription("Navigate up")).perform(click());

        // Verify that the MOVIES screen is displayed with the same list of movies
        onView(withId(R.id.id_grid_view)).check(matches(isDisplayed()));
    }
}