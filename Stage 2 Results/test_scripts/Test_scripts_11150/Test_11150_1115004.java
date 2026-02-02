package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.TextView;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(JUnit4.class)
public class Test_11150_1115004 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheFooterText() throws InterruptedException {
        // Step 1: Open the app and navigate to the feedback review screen.
        onView(withId(R.id.action_comment_compose)).perform(ViewActions.click());
        
        // Step 2: Verify that the footer text '1 条短评' (1 short review) is displayed.
        Thread.sleep(500); // Wait for UI to update
        
        onView(withContentDescription("['写点评']")).check(matches(isDisplayed()));
        
        TextView footerTextView = activityTestRule.getActivity().findViewById(R.id.footer_text);
        assert footerTextView != null;
        String expectedFooterText = "1 条短评";
        assert footerTextView.getText().toString().equals(expectedFooterText) : "Footer text does not match the expected value.";
    }
}