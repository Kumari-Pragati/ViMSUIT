package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import android.support.test.runner.AndroidJUnit4;

@RunWith(AndroidJUnit4.class)
public class Test_10482_1048203 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClearPhoneNumberInput() throws InterruptedException {
        // Element 1: withId(R.id.id_drawer_layout)
        onView(withId(R.id.id_drawer_layout))
                .perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.onView(withId(R.id.id_editTextField))
                .check(ViewAssertions.matches(ViewMatchers.withText("")));
        
        // Element 2: withId(R.id.id_scrollView1)
        onView(withId(R.id.id_scrollView1))
                .perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.onView(withId(R.id.id_editTextField))
                .perform(ViewActions.typeText("123-456-7890"), ViewActions.closeSoftKeyboard())
                .perform(ViewActions.clearText());
        Thread.sleep(500);
        Espresso.onView(withId(R.id.id_editTextField))
                .check(ViewAssertions.matches(ViewMatchers.withText("")));

        // Element 3: withId(R.id.id_editTextField)
        Espresso.onView(withId(R.id.id_editTextField))
                .perform(ViewActions.typeText("123-456-7890"), ViewActions.closeSoftKeyboard())
                .perform(ViewActions.clearText());
        Thread.sleep(500);
        Espresso.onView(withId(R.id.id_editTextField))
                .check(ViewAssertions.matches(ViewMatchers.withText("")));

        // Element 4: withContentDescription("['Navigate up']")
        onView(withContentDescription("['Navigate up']"))
                .perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.onView(withId(R.id.id_editTextField))
                .check(ViewAssertions.matches(ViewMatchers.withText("")));
    }
}