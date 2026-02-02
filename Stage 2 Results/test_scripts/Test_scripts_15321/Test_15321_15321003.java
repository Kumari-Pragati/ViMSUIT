package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class Test_15321_15321003 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(5, java.util.concurrent.TimeUnit.SECONDS);

    @Test
    public void testBoundaryValidationCheckTheNumberOfComments() throws InterruptedException {
        // Step 1: Open the Talklife app (Assuming it's already open and launched)
        
        // Step 2: Navigate to the post with specific text
        onView(withText("Pretty much irritated You always help somebody on here But when you need it nobody gives a fuck")).perform(click());
        Thread.sleep(500); // Wait for UI to update
        
        // Step 3: Click on the comment icon (1)
        onView(withId(R.id.id_ib_heart)).perform(click());
        Thread.sleep(500); // Wait for UI to update

        // Expected Result: The number of comments is displayed as 1
        onView(withText("1")).inRoot(withDecorView(not(isRootView()))).check(matches(isDisplayed()));
    }
}