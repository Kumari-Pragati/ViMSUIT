package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.EditText;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.InstrumentationRegistry.getInstrumentation;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(JUnit4.class)
public class Test_14862_14862003 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testLoginWithEmptyEmailField() throws InterruptedException {
        // Step 1: Open the app and navigate to the login screen (Assuming it's already on the login screen)
        
        // Step 2: Enter '' into the email input field
        onView(withId(R.id.id_login_edittext_email)).perform(clearText());
        
        Thread.sleep(500); // Wait for UI to update
        
        // Step 3: Enter 'SecurePassword123' into the password input field
        onView(withId(R.id.id_login_edittext_password)).perform(typeText("SecurePassword123"));
        
        Thread.sleep(500); // Wait for UI to update
        
        // Step 4: Tap the 'LOGIN' button
        onView(withId(R.id.id_login_button)).perform(ViewActions.click());
        
        Thread.sleep(500); // Wait for UI to update
        
        // Expected Result: An error message is displayed indicating empty email field
        onView(withText("Please enter your email")).inRoot(isToast()).check(matches(isDisplayed()));
    }
}
```

Note:
- The `MainActivity` class should have the necessary views with IDs as specified.
- The `R.id.id_login_edittext_password`, `R.id.id_login_button`, and the error message text need to be defined in the corresponding XML layout files or resources.
- The `isToast()` method is a custom matcher that checks if the view is a toast. You can implement it using Espresso's `RootMatchers` as follows:

```java
import android.support.test.espresso.RootMatchers;
import android.widget.Toast;

public class Test_14862_14862003 {

    // ... other code ...

    private static Matcher<View> isToast() {
        return RootMatchers.withDecorView(not(isRoot()));
    }
}
```

This implementation assumes that the error message "Please enter your email" is shown as a toast. Adjust the text and resource IDs according to your actual application setup.