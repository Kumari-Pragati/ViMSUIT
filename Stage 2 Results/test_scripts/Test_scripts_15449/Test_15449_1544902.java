package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_15449_1544902 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testSearchForASpecificVerseInChapter() throws InterruptedException {
        // Open the app (Assuming it's already open, or you can add an intent to launch it)

        // Test each element
        onView(withId(R.id.id_main_page_menu_btn))
                .perform(click());
        Thread.sleep(500);
        onView(withId(R.id.id_text_item_menu_button))
                .check(matches(isDisplayed()));
        
        onView(withId(R.id.id_main_page_search_btn))
                .perform(click());
        Thread.sleep(500);
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.id_main_page_search_edit_text)) // Assuming there's a search edit text
                .perform(ViewActions.typeText("7"), ViewActions.pressImeActionButton());
        Thread.sleep(500);
        
        onView(withId(R.id.id_sound_item_button))
                .check(matches(isDisplayed()));
    }
}
```

Note: The above code assumes that the `MainActivity` is already launched and that there's a search edit text field with an ID like `id_main_page_search_edit_text`. You may need to adjust the IDs or add more specific actions based on your actual UI structure. Additionally, you might want to include more detailed assertions and handling for each step of the test case.