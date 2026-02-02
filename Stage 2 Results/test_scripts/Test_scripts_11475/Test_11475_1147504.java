package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.widget.TabLayout;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class Test_11475_1147504 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Before
    public void setUp() {
        // No setup needed for this test case.
    }

    @Test
    public void testNavigateToTheArticlesTab throws InterruptedException {
        // Step 1: Open the Nail Art App (This is implicit when using ActivityTestRule)

        // Step 2: Tap on the 'СТАТЬИ' (Articles) tab at the bottom of the screen
        Thread.sleep(500); // Wait for the UI to load and stabilize
        onView(withId(R.id.id_tabs)).perform(ViewActions.click());
        Thread.sleep(500); // Additional wait time

        // Step 3: Verify that the screen displays nail art articles
        Espresso.onView(isDescendantOfA(withClassName(Matchers.equalTo(TabLayout.class.getName()))))
                .check(matches(hasTabWithText("СТАТЬИ")));

        // Ensure that the ViewPager is set to the correct position (assuming it's the first tab)
        Espresso.onView(isRoot()).perform(ViewActions.swipeLeft());
        Espresso.onView(isDescendantOfA(withClassName(Matchers.equalTo(ViewPager.class.getName()))))
                .check(matches(hasTabWithText("СТАТЬИ")));

        // Additional assertions can be added here if necessary
    }

    private Matcher<View> hasTabWithText(final String text) {
        return new TypeSafeMatcher<View>() {
            @Override
            protected boolean matchesSafely(View item) {
                TabLayout tabLayout = (TabLayout) item;
                for (int i = 0; i < tabLayout.getTabCount(); i++) {
                    if (tabLayout.getTabAt(i).getText().toString().equals(text)) {
                        return true;
                    }
                }
                return false;
            }

            @Override
            public void describeTo(Description description) {
                description.appendText("has a tab with text: " + text);
            }
        };
    }
}