package org.example.org.akirepko.kotlincourse.lesson28.homework

import java.io.File

//Создайте текстовый файл workspace/task1/example.txt
//запишите в него строку "Hello, Kotlin!", а затем проверьте, существует ли файл.

fun main() {
    val file = File("workspace/task1/example.txt").apply {
        parentFile.mkdirs()
        createNewFile()
        writeText("Hello, Kotlin!")
    }
//    Создайте директорию workspace/task2/testDir
//    проверьте, является ли она директорией, и выведите её абсолютный путь.
    val fileTwo = File("workspace/task2/testDir").apply {
        mkdirs()
        println(isDirectory)
        println(absolutePath)
    }

//    Создайте директорию workspace/task3/structure.
//    Внутри директории structure создайте папку myDir с двумя вложенными поддиректориями subDir1 и subDir2.
//    Проверьте, что myDir действительно содержит эти поддиректории.
    val baseDir = File("workspace/task3/structure").apply {
        mkdirs()
    }
    val subDirs = listOf("subDir1", "subDir2")

    val myDir = File(baseDir, "myDir").apply {
        mkdirs()

    }
    subDirs.forEach { it ->
        File(myDir, it).mkdirs()
    }
    println(myDir.listFiles())
//    Создайте директорию workspace/task4/temp.
//    Внутри директории temp создайте несколько вложенных файлов и директорий.
//    Удалите директорию workspace/task4 со всем содержимым

    val taskFor = File("workspace/task4").apply {
        mkdirs()
    }

    val files = listOf("file1.txt", "file2.txt")
    subDirs.forEach { it ->
        File(taskFor, it).mkdirs()
    }

    files.forEach { it ->
        File(taskFor, it).parentFile.mkdirs()

    }

    taskFor.deleteRecursively()
//    Cоздайте файл workspace/task5/config/config.txt
//    запишите в него список параметров (в формате ключ=значение), а затем прочитайте файл и выведите только значения.
    val params = listOf("key1=value1", "key2=value2", "key3=value3")

    val configFile = File("workspace/task5/config/config.txt").apply {
        parentFile.mkdirs()
        createNewFile()
        writeText(params.joinToString("\n"))
    }
    val values = configFile.readLines().map {
        val string = it.split("=")
        string[1]
    }

    println(values)
//    Пройди по всем вложенным директориям workspace и выведи в консоль сначала пути директорий, а потом пути файлов
    val path = File("workspace")
    println(path.walk().groupBy { if(it.isDirectory) "директория" else "file"  })


//    Создайте директорию workspace/task9/docs.
//    Проверь, есть ли файл с именем readme.md. Если файла нет, создайте его и запишите текст "This is a README file."
    val base = File("workspace/task3/structure").apply {
        mkdirs()
    }
    File(base, "readme.md").apply {
        if (exists()) {
            println("Файл есть $absolutePath")
        } else {
            writeText("This is a README file.")
        }


    }

//    Создайте файлы
//            workspace/task10/data/1/4/prod/data14.mysql
//    workspace/task10/data/2/3/prod/data23.mysql
//    workspace/task10/data/2/3/prod/data23.mysql
//    Создайте директорию workspace/task10/backup и скопируйте туда файлы из workspace/task10/data
//    сохраняя структуру директорий. Для копирования используй метод copyTo

    val list = listOf(
        "workspace/task10/data/1/4/prod/data14.mysql",
        "workspace/task10/data/2/3/prod/data23.mysql",
        "workspace/task10/data/2/3/prod/data23.mysql"
    )
    val baseDate = File("workspace/task10/data")
    list.forEach { path ->
        File(path).apply {
            parentFile.mkdirs()
            if (file.exists()) {
                println("Файл существует")
            } else {
                createNewFile()
                println("Файл не найден")
            }
        }
    }

    val newDate = File("workspace/task10/backup ")
        list.forEach {

        }


}