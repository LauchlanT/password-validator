package com.lauchlantoal.csci3130assignment2;

import org.junit.Rule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;
import android.support.test.rule.ActivityTestRule;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;


@RunWith(AndroidJUnit4.class)
/**
 * Tests the password validation functionality of the app using Espresso.
 */
public class ValidatorInstrumentedTest {

    @Rule
    //Access the password input activity
    public ActivityTestRule<PasswordInput> mActivityRule = new ActivityTestRule(PasswordInput.class);

    @Test
    /**
     * Tests that an empty string is considered a weak password.
     */
    public void emptyPasswordTest() {
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView2)).check(matches(withText("Weak Password")));
    }

    @Test
    /**
     * Tests that the string "PassWord" is considered a weak password.
     */
    public void weakPasswordTest() {
        onView(withId(R.id.editText)).perform(click());
        onView(withId(R.id.editText)).perform(typeText("PassWord"));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView2)).check(matches(withText("Weak Password")));
    }

    @Test
    /**
     * Tests that the string "ThisIs1StrongPassword" is considered a strong password.
     */
    public void strongPasswordTest() {
        onView(withId(R.id.editText)).perform(click());
        onView(withId(R.id.editText)).perform(typeText("ThisIs1StrongPassword"));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView2)).check(matches(withText("Strong Password")));
    }

}
