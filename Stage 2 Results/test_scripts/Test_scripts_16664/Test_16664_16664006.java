package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

@RunWith(AndroidJUnit4.class)
public class Test_16664_16664006 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickOnTheUploadReceiptButtonInTheFooter() throws InterruptedException {
        // Navigate to the Checkout 51 screen (Assuming it's already on this screen)
        
        // Click on the 'Upload Receipt' button in the footer
        Thread.sleep(500);
        onView(withId(R.id.id_btn_upload)).perform(ViewActions.click());
        Thread.sleep(500);

        // Expected result: The app should navigate to the receipt upload screen.
        // Here we can assert that the current activity is not MainActivity anymore
        assertThat(activityRule.getActivity(), not(MainActivity.class));
    }
}