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

@RunWith(AndroidJUnit4.class)
public class Test_17105_17105008 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testCheckForAccessibilityusability() throws InterruptedException {
        // Element 1: withId(R.id.id_image_pager_view)
        onView(withId(R.id.id_image_pager_view))
                .perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.pressBack();
        
        // Element 2: withId(R.id.id_profile_image)
        onView(withId(R.id.id_profile_image))
                .perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.pressBack();

        // Element 3: withId(R.id.id_action_add_fav)
        onView(withId(R.id.id_action_add_fav))
                .perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.pressBack();

        // Element 4: withId(R.id.id_profile_scroll)
        onView(withId(R.id.id_profile_scroll))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        Thread.sleep(500);

        // Element 5: withId(R.id.id_floorplan_list)
        onView(withId(R.id.id_floorplan_list))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        Thread.sleep(500);

        // Element 6: withId(R.id.id_show_more_floorplan)
        onView(withId(R.id.id_show_more_floorplan))
                .perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.pressBack();

        // Element 7: withId(R.id.id_expand_collapse)
        onView(withId(R.id.id_expand_collapse))
                .perform(ViewActions.click());
        Thread.sleep(500);

        // Element 8: withId(R.id.id_check_availability_button)
        onView(withId(R.id.id_check_availability_button))
                .perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.pressBack();

        // Element 9: withContentDescription("['Navigate up']")
        onView(withContentDescription("Navigate up"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}