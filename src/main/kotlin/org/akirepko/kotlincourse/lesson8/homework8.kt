package org.example.org.akirepko.kotlincourse.lesson8

import org.example.org.akirepko.kotlincourse.lesson_4.lesson4

fun main()
{
    println(transfromMessage("Это невозможно выполнить за один день катастрофа "))
    println(transfromMessage("Произошла катастрофа на сервере"))
    println(transfromMessage("Этот код работает без проблем"))
    println(transfromMessage("Удача"))
    println(transfromMessage("Это невозможно выполнить за один день"))
    logDate("Пользователь вошел в систему -> 2021-12-01 09:48:23")

//    Задание 2: Маскирование Личных Данных
//    Описание: Дана строка с номером кредитной карты "4539 1488 0343 6467".
//    Замаскируйте все цифры, кроме последних четырех, символами "*".
    val creditCard="4539 1488 0343 6467"
    println("**** **** ****${creditCard.substring(14)}")
//    Задание 3: Форматирование Адреса Электронной Почты. Используй replace
//    Описание: У вас есть электронный адрес "username@example.com".
//    Преобразуйте его в строку "username [at] example [dot] com".
    val email="username@example.com"
    println(email.replace("@"," [at] ").replace("."," [dot] "))
//    Задание 4: Извлечение Имени Файла из Пути
//    Описание: Дан путь к файлу "C:/Пользователи/Документы/report.txt".
//    Извлеките название файла с расширением.
    val path="C:/Пользователи/Документы/report.txt"
    println(path.substring(path.indexOf("ы/")+2))

    subMessage("Объектно-ориентированное программирование")
    upperWord("Объектно-ориентированное программирование")
    encrypt("Kotlin")
    decrypt("oKltni")



  multiplicationTable(9,9)
}


//Создайте функцию, которая будет анализировать входящие фразы и применять к ним различные преобразования, делая текст более ироничным или забавным. Функция должна уметь распознавать ключевые слова или условия и соответственно изменять фразу.
//Правила Проверки и Преобразования:
//Если фраза содержит слово "невозможно":
//Преобразование: Замените "невозможно" на "совершенно точно возможно, просто требует времени".
//Если фраза начинается с "Я не уверен":
//Преобразование: Добавьте в конец фразы ", но моя интуиция говорит об обратном".
//Если фраза содержит слово "катастрофа":
//Преобразование: Замените "катастрофа" на "интересное событие".
//Если фраза заканчивается на "без проблем":
//Преобразование: Замените "без проблем" на "с парой интересных вызовов на пути".
//Если фраза содержит только одно слово:
//Преобразование: Добавьте перед словом "Иногда," и после слова ", но не всегда".
//Примеры Тестовых Фраз:
//"Это невозможно выполнить за один день"
//"Я не уверен в успехе этого проекта"
//"Произошла катастрофа на сервере"
//"Этот код работает без проблем"
//"Удача"
fun transfromMessage(message:String):String{
    return when{
        message.contains("невозможно")-> message.replace("невозможно","совершенно точно возможно, просто требует времени")
        message.startsWith("Я не уверен")->"$message но моя интуиция говорит об обратном "
        message.contains("катастрофа")-> message.replace("катастрофа","интересное событие")
        message.endsWith("без проблем")->message.replace("без проблем","с парой интересных вызовов на пути")
        !message.contains(" ")-> "Иногда ${message.lowercase()},  но не всегда"
        else->"Сообщение не требует трансформации"

    }
}

