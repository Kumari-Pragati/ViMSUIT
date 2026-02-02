package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.Button;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_124_124005 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testClickableButtonsClassificationSection() throws InterruptedException {
        // Step 1: Open the app and navigate to the Waist to Height Ratio screen.
        onView(withId(R.id.id_gender_woman_button)).perform(click());
        Thread.sleep(500);
        
        // Step 2: Enter the age as 26.
        onView(ViewMatchers.withText("Age")).perform(ViewActions.typeText("26"));
        Thread.sleep(500);

        // Step 3: Select the gender as Female (already done in step 1).
        
        // Step 4: Enter the height as 6 feet.
        onView(withId(R.id.id_height_input)).perform(ViewActions.typeText("6 ft"));
        Thread.sleep(500);
        
        // Step 5: Enter the waist measurement as 0 cm.
        onView(withId(R.id.id_waist_input)).perform(ViewActions.typeText("0 cm"));
        Thread.sleep(500);

        // Step 6: Click on the 'WAIST TO HEIGHT RATIO' button.
        onView(withId(R.id.id_calculate_button)).perform(click());
        Thread.sleep(500);
        
        // Step 7-10: Click on the weight classifications
        for (String classification : new String[]{"UnderWeight", "Normal", "OverWeight", "Obese"}) {
            onView(withText(classification)).perform(click());
            Thread.sleep(500);
        }

        // Verify state after each click
        for (int i = 1; i <= 4; i++) {
            String classification = "Classification" + i;
            onView(withId(R.id.classification_text_view)).check(matches(ViewMatchers.withText(classification)));
            Thread.sleep(500);
        }
    }
}
```

Note: The above code assumes that the `MainActivity` has a button with id `id_calculate_button`, and there are text views or other UI elements to display the selected classifications. Adjust the IDs and texts as per your actual application structure.