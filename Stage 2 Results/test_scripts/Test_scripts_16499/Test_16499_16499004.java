package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.widget.TabLayout;
import org.junit.Before;
import org.junit.Test;

public class Test_16499_16499004 {

    private ActivityTestRule<MainActivity> activityTestRule;

    @Before
    public void setUp() {
        activityTestRule = new ActivityTestRule<>(MainActivity.class);
    }

    @Test
    public void testUserCanNavigateToTheWorkInformationPage() throws InterruptedException {
        // Step 1: Open the app and navigate to the manga '俺のメンタルは限界です' by 藤アイリ.
        Espresso.onView(ViewMatchers.withText("俺のメンタルは限界です")).perform(ViewActions.click());

        // Step 2: Click on the '話一覧' (Chapter List) tab.
        Thread.sleep(500);
        TabLayout tabs = activityTestRule.getActivity().findViewById(R.id.id_tabs);
        onView(withId(R.id.id_tabs)).perform(ViewActions.click());
        
        // Step 3: Click on the '作品情報' (Work Information) tab.
        Thread.sleep(500);
        int workInformationTabPosition = 1; // Assuming '作品情報' is the second tab
        tabs.getTabAt(workInformationTabPosition).select();
        
        // Expected Result: The user should be on the work information page for the manga '俺のメンタルは限界です'.
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("作品情報")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}