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

@RunWith(AndroidJUnit4.class)
public class Test_15449_1544905 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyThatTheSearchIconInTheHeaderFunctionsCorrectly() throws InterruptedException {
        // Navigate to the Book of Mormon section and select chapter 7
        onView(withId(R.id.id_main_page_menu_btn)).perform(click());
        Thread.sleep(500);
        Espresso.closeSoftKeyboard();
        
        // Select "Book of Mormon" from the menu
        onView(withText("Book of Mormon")).perform(click());
        Thread.sleep(500);

        // Select chapter 7
        onView(withText("7")).perform(click());
        Thread.sleep(500);

        // Test each element
        for (int i = 1; i <= 4; i++) {
            switch (i) {
                case 1:
                    // Element 1: withId(R.id.id_main_page_menu_btn)
                    onView(withId(R.id.id_main_page_menu_btn)).perform(click());
                    Thread.sleep(500);
                    break;
                case 2:
                    // Element 2: withId(R.id.id_main_page_search_btn)
                    onView(withId(R.id.id_main_page_search_btn)).perform(click());
                    Thread.sleep(500);
                    Espresso.closeSoftKeyboard();
                    onView(withText("Search")).perform(ViewActions.typeText("test"), ViewActions.pressImeActionName("done"));
                    break;
                case 3:
                    // Element 3: withId(R.id.id_text_item_menu_button)
                    onView(withId(R.id.id_text_item_menu_button)).perform(click());
                    Thread.sleep(500);
                    break;
                case 4:
                    // Element 4: withId(R.id.id_sound_item_button)
                    onView(withId(R.id.id_sound_item_button)).perform(click());
                    Thread.sleep(500);
                    break;
            }
        }

        // Verify the search results are displayed correctly
        Espresso.closeSoftKeyboard();
        onView(withText("test")).check(ViewAssertions.matches(isDisplayed()));
    }
}