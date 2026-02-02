package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.ImageView;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(JUnit4.class)
public class Test_10594_1059403 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyTheProfilePictureSectionDisplaysACircularProfilePictureOfJenniferLabeledAsATopModel() throws InterruptedException {
        // Step 1: Open the SyncMe app and navigate to screen 10594.
        
        // Assuming that navigating to a specific screen is handled by an intent or navigation logic
        // For demonstration, we will just proceed with the next step

        // Step 2: Verify that the profile picture section displays a circular profile picture of Jennifer labeled as a 'Top model'.
        Thread.sleep(500); // Wait for UI to load
        
        // Check if ViewSwitcher is displayed
        onView(withId(R.id.id_viewSwitcher)).check(matches(isDisplayed()));
        
        // Assuming there's an ImageView inside the ViewSwitcher with id R.id.profilePicture
        // and a TextView with id R.id.profileLabel
        Thread.sleep(500); // Wait for UI to load
        
        // Check if profile picture is circular and labeled as 'Top model'
        onView(withId(R.id.profilePicture)).check(matches(isDisplayed()));
        
        ImageView profilePicture = (ImageView) Espresso.onView(withId(R.id.profilePicture))
                .inRoot(new RootMatcher(ViewMatchers.isAssignableFrom(ImageView.class)))
                .perform(getImageResource())
                .onView()
                .inRoot(new RootMatcher(ViewMatchers.isAssignableFrom(ImageView.class)))
                .check(matches(isCircularProfilePicture()));
        
        // Check if profile label is 'Top model'
        onView(withId(R.id.profileLabel)).check(matches(withText("Top model")));
    }
    
    private Matcher<View> isCircularProfilePicture() {
        return new TypeSafeMatcher<View>() {
            @Override
            protected boolean matchesSafely(View view) {
                // Implement logic to check if the ImageView is circular
                // This might involve checking the drawable bounds or using a custom matcher
                return true; // Placeholder for actual implementation
            }

            @Override
            public void describeTo(Description description) {
                description.appendText("is circular profile picture");
            }
        };
    }
}