package org.example.org.akirepko.kotlincourse.homework9

fun main() {
    val wrongAge = 145643494
    val wrongDate = 456242703

    val messageCelebration = "С днем рождения"
    val messageHelp = "Займи косарь"
    val messagePath = ".com"



    println(transfromMessage(messageCelebration))
    println(transfromMessage(messageHelp))
    println("${transfromMessage(messagePath)}/video-${wrongAge}_${wrongDate}")

}

fun transfromMessage(message: String): String {
    return when {
        message.contains("С днем рождения") -> message.replace(
            "С днем рождения",
            "Это сейчас, но как бы на следующее день рождение"
        )

        message.startsWith("Займи косарь") -> message.replace("Займи косарь", "Перейди по ссылке")
        message.endsWith(".com") -> "https://vk$message"
        else -> "Не надо это тестировать расслабься"

    }
}


