package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.Switch;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import static android.support.test.espresso.Espresso.*;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.*;

@RunWith(AndroidJUnit4.class)
public class Test_18587_1858706 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testDataPersistenceTestLogout() throws InterruptedException {
        // Open the app and navigate to the profile page for 'appcrawler4'
        
        // Step 1: Open the app (already done by ActivityTestRule)
        
        // Step 2: Navigate to the profile page for 'appcrawler4' - This step is not explicitly defined in Espresso, so we will assume it's handled elsewhere.
        
        // Step 3: Log out of the app
        onView(withId(R.id.id_mainMenu)).perform(click());
        Thread.sleep(500);
        onView(withText("Logout")).perform(click());
        Thread.sleep(500);

        // Step 4: Reopen the app (already done by ActivityTestRule)
        
        // Step 5: Attempt to navigate to the profile page for 'appcrawler4'
        
        // Loop through all elements and perform test steps on each
        for (int i = 1; i <= 11; i++) {
            switch (i) {
                case 1:
                    onView(withId(R.id.id_avatar)).perform(click());
                    Thread.sleep(500);
                    verifyElementNotDisplayed("Profile Page");
                    break;
                case 2:
                    onView(withId(R.id.id_switchAccount)).perform(click());
                    Thread.sleep(500);
                    verifyElementNotDisplayed("Switch Account Dialog");
                    break;
                case 3:
                    onView(withId(R.id.id_search)).perform(click());
                    Thread.sleep(500);
                    verifyElementNotDisplayed("Search Page");
                    break;
                case 4:
                    onView(withId(R.id.id_info)).perform(click());
                    Thread.sleep(500);
                    verifyElementNotDisplayed("Info Page");
                    break;
                case 5:
                    onView(withId(R.id.id_donate)).perform(click());
                    Thread.sleep(500);
                    verifyElementNotDisplayed("Donate Page");
                    break;
                case 6:
                    // This element is not directly interacted with, so no action needed
                    break;
                case 7:
                    // This element is a ViewPager, which doesn't need to be clicked but can be verified for presence
                    onView(withId(R.id.id_pager)).check(matches(isDisplayed()));
                    Thread.sleep(500);
                    verifyElementNotDisplayed("Profile Page");
                    break;
                case 8:
                    onView(withId(R.id.id_actionPeople)).perform(click());
                    Thread.sleep(500);
                    verifyElementNotDisplayed("People Page");
                    break;
                case 9:
                    onView(withId(R.id.id_actionMenu)).perform(click());
                    Thread.sleep(500);
                    verifyElementNotDisplayed("Action Menu");
                    break;
                case 10:
                    onView(withId(R.id.id_actionEngine)).perform(click());
                    Thread.sleep(500);
                    verifyElementNotDisplayed("Engine Page");
                    break;
                case 11:
                    // This element is a list, which doesn't need to be clicked but can be verified for presence
                    onView(withContentDescription("[None]")).check(matches(isDisplayed()));
                    Thread.sleep(500);
                    verifyElementNotDisplayed("Profile Page");
                    break;
            }
        }

        // Verify the profile page is not displayed after logout and reopening the app
        verifyElementNotDisplayed("Profile Page");

    }

    private void verifyElementNotDisplayed(String elementName) {
        onView(withText(elementName)).check(matches(not(isDisplayed())));
    }
}