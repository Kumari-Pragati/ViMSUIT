package com.example.tests;

import android.support.test.espresso.Espresso;
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
public class Test_13189_13189003 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheDisplayOfArticleDetails() throws InterruptedException {
        // Step 1: Open the news application (Assuming it's already open, or launch it if needed)
        
        // Step 2: Navigate to the news feed section
        onView(withId(R.id.id_recyclerView)).performScrollToPosition(0);
        Thread.sleep(500); // Wait for RecyclerView to load

        // Step 3: Click on the first article headline 'Deadly storms hit Egypt'
        onView(withText("Deadly storms hit Egypt")).performClick();
        Thread.sleep(500); // Wait for the next screen to load
        
        // Step 4: Verify that the article details are displayed
        // Assuming the article details include headline, subtitle, and publication date
        Espresso.onView(withId(R.id.article_headline)).check(ViewAssertions.matches(withText("Deadly storms hit Egypt")));
        Espresso.onView(withId(R.id.article_subtitle)).check(ViewAssertions.matches(withText("Subtitle of the article")));
        Espresso.onView(withId(R.id.publication_date)).check(ViewAssertions.matches(withText("2023-10-05"))); // Example date
    }
}
```

Note: The resource IDs for `article_headline`, `article_subtitle`, and `publication_date` are assumed based on typical naming conventions. You should replace these with the actual resource IDs used in your application.