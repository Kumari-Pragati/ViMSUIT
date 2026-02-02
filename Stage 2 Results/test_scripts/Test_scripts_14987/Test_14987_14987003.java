package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_14987_14987003 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(5, java.util.concurrent.TimeUnit.SECONDS);

    @Test
    public void testNegativeFlowInvalidEmail() throws InterruptedException {
        // Step 1: Enter 'john.doe@example' in the 'Email Address' field
        onView(withId(R.id.email_address)).perform(ViewActions.typeText("john.doe@example"));

        Thread.sleep(500); // Wait for UI to update

        // Step 2: Click the 'SUBMIT' button
        onView(withContentDescription("[None]")).perform(ViewActions.click());

        Thread.sleep(500); // Wait for error message to appear

        // Expected Result: The user is presented with an error message for the 'Email Address' field
        onView(withId(R.id.email_address)).check(ViewAssertions.matches(hasErrorText("Invalid email address")));

        Espresso.pressBack();
    }

    private static Matcher<View> hasErrorText(final String expected) {
        return new TypeSafeMatcher<View>() {
            @Override
            protected boolean matchesSafely(View view) {
                if (view instanceof FontEditText) {
                    FontEditText editText = (FontEditText) view;
                    return editText.getError().toString().contains(expected);
                }
                return false;
            }

            @Override
            public void describeTo(Description description) {
                description.appendText("with error text: " + expected);
            }
        };
    }
}