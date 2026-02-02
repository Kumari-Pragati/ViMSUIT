package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_14549_14549003 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testLoginWithEmptyFields() throws InterruptedException {
        // Open the app (already done by ActivityTestRule)

        // Test each element
        for (int i = 0; i < 2; i++) {
            switch (i) {
                case 0:
                    onView(withId(R.id.id_createAccount))
                            .perform(click());
                    Thread.sleep(500);
                    break;
                case 1:
                    onView(withId(R.id.id_signup_tandc))
                            .perform(click());
                    Thread.sleep(500);
                    break;
            }

            // Perform login steps
            onView(withId(R.id.login_username)).perform(ViewActions.clearText()).perform(ViewActions.typeText("")).perform(ViewActions.closeSoftKeyboard());
            Thread.sleep(500);

            onView(withId(R.id.login_password)).perform(ViewActions.clearText()).perform(ViewActions.typeText("")).perform(ViewActions.closeSoftKeyboard());
            Thread.sleep(500);

            onView(withId(R.id.login_button))
                    .perform(click());

            // Verify error message is displayed
            if (i == 0) {
                onView(withText("Please enter a valid username"))
                        .inRoot(isDialog())
                        .check(matches(isDisplayed()));
            } else if (i == 1) {
                onView(withText("Please enter a valid password"))
                        .inRoot(isDialog())
                        .check(matches(isDisplayed()));
            }

            Thread.sleep(500);
        }
    }
}
```

Note: Ensure that the IDs and text for error messages match your actual application. Adjust `R.id.login_username`, `R.id.login_password`, and `R.id.login_button` as necessary to fit your application's UI structure.