package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.FrameLayout;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;

@RunWith(AndroidJUnit4.class)
public class Test_15449_1544904 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testCheckIfTheMenuIconInTheHeaderNavigatesToTheCorrectMenu() throws InterruptedException {
        // Test each element
        onView(withId(R.id.id_drawer_layout))
                .perform(click());
        Thread.sleep(500);
        // Verify state
        onView(withContentDescription("[None]"))
                .check(matches(isDisplayed()));

        onView(withId(R.id.id_main_page_menu_btn))
                .perform(click());
        Thread.sleep(500);
        // Verify state
        onView(withId(R.id.id_text_item_menu_button))
                .check(matches(isDisplayed()));

        onView(withId(R.id.id_main_page_search_btn))
                .perform(click());
        Thread.sleep(500);
        // Verify state
        onView(withId(R.id.id_sound_item_button))
                .check(matches(isDisplayed()));

        onView(withId(R.id.id_main_page_frame_container))
                .perform(click());
        Thread.sleep(500);
        // Verify state
        onView(withContentDescription("[None]"))
                .check(matches(isDisplayed()));

        onView(withId(R.id.id_lvData))
                .perform(click());
        Thread.sleep(500);
        // Verify state
        onView(withId(R.id.id_text_item_menu_button))
                .check(matches(isDisplayed()));

        onView(withId(R.id.id_text_item_menu_button))
                .perform(click());
        Thread.sleep(500);
        // Verify state
        onView(withContentDescription("[None]"))
                .check(matches(isDisplayed()));

        onView(withId(R.id.id_sound_item_button))
                .perform(click());
        Thread.sleep(500);
        // Verify state
        onView(withId(R.id.id_text_item_menu_button))
                .check(matches(isDisplayed()));
    }
}