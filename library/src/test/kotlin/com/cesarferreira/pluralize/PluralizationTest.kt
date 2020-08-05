package com.cesarferreira.pluralize

import org.junit.Assert.assertEquals
import org.junit.Test

class PluralizationTest {

    @Test
    fun `Should add default "s" suffix`() {
        assertEquals("posts", "post".pluralize())
    }

    @Test
    fun `Should handle unCountable words`() {
        assertEquals("aircraft", "aircraft".pluralize())
    }

    @Test
    fun `Should handle exception words`() {
        assertEquals("men", "man".pluralize())
    }

}
