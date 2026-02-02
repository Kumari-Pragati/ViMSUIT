package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.EditText;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(JUnit4.class)
public class Test_17169_1716903 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyEmailAddressIsDisplayedInTheHeader() throws InterruptedException {
        // Wait for the view to be available and visible
        Thread.sleep(500);
        
        // Find the email address in the header
        onView(withId(R.id.id_home_search_edittext)).check(matches(isDisplayed()));
        
        // Verify that the correct email is displayed (assuming it's a placeholder or hint text)
        String expectedEmail = "appcrawler1@gmail.com";
        EditText editText = activityRule.getActivity().findViewById(R.id.id_home_search_edittext);
        String actualEmail = editText.getHint().toString();
        
        // Assert that the email matches
        assert actualEmail.equals(expectedEmail) : "Expected email does not match actual email";
    }
}