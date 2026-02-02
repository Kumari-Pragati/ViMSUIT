package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.TabHost;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;

@RunWith(AndroidJUnit4.class)
public class Test_14566_14566001 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testPositiveFlowNavigatingThroughDifferentTabs() throws InterruptedException {
        // Wait for the activity to be fully loaded
        Thread.sleep(500);

        // Tap on the 'INFO' tab
        onView(withContentDescription("[None]")).perform(click());
        Thread.sleep(500);
        // Assert that the INFO tab is selected
        onView(withId(R.id.tabLayout)).check(matches(hasTabSelected("INFO")));

        // Tap on the 'SETTINGS' tab
        onView(withContentDescription("[None]")).perform(click());
        Thread.sleep(500);
        // Assert that the SETTINGS tab is selected
        onView(withId(R.id.tabLayout)).check(matches(hasTabSelected("SETTINGS")));

        // Tap on the 'MORE APPS' tab
        onView(withContentDescription("[None]")).perform(click());
        Thread.sleep(500);
        // Assert that the MORE APPS tab is selected
        onView(withId(R.id.tabLayout)).check(matches(hasTabSelected("MORE APPS")));
    }

    private static org.hamcrest.Matcher<TabHost> hasTabSelected(final String tabName) {
        return new org.hamcrest.TypeSafeMatcher<TabHost>() {
            @Override
            public boolean matches(Object item) {
                TabHost tabHost = (TabHost) item;
                for (int i = 0; i < tabHost.getTabWidget().getChildCount(); i++) {
                    if (tabHost.getTabWidget().getChildAt(i).isSelected() && tabHost.getTabWidget().getTabViewAt(i).getText().toString().equals(tabName)) {
                        return true;
                    }
                }
                return false;
            }

            @Override
            public void describeTo(org.hamcrest.Description description) {
                description.appendText("has selected tab with name: ").appendValue(tabName);
            }
        };
    }
}