package com.cesarferreira.pluralize

import org.junit.Assert.assertEquals
import org.junit.Test

class PluralizationTest {

    @Test
    fun `Should add default "s" suffix`() {
        assertEquals("posts", "post".pluralize())
        assertEquals("descriptions", "description".pluralize())
        assertEquals("collections", "collection".pluralize())
        assertEquals("versions", "version".pluralize())
    }

    @Test
    fun `Should handle unCountable words`() {
        assertEquals("aircraft", "aircraft".pluralize())
    }

    @Test
    fun `Should handle exception words`() {
        assertEquals("men", "man".pluralize())
        assertEquals("feet", "foot".pluralize())
    }

    @Test
    fun `Should handle in case insensitive manner`() {
        assertEquals("people", "Person".pluralize())
    }

    @Test
    fun `Should not add default "s" suffix for count = 1`() {
        assertEquals("post", "post".pluralize(1))
        assertEquals("description", "description".pluralize(-1))
        assertEquals("collection", "collection".pluralize(-1))
        assertEquals("version", "version".pluralize(1))
    }

}
