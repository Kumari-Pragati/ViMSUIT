package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

@RunWith(AndroidJUnit4.class)
public class Test_1184_1184004 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testInputAndVerifyTheWeightField() throws InterruptedException {
        // Open the app (already done by ActivityTestRule)

        // Navigate to the pregnancy calendar view
        onView(ViewMatchers.withContentDescription("['Open navigation drawer']"))
                .perform(ViewActions.click());
        Thread.sleep(500);

        // Click on the weight field and input '10 lbs'
        onView(withId(R.id.id_drawer_layout))
                .perform(click());
        Thread.sleep(500);
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.id_pager))
                .perform(ViewActions.click());
        Thread.sleep(500);
        onView(withId(R.id.id_listView))
                .perform(ViewActions.click());
        Thread.sleep(500);
        onView(withId(R.id.id_imageViewItem))
                .perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("Weight"))
                .inRoot(ViewMatchers.withParent(ViewMatchers.isAssignableFrom(android.widget.FrameLayout.class)))
                .perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.closeSoftKeyboard();
        Espresso.onView(ViewMatchers.withText("10 lbs")).perform(ViewActions.typeText("10 lbs"));
        Thread.sleep(500);

        // Verify the weight field is updated to '10 lbs'
        onView(ViewMatchers.withText("10 lbs"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Continue for all elements...
    }
}
```

Note: The above code assumes that the `MainActivity` has a method or view that navigates to the pregnancy calendar view. If this is not the case, you may need to adjust the test steps accordingly. Additionally, the `id_imageViewItem` might be used multiple times in the same view, so ensure it's correctly identified and interacted with.