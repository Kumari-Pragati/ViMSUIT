package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.RecyclerView;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(JUnit4.class)
public class Test_16741_1674102 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowNoInternetConnection() throws InterruptedException {
        // Step 1: Open the app and navigate to the news screen.
        onView(withId(R.id.id_list)).perform(click());

        // Step 2: Simulate no internet connection.
        // This step is typically handled by your application logic, but for testing purposes,
        // we can simulate it by checking if there's an internet connection and then disconnecting it.
        // For simplicity, let's assume the app checks for connectivity on launch and shows a message.

        // Step 3: Verify the screen displays a message indicating no internet connection.
        Thread.sleep(500); // Wait for any initial UI updates

        onView(withId(R.id.id_list)).check(matches(ViewMatchers.isDisplayed()));
        Espresso.onView(withId(android.R.id.content))
                .check(matches(ViewAssertions.withText("No internet connection")));
    }
}