package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.EditText;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

@RunWith(AndroidJUnit4.class)
public class Test_12833_1283303 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheDisplayOfRepliesInTheAnimalsNatureThread() throws InterruptedException {
        // Step 1: Open the app and navigate to the 'Animals & Nature' thread.
        Espresso.onView(ViewMatchers.withText("Animals & Nature")).perform(ViewActions.click());

        // Step 2: Click on the 'REPLY' button next to the first post.
        Thread.sleep(500);
        Espresso.onView(withId(R.id.id_fab_add_content)).perform(ViewActions.click());

        // Step 3: Enter a reply and submit it.
        Thread.sleep(500);
        EditText replyEditText = activityRule.getActivity().findViewById(R.id.reply_edit_text);
        replyEditText.perform(ViewActions.typeText("This is a test reply."));
        Espresso.onView(withId(R.id.submit_reply_button)).perform(ViewActions.click());

        // Step 4: Verify that the reply is displayed in the thread.
        Thread.sleep(500);
        Espresso.onView(withText("This is a test reply.")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}