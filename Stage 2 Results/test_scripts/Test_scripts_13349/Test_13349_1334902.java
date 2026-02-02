package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.RecyclerView;

import org.junit.Rule;
import org.junit.Test;

public class Test_13349_1334902 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickOnEachLegalLinkToVerifyNavigation() throws InterruptedException {
        // Open the app and navigate to the Legal screen
        onView(withId(R.id.id_recycler_view_legal_items))
                .perform(ViewActions.click());
        Thread.sleep(500);
        
        // Verify state after clicking on 'Online security'
        Espresso.onView(ViewMatchers.withText("Online security"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        
        // Repeat for Privacy policy
        onView(ViewMatchers.withText("Privacy policy"))
                .perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("Privacy policy"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Repeat for Terms of use
        onView(ViewMatchers.withText("Terms of use"))
                .perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("Terms of use"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Repeat for Pay to mobile terms
        onView(ViewMatchers.withText("Pay to mobile terms"))
                .perform(ViewActions.click());
        Thread.sleep(500);
        Espresso.onView(ViewMatchers.withText("Pay to mobile terms"))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}
```

Note: The above code assumes that the text of each legal link is unique and matches exactly with the expected text. If the texts are different, you should replace "Online security", "Privacy policy", etc., with the actual text displayed on your app's screen. Additionally, ensure that the `MainActivity` class has a view with id `id_recycler_view_legal_items` containing the legal links.