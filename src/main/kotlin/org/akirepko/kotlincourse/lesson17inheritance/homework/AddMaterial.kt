package org.example.org.akirepko.kotlincourse.lesson16inheritance.homework

class AddMaterial() : Materials() {
    fun addmaterial(material: String){
        val extract=extractMaterial().toMutableList()
        addMaterial(material)
        extract.forEach { addMaterial(it) }

    }
}