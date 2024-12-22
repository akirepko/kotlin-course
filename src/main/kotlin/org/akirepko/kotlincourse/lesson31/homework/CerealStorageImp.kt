package org.example.org.akirepko.kotlincourse.lesson31.homework

import kotlin.math.min

class CerealStorageImpl(
    override val containerCapacity: Float,
    override val storageCapacity: Float
) : CerealStorage {


    // Блок инициализации класса. Выполняется сразу при создании объекта
    init {
        require(containerCapacity >= 0) {
            "Ёмкость контейнера не может быть отрицательной"
        }
        require(storageCapacity >= containerCapacity) {
            "Ёмкость хранилища не должна быть меньше ёмкости одного контейнера"
        }
    }

    private val storage = mutableMapOf<Cereal, Float>()

    /**
     * @param cereal крупа для добавления в контейнер
     * @param amount количество добавляемой крупы
     * @return количество оставшейся крупы если контейнер заполнился
     * @throws IllegalArgumentException если передано отрицательное значение
     * @throws IllegalStateException если хранилище не позволяет разместить ещё один контейнер для новой крупы
     */


    override fun addCereal(cereal: Cereal, amount: Float): Float {
        require(amount >= 0) {
            "Количество крупы не может быть отрицательным"
        }
        checkStorageCapacity(cereal)
        val currentAmount = storage.getOrDefault(cereal, 0f)
        val amountForAdding = min(getSpace(cereal), amount)
        storage[cereal] = currentAmount + amountForAdding
        return amount - amountForAdding
    }

    override fun getCereal(cereal: Cereal, amount: Float): Float {
        require(amount >= 0) {
            "Количество крупы не может быть отрицательным"
        }
        val currentAmount = storage.getOrDefault(cereal, 0f)
        val amountForAdding = min(getSpace(cereal), amount)
        storage[cereal] = currentAmount + amountForAdding
        return amount - amountForAdding
    }

    override fun removeContainer(cereal: Cereal): Boolean {
        return storage.isEmpty()
    }

    override fun getAmount(cereal: Cereal): Float {
        return storage.getOrDefault(cereal, 0f)
    }

    override fun getSpace(cereal: Cereal): Float {
        return containerCapacity - getAmount(cereal)
    }

    override fun toString(): String {
       return storage.toString()
    }
    private fun checkStorageCapacity(cereal: Cereal) {
        if (storage.contains(cereal)) return
        check(storageCapacity >= (storage.size + 1) * containerCapacity) {
            "Недостаточно места в хранилище для нового контейнера"
        }
    }
    // дальше будет переопределением методов интерфейса
}
