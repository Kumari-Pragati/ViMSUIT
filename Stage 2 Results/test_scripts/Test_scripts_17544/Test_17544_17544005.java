package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_17544_17544005 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeSignUpWithMissingFields() throws InterruptedException {
        // Test each element
        for (String buttonId : new String[]{"id_LoginButton", "id_RegisterButton", "id_fb_login_button"}) {
            onView(withId(Integer.parseInt(buttonId.replace("id_", ""))))
                    .perform(click());
            Thread.sleep(500);
            
            Espresso.onView(ViewMatchers.withText(R.string.error_missing_fields))
                    .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        }
    }
}