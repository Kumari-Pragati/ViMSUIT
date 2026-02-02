package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_11751_1175105 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testCheckForDuplicateBusRoutes() throws InterruptedException {
        // Step 1: Open the app and navigate to the 'Bus Routes' screen.
        Espresso.onView(withId(R.id.id_listView1)).check(ViewAssertions.matches(isDisplayed()));

        // Step 2: Verify that there are no duplicate bus routes in the list.
        Thread.sleep(500); // Wait for UI to update

        // Get all items from the ListView
        String[] items = getListViewItems();

        // Check if any item appears more than once
        boolean hasDuplicates = false;
        for (int i = 0; i < items.length; i++) {
            int count = 1;
            for (int j = i + 1; j < items.length; j++) {
                if (items[i].equals(items[j])) {
                    count++;
                }
            }
            if (count > 1) {
                hasDuplicates = true;
                break;
            }
        }

        // Assert that there are no duplicates
        assert !hasDuplicates : "Duplicate bus routes found in the list";

        Thread.sleep(500); // Wait for UI to update before finishing test
    }

    private String[] getListViewItems() {
        return Espresso.onView(withId(R.id.id_listView1)).perform(getAllItemTexts()).toString().split("\n");
    }

    private static class ItemCollector implements ViewAction {
        @Override
        public Matcher<View> getConstraints() {
            return null;
        }

        @Override
        public String getDescription() {
            return "get all item texts";
        }

        @Override
        public void perform(UiController uiController, View view) {
            if (view instanceof ListView) {
                ListView listView = (ListView) view;
                final ListAdapter adapter = listView.getAdapter();
                final int count = adapter.getCount();

                final ArrayList<String> items = new ArrayList<>();
                for (int i = 0; i < count; i++) {
                    items.add(adapter.getItem(i).toString());
                }

                uiController.loopMainThreadUntilIdle();
                String[] result = new String[items.size()];
                items.toArray(result);
                return result;
            }
        }
    }

    private static ViewAction getAllItemTexts() {
        return new ItemCollector();
    }
}