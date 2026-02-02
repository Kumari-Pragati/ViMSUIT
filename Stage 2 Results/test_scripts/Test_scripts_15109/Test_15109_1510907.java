package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.allOf;

@RunWith(AndroidJUnit4.class)
public class Test_15109_1510907 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheBottomNavigationBarIsFunctional() throws InterruptedException {
        // Test each element
        onView(withId(R.id.id_application_root_view_content_without_bars))
                .perform(click());
        Thread.sleep(500);
        
        Espresso.onView(allOf(withId(R.id.id_page_header_menu), withContentDescription("[None]")))
                .perform(click());
        Thread.sleep(500);

        Espresso.onView(allOf(withId(R.id.id_page_header_menu_click), withContentDescription("[None]")))
                .perform(click());
        Thread.sleep(500);

        Espresso.onView(allOf(withId(R.id.id_page_header_icon_click), withContentDescription("[None]")))
                .perform(click());
        Thread.sleep(500);

        Espresso.onView(allOf(withId(R.id.id_page_header_find_click), withContentDescription("[None]")))
                .perform(click());
        Thread.sleep(500);

        Espresso.onView(allOf(withId(R.id.id_share_button), withContentDescription("[None]")))
                .perform(click());
        Thread.sleep(500);

        Espresso.onView(allOf(withId(R.id.id_layer_display_mode_past), withContentDescription("[None]")))
                .perform(click());
        Thread.sleep(500);

        Espresso.onView(allOf(withId(R.id.id_layer_display_mode_future), withContentDescription("[None]")))
                .perform(click());
        Thread.sleep(500);

        Espresso.onView(allOf(withId(R.id.id_looping_button), withContentDescription("[None]")))
                .perform(click());
        Thread.sleep(500);

        Espresso.onView(allOf(withId(R.id.id_layer_button), withContentDescription("[None]")))
                .perform(click());
        Thread.sleep(500);

        Espresso.onView(allOf(withId(R.id.id_legend_button), withContentDescription("[None]")))
                .perform(click());
        Thread.sleep(500);

        Espresso.onView(allOf(withId(R.id.id_share_button), withContentDescription("['Google Map']")))
                .perform(click());
        Thread.sleep(500);
        
        // Add assertions to verify each element's behavior
    }
}