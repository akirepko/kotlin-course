package org.example.org.akirepko.kotlincourse.lesson15OOP.homework15.fridge

class Section(
    val type: String,
    val capacity: Int
){

    private val items = mutableListOf<Item>()

    fun addItem(item: Item): Boolean{
        return if(convertWeightToVolume(item)<capacity){
            items.add(item)
        }
        else false
    }

//    fun findItemByName(name: String): Item?{
//        return if (items.getOrNull(Item)){
//
//
//        }
//        else false
//
//    }
//
    fun remove(item: Item): Boolean{
    return items.remove(item)
    }
//
//    fun getFreeSpace(): Int{
//        return 0
//    }

//
//    fun formatData(): String {
//        return """
//type: $type
//   capacity: $capacity
//  free: ${getFreeSpace()}
//   items:
//       ${items.joinToString("\n\t\t")}
//       """.trimIndent()
//    }

    private fun convertWeightToVolume(item: Item): Int {
        return (item.weight / conversionFactors.getValue(item.type)).toInt()
    }

}
