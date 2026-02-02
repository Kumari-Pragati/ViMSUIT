package com.example.tests;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.AppCompatImageView;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class Test_11746_11746002 {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testPositiveFlowPlayTheKeyPhrase() throws InterruptedException {
        // Ensure the Vocabulary screen is open.
        onView(withId(R.id.your_vocab_screen_id)).check(matches(isDisplayed()));

        Thread.sleep(500); // Wait for 500ms

        // Click on the circular play button
        onView(withId(R.id.id_vocabItemSaveVocab)).perform(ViewActions.click());

        Thread.sleep(500); // Wait for 500ms to ensure audio plays

        // Verify that the audio is played (you may need to use a more specific assertion)
        // For example, you can check if a certain view or toast message appears
        // Here we assume there's an indicator view that shows when audio is playing
        onView(withId(R.id.your_audio_playing_indicator_id)).check(matches(isDisplayed()));

        Thread.sleep(500); // Wait for 500ms

        // Verify the key phrase 'content / contente' is played (this might require a more complex assertion)
        // For example, you can check if a certain view or toast message appears
        // Here we assume there's a text view that shows the key phrase when audio plays
        onView(withId(R.id.your_key_phrase_display_id)).check(matches(ViewMatchers.withText("content / contente")));
    }
}
```

**Note:**
- Replace `your_vocab_screen_id`, `id_vocabItemSaveVocab`, and `your_audio_playing_indicator_id` with the actual resource IDs of your views.
- The assertion for verifying that the key phrase is played might need to be more specific depending on how your application handles audio playback.