package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.ImageButton;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static java.lang.Thread.sleep;

@RunWith(JUnit4.class)
public class Test_10966_1096603 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyThePresenceOfTheSubtitleUseTheSetOfEyeTestsInThisAppToCheckYourEyesightDetectEyeProblemsAndTakePreventiveMeasuresBeforeYouAreAbleToGetToTheDoctorsOffice() throws InterruptedException {
        // Step 1: Open the app and navigate to the 'About' page
        Thread.sleep(500);
        
        // Step 2: Verify that the subtitle reads as expected
        onView(withContentDescription("Navigate up")).perform(click());
        Thread.sleep(500);

        onView(ViewMatchers.withText(
                "Use the set of eye tests in this app to check your eyesight, detect eye problems and take preventive measures before you are able to get to the doctor's office."))
                .check(matches(ViewMatchers.isDisplayed()));
    }
}