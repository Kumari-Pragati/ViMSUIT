package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;

@RunWith(AndroidJUnit4.class)
public class Test_11148_11148004 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testGenerated() throws InterruptedException {
        // Open the app and navigate to login screen (assuming it's already open)
        
        // Step 1: Click '请登录' text
        onView(ViewMatchers.withText("请登录")).perform(ViewActions.click());
        Thread.sleep(500);

        // Step 2-4: Input username, password, and click login button
        Espresso.onView(ViewMatchers.withText("用户名"))
                .perform(ViewActions.typeText("testUser"));
        Espresso.onView(ViewMatchers.withText("密码"))
                .perform(ViewActions.typeText("testPassword"));
        Espresso.onView(ViewMatchers.withText("登录")).perform(ViewActions.click());
        Thread.sleep(500);

        // Step 6: Click '开始游戏' button
        onView(withContentDescription("[None]")).perform(click());
        Thread.sleep(500);

        // Step 7: Click '音乐日报' button
        Espresso.onView(ViewMatchers.withText("音乐日报"))
                .perform(ViewActions.click());
        Thread.sleep(500);

        // Test each element
        for (int i = 1; i <= 15; i++) {
            switch (i) {
                case 1:
                    onView(withContentDescription("['知乎日报']")).perform(click());
                    Thread.sleep(500);
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                    onView(withContentDescription("[None]")).perform(click());
                    Thread.sleep(500);
                    break;
                case 14:
                    onView(withId(com.zhihu.daily.android.R.id.main_layout)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
                    Thread.sleep(500);
                    break;
                case 15:
                    onView(withContentDescription("['']")).perform(click());
                    Thread.sleep(500);
                    break;
            }
        }

        // Verify state of each element (example for the last element)
        Espresso.onView(withId(com.zhihu.daily.android.R.id.action_theme_edit)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}