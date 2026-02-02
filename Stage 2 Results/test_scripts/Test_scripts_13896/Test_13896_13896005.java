package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class Test_13896_13896005 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testSelectMultipleAnimalFaceImages() throws InterruptedException {
        // Test each element
        onView(withId(R.id.drawable_an_31))
                .perform(ViewActions.click());
        Thread.sleep(500);
        
        Espresso.onView(withContentDescription("[None]"))
                .perform(ViewActions.click());
        Thread.sleep(500);

        onView(withId(R.id.drawable_an_7))
                .perform(ViewActions.click());
        Thread.sleep(500);
        
        Espresso.onView(withContentDescription("[None]"))
                .perform(ViewActions.click());
        Thread.sleep(500);

        // Verify state
        verifySelection(withId(R.id.drawable_an_31));
        verifySelection(withContentDescription("[None]"));
        verifySelection(withId(R.id.drawable_an_7));
    }

    private void verifySelection(org.hamcrest.Matcher<View> viewMatcher) {
        Espresso.onView(viewMatcher)
                .check(matches(isSelected()));
    }
}