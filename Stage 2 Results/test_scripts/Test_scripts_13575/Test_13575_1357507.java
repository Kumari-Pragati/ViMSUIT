package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers(withId);
import static java.lang.Thread.sleep;

@RunWith(AndroidJUnit4.class)
public class Test_13575_1357507 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUsabilityVerifyNavigationFlow() throws InterruptedException {
        // Test each element
        onView(withId(R.id.id_category_subcategory_list))
                .perform(ViewActions.click());
        sleep(500);
        // Verify state
        Espresso.onView(isDisplayed()).check(matches(withContentDescription("Navigate up")));

        onView(withContentDescription("['Navigate up']"))
                .perform(ViewActions.click());
        sleep(500);
        // Verify state
        Espresso.onView(isDisplayed()).check(matches(withContentDescription("Navigate up")));
    }
}