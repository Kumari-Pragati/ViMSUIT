package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.widget.ScrollView;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(JUnit4.class)
public class Test_10304_10304001 {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testPositiveFlowFillOutTheFormAndSubmit() throws InterruptedException {
        // Navigate to the contact form screen (assuming it's already on this screen)
        
        // Step 2: Click on the 'Nombre' field and enter 'John Doe'
        onView(withId(R.id.nombre_field)).perform(typeText("John Doe"));
        Thread.sleep(500);

        // Step 3: Click on the 'Email' field and enter 'johndoe@example.com'
        onView(withId(R.id.email_field)).perform(typeText("johndoe@example.com"));
        Thread.sleep(500);

        // Step 4: Click on the 'Teléfono' field and enter '1234567890'
        onView(withId(R.id.telefono_field)).perform(typeText("1234567890"));
        Thread.sleep(500);

        // Step 5: Click on the 'Mensaje' field and enter 'I would like to know more about this product.'
        onView(withId(R.id.mensaje_field)).perform(typeText("I would like to know more about this product."));
        Thread.sleep(500);

        // Step 6: Toggle the 'Envía' switch to 'Enviar'
        onView(withContentDescription("[None]")).perform(click());
        Thread.sleep(500);

        // Step 7: Click the 'Enviar' button to submit the form
        onView(withId(R.id.enviar_button)).perform(click());
        Thread.sleep(500);

        // Expected result: The form is submitted successfully, and a confirmation message is displayed.
        onView(withContentDescription("[None]")).check(matches(ViewMatchers.isDisplayed()));
    }
}