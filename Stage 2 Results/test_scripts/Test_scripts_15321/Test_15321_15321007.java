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

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static java.lang.Thread.sleep;

@RunWith(AndroidJUnit4.class)
public class Test_15321_15321007 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class, true, false);

    @Rule
    public Timeout timeout = new Timeout(5000); // Set a reasonable timeout

    @Test
    public void testUsabilityEnsureThePostContentIsEasyToRead() throws InterruptedException {
        // Open the Talklife app (assumed to be opened by ActivityTestRule)
        
        // Navigate to the post with specific text and emojis
        onView(withId(R.id.id_rv_feed)).perform(ViewActions.scrollToPosition(0)); // Scroll to first position, adjust as needed
        
        // Verify that the post content is easy to read
        String targetPostText = "Pretty much irritated You always help somebody on here But when you need it nobody gives a fuck";
        onView(withText(targetPostText)).check(ViewAssertions.matches(isDisplayed()));
        
        sleep(500); // Add delay for UI to update
        
        // Additional checks can be added as needed
    }
}