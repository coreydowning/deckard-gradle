package com.example.activity;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.LargeTest;
import com.example.R;
import com.example.robolectric.DeckardActivity;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@LargeTest
public class DeckardEspressoTest extends ActivityInstrumentationTestCase2<DeckardActivity> {

    @SuppressWarnings("deprecation")
    public DeckardEspressoTest() {
        // This constructor was deprecated - but we want to support lower API levels.
        super("com.example.activity", DeckardActivity.class);
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
        // Espresso will not launch our activity for us, we must launch it via getActivity().
        getActivity();
    }

    public void testCheckText() throws InterruptedException {
        onView(withId(R.id.text))
                .check(matches(withText("Hello Espresso!")));
    }
}
