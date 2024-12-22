package org.akirepko.kotlincourse.lesson31.homework

import org.example.org.akirepko.kotlincourse.lesson31.homework.Cereal
import org.example.org.akirepko.kotlincourse.lesson31.homework.CerealStorageImpl
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class CerealStorageImplTest {

    private val storage = CerealStorageImpl(11f, 12f)

    @Test
    fun addCereal() = with(storage) {
      addCereal(Cereal.RICE, 2.2f)
        Assertions.assertEquals(2.2f, getAmount(Cereal.RICE))
    }

    @Test
    fun getCereal()= with(storage){
        getCereal(Cereal.BULGUR,1f)
        Assertions.assertEquals(1f,getAmount(Cereal.BULGUR))
    }

    @Test
    fun removeContainer()= with(storage){
        Assertions.assertFalse(removeContainer(Cereal.MILLET))
    }
}