package org.example.org.akirepko.kotlincourse.lesson15OOP.homework15

class Shelf(val capacity: Int, val items: MutableList<String>) {

    fun addItem(item: String): Boolean {
        return if (canAccommodate(item)) {
            items.add(item)
        } else  false
    }

    fun removeItem(item: String):Boolean{
        return items.remove(item)
    }

    fun canAccommodate(item: String):Boolean{
        return item.length <= capacity - item.length

    }

    fun checkItem(items:MutableList<String>,item: String):Boolean{
        return items.contains(item)
    }

    fun getItems(items:MutableList<String>):List<String>{
        return items.toList()
    }

}