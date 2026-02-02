package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.RecyclerView;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_15979_1597902 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNavigateToSkinsSection() throws InterruptedException {
        // Step 1: Open the app and navigate to the menu section.
        onView(withId(R.id.id_drawer)).perform(ViewActions.click());
        
        // Step 2: Click on the 'Skins' section.
        Thread.sleep(500);
        onView(withId(R.id.id_drawer)).perform(ViewActions.click());

        // Wait for the RecyclerView to be displayed
        Thread.sleep(500);

        // Assert that the Skins section is displayed with the correct subtitle
        onView(withId(R.id.id_drawer)).check(matches(isDisplayed()));
        Espresso.onView(withId(R.id.id_drawer))
                .check(matches(hasSubtitle("All the most interesting topics skins GTA.")));

        // Helper method to check if a view has a specific subtitle
        private static Matcher<View> hasSubtitle(final String expectedSubtitle) {
            return new TypeSafeMatcher<View>() {
                @Override
                protected boolean matchesSafely(View item) {
                    if (item instanceof RecyclerView) {
                        RecyclerView recyclerView = (RecyclerView) item;
                        for (int i = 0; i < recyclerView.getAdapter().getItemCount(); i++) {
                            String subtitle = ((TextView) recyclerView.findViewHolderForAdapterPosition(i).itemView.findViewById(R.id.subtitle)).getText().toString();
                            if (subtitle.equals(expectedSubtitle)) {
                                return true;
                            }
                        }
                    }
                    return false;
                }

                @Override
                public void describeTo(Description description) {
                    description.appendText("with subtitle: " + expectedSubtitle);
                }
            };
        }
    }
}