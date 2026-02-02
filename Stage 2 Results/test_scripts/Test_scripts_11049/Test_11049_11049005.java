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

@RunWith(AndroidJUnit4.class)
public class Test_11049_11049005 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNegativeFlowSelectSomeTvServicesAndTryToConfirm() throws InterruptedException {
        // Loop through all 7 elements and perform test steps on each

        for (int i = 0; i < 7; i++) {
            onView(withId(R.id.id_item_softgate_radio)).perform(click());
            Thread.sleep(500);

            Espresso.onView(ViewMatchers.withId(R.id.id_item_softgate_radio))
                    .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

            // Navigate to the blue button 'TAK, TO MOJE KANAŁY'
            onView(withId(R.id.button_confirm)).perform(click());

            // Verify error message
            Espresso.onView(ViewMatchers.withText("All TV services must be selected"))
                    .inRoot(IsToastMatcher.instanceOf(android.widget.Toast.class))
                    .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        }
    }

}
```

Note: The `IsToastMatcher` is a custom matcher that you need to implement if it's not already available in your Espresso setup. Here’s an example of how you might implement it:

```java
import android.support.test.espresso.Root;
import android.support.test.espresso.ViewAssertion;
import android.view.View;

public class IsToastMatcher implements ViewAssertion {
    private static final IsToastMatcher instance = new IsToastMatcher();

    public static IsToastMatcher instanceOf(Class<?> clazz) {
        return instance;
    }

    @Override
    public void check(View view, NoMatchingViewException noViewFoundException) throws AssertionError {
        if (view == null || !(view instanceof android.widget.Toast)) {
            throw new AssertionError("Expected a Toast but got: " + view);
        }
    }

    @Override
    public String toString() {
        return "isToast";
    }
}
```

This code will loop through all 7 elements, click on each one, navigate to the confirmation button, and then verify that an error message is displayed.