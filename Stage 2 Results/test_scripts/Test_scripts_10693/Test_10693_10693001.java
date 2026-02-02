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
public class Test_10693_10693001 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testPositiveFlowNavigatingBetweenSections() throws InterruptedException {
        // Open the app and navigate to the 'MASCOTS' section.
        onView(withId(R.id.id_tab_view))
                .perform(ViewActions.click());
        Thread.sleep(500);
        
        // Verify state of tab view after navigation
        onView(withId(R.id.id_tab_view))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        
        // Tap on the 'TEAMS' tab to navigate to the 'TEAMS' section.
        onView(withId(R.id.id_viewpager))
                .perform(ViewActions.click());
        Thread.sleep(500);
        
        // Verify state of view pager after navigation
        onView(withId(R.id.id_viewpager))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        
        // Tap on the 'ALL-STAR' tab to navigate to the 'ALL-STAR' section.
        Espresso.onView(withId(R.id.id_recyclerview))
                .perform(ViewActions.click());
        Thread.sleep(500);
        
        // Verify state of recycler view after navigation
        onView(withId(R.id.id_recyclerview))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        
        for (int i = 1; i <= 16; i++) {
            String emojiImageId = "R.id.id_emoji_image" + i;
            int emojiResourceId = Integer.parseInt(emojiImageId.replace("R.id.id_emoji_image", "").trim());
            onView(withId(emojiResourceId))
                    .perform(ViewActions.click());
            Thread.sleep(500);
            
            // Verify state of each emoji image after navigation
            Espresso.onView(withId(emojiResourceId))
                    .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        }
        
        // Test withContentDescription elements
        String moreOptions = "['More options']";
        onView(withContentDescription(moreOptions))
                .perform(ViewActions.click());
        Thread.sleep(500);
        
        for (int i = 1; i <= 4; i++) {
            String noneOptionId = "[None]" + i;
            onView(withContentDescription(noneOptionId))
                    .perform(ViewActions.click());
            Thread.sleep(500);
            
            // Verify state of each 'None' option after navigation
            Espresso.onView(withContentDescription(noneOptionId))
                    .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        }
    }
}