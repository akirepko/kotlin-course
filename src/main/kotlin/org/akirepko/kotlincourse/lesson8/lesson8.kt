package org.example.org.akirepko.kotlincourse.lesson8

fun main(){
    val firstname = "Ivan"
    val lastname = "Ivanov"

    val fullname = firstname+lastname
    val person= Person("alex",23)
    val introduction= "My name is ${person.name} and my age is ${person.age}"
    val simpleString = "Это простая строка"

    val firstName = "Иван"
    val lastName = "Иванов"
    val fullName = "$firstName $lastName"

    val age = 30
    val greeting = "Привет! Меня зовут $fullName, и мне $age лет."





    val x = 10
    val y = 20
    val resultString = "Результат сложения x и y равен ${x + y}"
    println(resultString)
    val originalString="Kotlin is fun"
    val subString = originalString.substring(7)
    val substring2=originalString.substring(3,6)
    val replacedString = originalString.replace("fun", "awesome")
    val words = originalString.split(" ")
    val length = "Hello".length
    val upper = "hello".uppercase()
    val lower = "HELLO".lowercase()
    val trimmed = "  hello  ".trim()
    val starts = "Kotlin".startsWith("Kot")
    val ends = "Kotlin".endsWith("lin")
    val contains = "Hello".contains("ell")
    val e:String?=null
    val empty = e.isNullOrEmpty()
    val blank = "".isNullOrBlank()
    val repeat = "ab".repeat(3)
    val letter = originalString[5]
    val indexOfChar = "Kotlin".indexOf('t')
    val indexOfWord = "Kotlin is the best language".indexOf("best")
    val backReverse = "niltoK".reversed()
    val multiLineString = """
    Первая строка
    Вторая строка
    Третья строка
""".trimIndent()


    val name = "Алексей"
    val city = "Москва"

    val friendsCount = 1052
    val rating = 4.948
    val balance = 2534.75856
    val text = """
   Имя: %12s
   Город: %s
   Возраст: %d
   Количество друзей: %,d
   Рейтинг пользователя: %.1f
   Баланс счета: $%,.2f
""".trimIndent()
    println(text.format(name, city, age, friendsCount, rating, balance))

    val text1="Kotlin: The Fun Way to Learn Programming"
    println(text1.substring(8,19))
    val text2="contact@example.com"
    println(text2.substring(text2.indexOf("@")+1))
    val phone = "123-456-7890"

    println("XXX-XXX-${phone.substring(8,12)}")
    println(!contains)
}


class Person(val  name:String, val age:Int)


/*Правила Проверки и Преобразования:
Если фраза начинается с "ошибка":
Преобразование: Замените "ошибка" на "небольшое недоразумение".
Если фраза заканчивается на "важно":
Преобразование: Добавьте в конец фразы "…но не критично".
Если фраза содержит слово "проблема":
Преобразование: Замените "проблема" на "неожиданность".
Если индекс слова "срочно" находится в промежутке от 0 до 10:
Преобразование: Замените "срочно" на "когда-нибудь".
Если строка пустая:
Преобразование: Верните "Кажется, кто-то забыл что-то сказать".
Примеры Тестовых Фраз:
"Ошибка в системе вызвала панику."
"Для завершения проекта важно."
"Обнаружена проблема с сетью."
"Срочно нужно обновить данные!"
""*/
fun transform(message:String):String{
     return when {
        message.startsWith("ошибка",true)->message.replace("ошибка","небольшое недоразумение")
        message.endsWith("важно",true)-> "$message …но не критично"
         message.contains("проблема")->message.replace("проблема","неожиданность")
         else-> ""

     }
}