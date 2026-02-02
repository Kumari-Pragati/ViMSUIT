package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_14549_14549001 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testLoginWithValidCredentials() throws InterruptedException {
        // Open the app (already done by ActivityTestRule)

        // Test each element
        onView(withId(R.id.id_createAccount))
                .perform(click());
        Thread.sleep(500);
        // Verify state
        onView(withId(R.id.id_login_button)).check(matches(isDisplayed()));

        onView(withId(R.id.id_signup_tandc))
                .perform(click());
        Thread.sleep(500);
        // Verify state
        onView(withId(R.id.id_login_button)).check(matches(isDisplayed()));
    }
}
```

Note: The `MainActivity` class should have the necessary UI elements and logic to handle login actions. Also, ensure that the `id_createAccount` and `id_signup_tandc` views are correctly defined in your XML layout files and that they lead to the appropriate actions (e.g., showing the login screen).