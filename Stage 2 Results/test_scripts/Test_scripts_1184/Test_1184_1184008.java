package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

@RunWith(AndroidJUnit4.class)
public class Test_1184_1184008 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testInputAndVerifyTheTermOfPregnancyField() throws InterruptedException {
        // Element 1: withId(R.id.id_drawer_layout)
        onView(withId(R.id.id_drawer_layout))
                .perform(click());
        Thread.sleep(500);
        Espresso.closeSoftKeyboard();
        
        // Element 2: withId(R.id.id_pager)
        onView(withId(R.id.id_pager))
                .perform(ViewActions.click());
        Thread.sleep(500);

        // Element 3: withId(R.id.id_listView)
        onView(withId(R.id.id_listView))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        Thread.sleep(500);

        // Element 4-7: withId(R.id.id_imageViewItem) (same element, multiple times)
        for (int i = 1; i <= 4; i++) {
            onView(withId(R.id.id_imageViewItem))
                    .perform(ViewActions.click());
            Thread.sleep(500);
        }

        // Element 8: withId(R.id.id_buttonPrev)
        onView(withId(R.id.id_buttonPrev))
                .perform(ViewActions.click());
        Thread.sleep(500);

        // Element 9: withId(R.id.id_buttonNext)
        onView(withId(R.id.id_buttonNext))
                .perform(ViewActions.click());
        Thread.sleep(500);

        // Element 10: withContentDescription("['Open navigation drawer']")
        Espresso.closeSoftKeyboard();
        
        // Element 11: withContentDescription("['More options']")
        Espresso.closeSoftKeyboard();
        
        // Element 12-14: withContentDescription("[None]") (same element, multiple times)
        for (int i = 0; i < 3; i++) {
            onView(ViewMatchers.withContentDescription("[None]"))
                    .perform(ViewActions.click());
            Thread.sleep(500);
        }

        // Input '38 weeks' into the term of pregnancy field
        onView(ViewMatchers.withText("Term of Pregnancy"))
                .perform(ViewActions.click())
                .perform(ViewActions.typeText("38 weeks"));

        // Verify the term of pregnancy field is updated to '38 weeks'
        onView(ViewMatchers.withText("38 weeks"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}