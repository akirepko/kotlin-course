package org.example.org.akirepko.kotlincourse.lesson_3


class Homework {

    val nameEvent: String = "Hackathon Survival" //Название мероприятия

    val date: String = "01/02/2022" //Дата

    lateinit var place: String //Место

    private var budget: String = "1232312312" //Бюджет

    var member: Int = 0
    //Число участников

    var duration: Int = 0
        get() = field
        set(value) {
            if (value > 0) field = value
        }  //длительность

    private lateinit var contactinfomation: String // КОнтактная информация

    var status: String = "в разработке" //Статус

    val sponsors = "Nike" // Спонсоры

    var budgetOfHackaton: Int = 1222222223// Бюджет мероприятия

    var levelOfInternet: String = "Отвратительный"//Уровень интернета

    val informationAboutResourses: String = "string" //информация об обордуование

    var countOfCommand: Int= 111 // количество комманд

    val listOfTask:String="Перечень задач"

    val evucationPlan:String="sss"//    План эвакуации

    val listInstruments:String="sss"//    Список доступного оборудования

    var freeInstruments:String="s"//    Список свободного оборудования




}