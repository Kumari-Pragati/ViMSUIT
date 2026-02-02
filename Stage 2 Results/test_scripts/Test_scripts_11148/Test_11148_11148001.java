package com.example.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.filters.LargeTest;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class Test_11148_11148001 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testGenerated() throws InterruptedException {
        // Step 1: 打开应用
        Thread.sleep(500); // Wait for the app to start

        // Step 2: 检查是否显示'请登录'文本
        onView(allOf(withText("请登录"), isDisplayed())).check(matches(isDisplayed()));

        // Step 3: 点击'请登录'文本
        Thread.sleep(500); // Wait before interaction
        onView(allOf(withContentDescription("[\'知乎日报\']"), isDisplayed())).perform(click());

        // Expected Result: 显示登录页面
        Espresso.pressBack(); // Go back to the previous screen after login page
        onView(allOf(withText("请登录"), isDisplayed())).check(matches(isDisplayed()));
    }
}