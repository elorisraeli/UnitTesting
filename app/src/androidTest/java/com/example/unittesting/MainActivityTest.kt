package com.example.unittesting

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.After
import org.junit.Before

import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import kotlin.math.E

@RunWith(AndroidJUnit4::class)
class MainActivityTest {
    val mName = "Elor"

    @Rule
    @JvmField
    var mActivityTestRule: ActivityScenarioRule<MainActivity> = ActivityScenarioRule(
        MainActivity::class.java
    )

    @Before
    fun setUp() {
    }

    @Test
    fun testUserInputScenario() {
        // input some text in the edit text
        Espresso.onView(withId(R.id.editText)).perform(typeText(mName))
        // close soft keyboard
        Espresso.closeSoftKeyboard()
        // perform button click
        Espresso.onView(withId(R.id.button)).perform(click())
        // checking the text in the textview
        Espresso.onView(withId(R.id.textViewChanges)).check(matches(withText(mName)))

    }
    @Test
    fun testUserPressScenario() {
        // perform textView click
        Espresso.onView(withId(R.id.textView)).perform(click())
    }

    @After
    fun tearDown() {
    }
}