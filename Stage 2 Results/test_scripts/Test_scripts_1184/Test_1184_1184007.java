package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import static android.support.test.espresso.Espresso.*;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_1184_1184007 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testInputAndVerifyTheNormalHcgField() throws InterruptedException {
        // Open the app (already done by ActivityTestRule)

        // Navigate to the pregnancy calendar view
        onView(withId(R.id.id_drawer_layout))
                .perform(click());
        Thread.sleep(500);
        
        onView(withContentDescription("['Open navigation drawer']"))
                .perform(click());
        Thread.sleep(500);

        // Click on the normal hCG field and input '1000 mIU/mL'
        onView(withId(R.id.id_pager))
                .perform(click());
        Thread.sleep(500);
        
        onView(withId(R.id.id_listView))
                .perform(click());
        Thread.sleep(500);

        // Assuming the hCG field is a TextView or EditText, input '1000 mIU/mL'
        onView(withId(R.id.id_imageViewItem)) // Assuming this is the hCG field
                .perform(click(), typeText("1000 mIU/mL"), closeSoftKeyboard());
        Thread.sleep(500);

        // Verify the normal hCG field is updated to '1000 mIU/mL'
        onView(withId(R.id.id_imageViewItem)) // Assuming this is the hCG field
                .check(matches(withText("1000 mIU/mL")));

        // Continue for all elements...
        
        // Element 8: withId(R.id.id_buttonPrev)
        onView(withId(R.id.id_buttonPrev))
                .perform(click());
        Thread.sleep(500);

        // Element 9: withId(R.id.id_buttonNext)
        onView(withId(R.id.id_buttonNext))
                .perform(click());
        Thread.sleep(500);

        // Element 10: withContentDescription("['Open navigation drawer']")
        onView(withContentDescription("['More options']"))
                .perform(click());
        Thread.sleep(500);

        // Element 12, 13, and 14: withContentDescription("[None]")
        onView(withContentDescription("[None]"))
                .perform(click());
        Thread.sleep(500);
    }
}