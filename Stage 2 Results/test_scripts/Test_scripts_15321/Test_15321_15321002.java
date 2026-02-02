package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_15321_15321002 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(5, java.util.concurrent.TimeUnit.SECONDS);

    @Test
    public void testNegativeFlowAttemptToLikeThePostWithoutBeingLoggedIn() throws InterruptedException {
        // Step 1: Open the Talklife app (Assuming it's already open)
        
        // Step 2: Navigate to the post with specific text and emojis
        Espresso.onView(withId(R.id.post_text)).check(matches(withText("Pretty much irritated You always help somebody on here But when you need it nobody gives a fuck")));
        Espresso.onView(withId(R.id.post_emoji_container)).check(matches(hasChildView(withId(R.id.emoji_neutral))));
        
        // Step 3: Click on the like icon
        Thread.sleep(500);
        onView(withId(R.id.id_ib_heart)).perform(click());
        
        // Expected Result: Like icon is not clickable and an error message is displayed
        Thread.sleep(500);
        onView(withId(R.id.id_ib_heart)).check(matches(isClickable(false)));
        Espresso.onView(withText("Please log in to like this post.")).inRoot(isDialog()).check(ViewAssertions.matches(isDisplayed()));
    }
}
```

Note: The `MainActivity` class and the necessary UI elements (like `post_text`, `post_emoji_container`, etc.) should be present in your application for this test to work as expected. Additionally, ensure that the error message "Please log in to like this post." is correctly displayed when the user tries to like a post without being logged in.