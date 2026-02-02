package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.widget.ImageButton;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

@RunWith(JUnit4.class)
public class Test_1115_1115011 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testHeaderBackArrowShouldNotBeClickableIfNotLoggedIn throws InterruptedException {
        // Ensure the user is not logged in.
        // This step might require additional setup code to simulate an unauthenticated state.

        // Click on the back arrow in the header.
        Thread.sleep(500);
        onView(withContentDescription("['Navigate up']")).perform(ViewActions.click());

        // The back arrow should not be clickable.
        Thread.sleep(500);
        ImageButton backButton = (ImageButton) activityRule.getActivity().findViewById(R.id.back_button_id); // Replace with actual resource ID
        assertThat(backButton.isClickable(), not(true));
    }
}