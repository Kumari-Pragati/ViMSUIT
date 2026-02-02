package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.RecyclerView;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class Test_16499_16499001 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUserCanNavigateToTheChapterListPage() throws InterruptedException {
        // Step 1: Open the app and navigate to the manga '俺のメンタルは限界です' by 藤アイリ.
        // Assuming there is a way to select the manga in the UI, for example, using a spinner or list view
        // Here we simulate selecting the manga
        onView(withText("俺のメンタルは限界です")).perform(ViewActions.click());

        Thread.sleep(500); // Wait for the UI to update

        // Step 2: Click on the '話一覧' (Chapter List) tab.
        onView(withId(R.id.id_tabs)).perform(ViewActions.click());

        Thread.sleep(500); // Wait for the UI to update

        // Expected Result: The user should be on the chapter list page for the manga '俺のメンタルは限界です'.
        onView(withId(R.id.chapter_list_recycler_view)).check(matches(isDisplayed()));

        Espresso.pressBack(); // Go back to previous screen
    }
}