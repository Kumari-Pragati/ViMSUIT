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
public class Test_16342_16342004 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUsabilityTestSearchFunctionality() throws InterruptedException {
        // Element 1: withContentDescription("[None]") - com.callsfreecalls.android:id/btn_buy
        onView(ViewMatchers.withId(com.callsfreecalls.android.R.id.btn_buy))
                .perform(click());
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("Test call"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Element 2: withContentDescription("[None]") - com.callsfreecalls.android:id/btn_free
        onView(ViewMatchers.withId(com.callsfreecalls.android.R.id.btn_free))
                .perform(click());
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("Test call"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Element 3: withContentDescription("[None]") - com.callsfreecalls.android:id/contactsInputSearch
        onView(ViewMatchers.withId(com.callsfreecalls.android.R.id.contactsInputSearch))
                .perform(ViewActions.typeText("Test call"), ViewActions.closeSoftKeyboard());
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("Test call"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Element 4: withContentDescription("[None]") - com.callsfreecalls.android:id/contacts_list
        onView(ViewMatchers.withId(com.callsfreecalls.android.R.id.contacts_list))
                .perform(click());
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("Test call"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Element 5: withContentDescription("[None]") - com.callsfreecalls.android:id/inviteButton
        onView(ViewMatchers.withId(com.callsfreecalls.android.R.id.inviteButton))
                .perform(click());
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("Test call"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Element 6: withContentDescription("[None]") - com.callsfreecalls.android:id/tab_layout
        onView(ViewMatchers.withId(com.callsfreecalls.android.R.id.tab_layout))
                .perform(click());
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("Test call"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Element 7: withContentDescription("[None]")
        onView(withContentDescription("[None]"))
                .perform(click());
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("Test call"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Element 8: withContentDescription("[None]")
        onView(withContentDescription("[None]"))
                .perform(click());
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("Test call"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Element 9: withContentDescription("[None]")
        onView(withContentDescription("[None]"))
                .perform(click());
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("Test call"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Element 10: withContentDescription("[None]")
        onView(withContentDescription("[None]"))
                .perform(click());
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("Test call"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Element 11: withContentDescription("[None]") - com.callsfreecalls.android:id/pager
        onView(withContentDescription("[None]"))
                .perform(click());
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("Test call"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}