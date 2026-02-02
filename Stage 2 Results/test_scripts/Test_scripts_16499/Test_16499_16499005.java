package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.ImageView;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.assertTrue;

@RunWith(JUnit4.class)
public class Test_16499_16499005 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Before
    public void setUp() {
        // Initial setup if needed
    }

    @Test
    public void testUserCanAddAChapterToFavorites() throws InterruptedException {
        // Step 1: Open the app and navigate to the manga '俺のメンタルは限界です' by 藤アイリ.
        onView(ViewMatchers.withText("俺のメンタルは限界です")).perform(click());

        // Step 2: Click on the '話一覧' (Chapter List) tab.
        Thread.sleep(500);
        onView(withId(R.id.id_viewpager)).perform(ViewActions.click());

        // Step 3: Click on the '今すぐ読めます!' (Read Now!) button for the first chapter.
        Thread.sleep(500);
        onView(withText("今すぐ読めます!")).perform(click());

        // Step 4: Locate and click on the yellow star icon to add the chapter to favorites.
        Thread.sleep(500);
        ImageView favoriteIcon = (ImageView) activityTestRule.getActivity().findViewById(R.id.favorite_icon);
        assertTrue(favoriteIcon != null);

        // Perform click on the favorite icon
        Thread.sleep(500);
        favoriteIcon.perform(ViewActions.click());

        // Expected Result: The chapter should be added to the user's favorites list.
        Thread.sleep(500);
        onView(withId(R.id.favorite_icon)).check(matches(ViewMatchers.isDisplayed()));
    }
}