package org.example.org.akirepko.kotlincourse.lesson15OOP.homework15.fridge

class Fridge(val capacity: Int) {

    private val sections = mutableListOf<Section>()

    fun addSection(section: Section): Boolean {
        return if (sections.size < capacity) {
            sections.add(section)
        } else false
//
//    fun removeSectionsByType(type: String): Boolean
//
//    fun removeSectionWithRedistribution(section: Section): List<Item>
//
//    fun addItem(item: Item): Boolean
//
//    fun findItemByNameAndType(name: String, type: String): Item?
//
//    fun removeItem(item: Item): Boolean
//
//    fun removeAllItemsByName(name: String): Int
//
//    fun viewFridge() {
//        println(sections.joinToString("\n\n") { it.formatData() })
//    }
    }
}