package com.cesarferreira.pluralize

import org.junit.Assert.assertEquals
import org.junit.Test

class SingularizationTest {

    @Test
    fun `Should remove default "s" suffix`() {
        assertEquals("word", "words".singularize())
    }

    @Test
    fun `Should handle unCountable words`() {
        assertEquals("scissors", "scissors".singularize())
    }

    @Test
    fun `Should handle exception words`() {
        assertEquals("person", "people".singularize())
    }

    @Test
    fun `Should handle in case insensitive manner`() {
        assertEquals("goy", "Goyim".singularize())
    }

    @Test
    fun `Should behave like pluralize for count larger than 1`() {
        assertEquals("posts", "post".singularize(5))
        assertEquals("descriptions", "description".singularize(2))
        assertEquals("collections", "collection".singularize(-2))
        assertEquals("versions", "version".singularize(-5))
    }

}
