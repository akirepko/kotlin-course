package org.example.org.akirepko.kotlincourse.lesson15OOP.homework15

class Rack(val shelves:MutableList<Shelf>, val quanty:Int) {

    fun addShelf(shelf: Shelf):Boolean{
        return if (shelf !in shelves && shelves.size<quanty){
            shelves.add(shelf)
        } else {
            false
        }
    }
    fun removeShelf(index:Int):Boolean{
        return if (index in shelves.indices){
            shelves.remove(shelves[index])
        }
        else false
    }
    fun addItem(){

    }

}