//Задание 1: Извлечение Даты из Строки Лога. Используй indexOf или split для получения правой части сообщения.
//Описание: У вас есть строка лога вида "Пользователь вошел в систему -> 2021-12-01 09:48:23".
// Извлеките отдельно дату и время из этой строки и сразу распечатай их по очереди.
 fun logDate(log:String) {
     val newLog=(log.substring(log.indexOf("->")+3))
    println(newLog.substring(0,11))
    println(newLog.substring(11))


}
//    Задание 5: Создание Аббревиатуры из Фразы.
//    Используй split с набором символов для разделения.
//    Используй for для перебора слов.
//    Используй var переменную для накопления первых букв.
//    Описание: У вас есть фраза, например "Объектно-ориентированное программирование".
//    Создайте аббревиатуру из начальных букв слов (например, "ООП").
//    Дополнительные задания
fun subMessage(text:String){
    val listText=text.split(" ","-")
    var subText=""
     for (i in  listText){
         if (i.isNotEmpty())
         subText+=i[0].uppercase()

     }
    println(subText)
}
//   Написать метод, который преобразует строку из нескольких слов в строку,
//   где каждое слово начинается с заглавной буквы а все остальные - строчные.
//   (можно использовать такой же подход как в задании 5,
//   но накапливать не первые буквы а целиком слова, составленные из первой буквы с uppercase
//   и оставшейся части слова)
fun upperWord(text:String){
    val listText=text.split(" ","-")
    var upperCase=""
    for (i in  listText){
        upperCase=upperCase+i[0].uppercase()+i.substring(1)+" "

    }
    println(upperCase)

}

//    Написать шифратор/дешифратор для строки.
//    Шифровка производится путём замены двух соседних букв между собой:
//    Kotlin шифруется в oKltni. Дешифровка выполняется аналогично.
//    Если длина строки - нечётная, в конец добавляется символ пробела до начала шифрования.
//    Таким образом все шифрованные сообщения будут с чётной длинной.
//    Должно получиться два публичных метода: encrypt() и decrypt() которые принимают и возвращают строку.
fun encrypt(messageShifr:String){
    val lehghtShifr=messageShifr.length
    if (lehghtShifr%2!=0) messageShifr+" "
    var shifr=""
    for (i in messageShifr.indices) {
        if (i%2!=0) continue
        shifr=shifr+messageShifr[i+1]+messageShifr[i]

    }
    println(shifr)

    }
fun decrypt(messageShifr:String){
    val lehghtShifr=messageShifr.length
    if (lehghtShifr%2!=0) messageShifr+" "
    var shifr=""
    for (i in messageShifr.indices) {
        if (i%2!=0) continue
        shifr=shifr+messageShifr[i+1]+messageShifr[i]

    }
    println(shifr)

}

///Вывести таблицу умножения в консоль так, чтобы были ровные строки и столбцы.
//            В заголовках столбцов и строк - числа для перемножения.
//            В перекрестии - результат умножения.
//            Каждый столбец должен быть выровнен по правому краю.
//    Для печати результата в той же строке использовать print()
//    Для перехода на следующую строку использовать println()
//    Для выравнивания использовать функции форматирования строк с шаблоном (%s)
//


//    Для усложнения задачи, можно в метод передавать размерность таблицы
//    по вертикали и горизонтали и динамически рассчитывать количество пробелов для форматирования.
fun multiplicationTable(column: Int, line:Int){

    val lineBlanck = (line.toString()).length+1
        print(" ".repeat(lineBlanck ))
    for(i in 1..line){
        print(" %${lineBlanck}s".format(i))
    }
    println()
    for (i in 1..column){
        print("%${lineBlanck}s".format(i))  // первая колонка
        for (j in 1..line){
            print(" %${lineBlanck}s".format(i*j))
        }
        println()
    }
}
fun multiplyTable(first: Int, second: Int) {
    val formatLength = (first * second).toString().length + 1
    print(" ".repeat(formatLength))

    val xRange = getRange(first)
    val yRange = getRange(second)
    val formatter = "%${formatLength}s"
    for (i in xRange) {
        print(formatter.format("$i"))
    }
    println()
    for (i in yRange) {
        print(formatter.format("$i"))
        for (j in xRange) {
            print(formatter.format("${i * j}"))
        }
        println()
    }
}

private fun getRange(size: Int): IntProgression {
    return when {
        size > 0 -> 1..size
        size < 0 -> -1 downTo size
        else -> throw IllegalArgumentException("Неверное значение size")
    }
}