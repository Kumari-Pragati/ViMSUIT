package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.EditText;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import static android.support.test.espresso.Espresso.*;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_12393_1239303 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testPositiveFlowAddANewTask() throws InterruptedException {
        // Open the application (assumed to be opened by default when using ActivityTestRule)

        // Tap on the 'MY TASK LIST' tab
        onView(withId(R.id.my_task_list_tab)).perform(click());
        Thread.sleep(500);

        // Tap on the yellow circular button with a plus sign at the bottom right
        onView(withId(R.id.id_add_task)).perform(click());
        Thread.sleep(500);

        // Enter a new task name, e.g., 'Buy milk'
        onView(withId(R.id.task_name_input)).perform(typeText("Buy milk"));
        Thread.sleep(500);

        // Tap on the 'Add' button to save the new task
        onView(withText("Add")).inRoot(isDialog()).perform(click());
        Thread.sleep(500);

        // Verify that the new task 'Buy milk' is added to the 'MY TASK LIST' tab
        onView(withText("Buy milk")).check(matches(isDisplayed()));
    }
}