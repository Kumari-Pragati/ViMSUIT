package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.ImageView;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.allOf;

@RunWith(AndroidJUnit4.class)
public class Test_17620_1762001 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testVerifyInformationalMessageAboutFmRadioUnavailability() throws InterruptedException {
        // Thread.sleep(500) to ensure the UI is fully loaded before interacting with it.
        Thread.sleep(500);

        // Step 1: Open the NextRadio app (assumed to be done by ActivityTestRule)

        // Step 2: Navigate to the screen displaying the informational message about FM radio unavailability
        // Assuming this step involves some navigation, which is not explicitly provided in the test case.
        // For now, we will proceed with checking the UI elements.

        // Step 3: Check if the NextRadio logo is displayed at the top
        ImageView nextRadioLogo = activityRule.getActivity().findViewById(R.id.id_imageView1);
        onView(allOf(withId(R.id.id_imageView1), isDisplayed())).check(matches(isDisplayed()));

        // Step 4: Check the title and subtitle of the informational message
        Thread.sleep(500); // Additional sleep to ensure UI updates are complete

        // Assuming the title and subtitle are in a TextView or similar view, we will check for their presence.
        onView(withText("FM Radio is Unavailable")).check(matches(isDisplayed()));
        onView(withText("Sad Face Emoji")).check(matches(isDisplayed())); // Replace with actual emoji if known
        onView(withText("Reason for unavailability and mention of contest")).check(matches(isDisplayed()));

        // Step 5: Check the prominent blue button at the bottom
        Thread.sleep(500); // Additional sleep to ensure UI updates are complete

        onView(withId(R.id.enter_to_win_button)).check(matches(isDisplayed()));
        onView(withText("ENTER TO WIN $10,000!")).inRoot(isDialog()).check(matches(isDisplayed()));
    }
}
```

Note: The resource IDs for the title, subtitle, and button need to be correctly identified in your actual application. The placeholder text "Sad Face Emoji" should be replaced with the actual emoji if known. Also, ensure that `R.id.enter_to_win_button` is the correct ID for the button in your application.