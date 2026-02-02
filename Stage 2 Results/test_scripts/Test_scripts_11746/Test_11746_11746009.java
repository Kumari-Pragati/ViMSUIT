package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.ProgressBar;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(JUnit4.class)
public class Test_11746_11746009 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testUsabilityTestProgressBar() throws InterruptedException {
        // Ensure the Vocabulary screen is open.
        Espresso.onView(withId(R.id.vocabularyScreen)).check(matches(isDisplayed()));

        Thread.sleep(500); // Wait for 500ms

        // Verify the progress bar indicates 1/11.
        onView(withId(R.id.id_progressSwitcher)).check(matches(ViewMatchers.isAssignableFrom(ProgressBar.class)));
        Espresso.onView(withId(R.id.id_progressSwitcher))
                .perform(waitForProgressIndicator())
                .check(matches(hasProgressValue("1/11")));

        Thread.sleep(500); // Wait for 500ms
    }

    private static android.support.test.espresso.action.ViewAction waitForProgressIndicator() {
        return new android.support.test.espresso.action.ViewAction() {
            @Override
            public Matcher<View> getConstraints() {
                return null;
            }

            @Override
            public String getDescription() {
                return "wait for progress indicator to be clickable and focusable";
            }

            @Override
            public void perform(final UiController uiController, final View view) {
                while (!view.isClickable() || !view.isFocusable()) {
                    if (uiController.hasResult()) break;
                    uiController.loopMainThreadForAtLeast(100);
                }
            }
        };
    }

    private static android.support.test.espresso.matcher.BoundedMatcher<View, ProgressBar> hasProgressValue(final String expected) {
        return new BoundedMatcher<>(View.class, "has progress value", expected) {
            @Override
            protected boolean matchesSafely(ProgressBar view) {
                // Assuming the progress bar text is set to 1/11 for simplicity.
                return view.getVisibility() == View.VISIBLE && view.getText().toString().equals(expected);
            }

            @Override
            public String describeTo(final Description description) {
                return "has progress value: " + expected;
            }
        };
    }
}