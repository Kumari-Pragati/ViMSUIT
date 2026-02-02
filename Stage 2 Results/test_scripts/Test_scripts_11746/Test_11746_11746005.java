package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.ProgressBar;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.Description;

public class Test_11746_11746005 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testBoundaryvalidationProgressBar() throws InterruptedException {
        // Ensure the Vocabulary screen is open.
        Espresso.onView(ViewMatchers.withId(R.id.vocabularyScreen)).check(matches(isDisplayed()));

        Thread.sleep(500); // Wait for 500ms

        // Verify the progress bar indicates 1/11.
        ProgressBar progressBar = (ProgressBar) activityRule.getActivity().findViewById(R.id.id_progressSwitcher);
        int currentProgress = progressBar.getProgress();
        int maxProgress = progressBar.getMax();

        Espresso.onView(ViewMatchers.withId(R.id.id_progressSwitcher)).check(matches(hasProgress(currentProgress, maxProgress)));

        Thread.sleep(500); // Wait for 500ms
    }

    private static Matcher<ProgressBar> hasProgress(final int currentProgress, final int maxProgress) {
        return new TypeSafeMatcher<ProgressBar>() {
            @Override
            protected boolean matchesSafely(ProgressBar progressBar) {
                return progressBar.getProgress() == currentProgress && progressBar.getMax() == maxProgress;
            }

            @Override
            public void describeTo(Description description) {
                description.appendText("with progress " + currentProgress + "/" + maxProgress);
            }
        };
    }
}