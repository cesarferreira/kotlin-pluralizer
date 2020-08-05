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

}
