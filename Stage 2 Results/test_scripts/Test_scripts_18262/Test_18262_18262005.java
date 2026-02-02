package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.v4.widget.DrawerLayout;
import org.junit.Rule;
import org.junit.Test;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

public class Test_18262_18262005 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyNavigationToEngineCodesScreenFromDeviceScreen() throws InterruptedException {
        // Open the navigation drawer
        Espresso.onView(withId(R.id.id_navigationDrawerFragment_navigationExpandableList)).perform(ViewActions.click());

        // Wait for 500ms to ensure the drawer is open and interaction is smooth
        Thread.sleep(500);

        // Assuming 'Engine Codes' is a child item in the ExpandableListView, click on it
        Espresso.onView(withId(R.id.id_navigationDrawerFragment_navigationExpandableList)).perform(ViewActions.click());

        // Wait for 500ms to ensure the Engine Codes screen is loaded
        Thread.sleep(500);

        // Verify that the Engine Codes screen is displayed
        Espresso.onView(withId(R.id.engine_codes_screen_container)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}
```

Note: The resource ID `R.id.engine_codes_screen_container` should be replaced with an actual ID of the container or a view in the Engine Codes screen. This example assumes that there is such a view and it has been properly defined in your layout XML files.