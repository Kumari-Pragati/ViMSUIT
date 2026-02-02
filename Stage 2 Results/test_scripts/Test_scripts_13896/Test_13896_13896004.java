package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.widget.GridView;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static org.hamcrest.CoreMatchers.not;

public class Test_13896_13896004 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public Timeout timeout = new Timeout(5, java.util.concurrent.TimeUnit.SECONDS);

    @Test
    public void testSelectANonexistentAnimalFaceImage() throws InterruptedException {
        // Click on an area outside the 3x3 grid of animal face images.
        Espresso.onView(withContentDescription("[None]")).perform(ViewActions.click());
        
        Thread.sleep(500); // Wait for 500 milliseconds

        // Assert that no animal face image is selected
        GridView gridView = activityRule.getActivity().findViewById(R.id.animal_face_grid);
        int selectedImageCount = gridView.getAdapter().getCount();
        Espresso.onView(not(withContentDescription("[None]"))).check(matches(isDisplayed()));

        // Additional assertion to ensure the grid view does not have any selected item
        if (selectedImageCount > 0) {
            throw new AssertionError("An animal face image was unexpectedly selected.");
        }
    }
}