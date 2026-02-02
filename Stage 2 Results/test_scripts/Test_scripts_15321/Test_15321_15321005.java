package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.RecyclerView;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.List;

@RunWith(JUnit4.class)
public class Test_15321_15321005 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickableButtonsClickOnTheLikeCommentAndStarIcons() throws InterruptedException {
        // Navigate to the post with specific text and emojis
        Espresso.onView(ViewMatchers.withText("Pretty much irritated You always help somebody on here But when you need it nobody gives a fuck"))
                .perform(ViewActions.scrollTo(), ViewActions.click());
        
        Thread.sleep(500);

        // Loop through all elements and perform test steps
        List<Integer> elementIds = List.of(
                R.id.id_ib_heart,
                R.id.id_ib_star,
                R.id.id_ib_heart,
                R.id.id_ib_star,
                R.id.id_ib_left_menu,
                R.id.id_ib_search,
                R.id.id_ib_write_post,
                R.id.id_ib_notification,
                R.id.id_ib_right_menu,
                R.id.id_bt_close_tool_tip
        );

        for (Integer id : elementIds) {
            onView(withId(id)).perform(click());
            Thread.sleep(500);

            // Add assertions to verify each element's behavior
            if (id == R.id.id_ib_heart || id == R.id.id_ib_star) {
                Espresso.onView(ViewMatchers.withId(id)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
            }
        }
    }
}