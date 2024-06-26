package app.identifier;


import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.espresso.Espresso;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class MainActivityManualEspressoTest {

    @Rule
    public ActivityScenarioRule<MainActivity> mActivityTestRule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void checkIsDisplayedTest() {
        onView(withId(R.id.label)).check(matches(isDisplayed()));
        onView(withId(R.id.input)).check(matches(isDisplayed()));
        onView(withId(R.id.output)).check(matches(isDisplayed()));
        onView(withId(R.id.validateBtn)).check(matches(isDisplayed()));
    }

    @Test
    public void validIdentifierTest() {
        onView(withId(R.id.output)).check(matches(withText("Validation Result")));
        onView(withId(R.id.input)).perform(typeText("abc"));
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.validateBtn)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("Valid")));
    }
}
