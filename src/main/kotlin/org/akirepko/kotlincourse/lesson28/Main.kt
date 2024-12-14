package org.example.org.akirepko.kotlincourse.lesson28

import java.io.File
import java.nio.file.Path


fun main() {

    val file = File("path/to/your/file.txt")
    val directory = File("path/to/your/directory")
    file.parentFile.mkdirs()

    val isNewFileCreated: Boolean = file.createNewFile()
    if (isNewFileCreated) {
        println("Файл был создан")
    } else {
        println("Файл уже существует")
    }

    if (file.exists()) {
        println("Файл существует")
    } else {
        println("Файл не найден")
    }

    file.writeText("Hello, world!")

    val text = file.readText()
    println(text)


    val files = directory.listFiles()
    files?.forEach { file ->
        println(file.name)
    }

    if (file.delete()) {
        println("Файл удален")
    } else {
        println("Не удалось удалить файл")
    }
    (1..5).forEach {
        file.parentFile.resolve("$it").mkdirs()
        println(it)
    }
    if (file.deleteRecursively()) {
        println("Директория и всё её содержимое удалено")
    } else {
        println("Не удалось удалить директорию")
    }

    file.walk().filter { it.isFile }
        .associateWith { it.readLines() }
        .filterValues { data ->
            data.any { it.contains("text") }
        }
    println(file.absoluteFile)

    val t: String = file.parent
    val k: File = file.parentFile

    println(t)
    println("@@")
    println(k)


    val baseDir = File("path/to")
    val file1 = File("path/to/nested/file.txt")
    val relative = file1.toRelativeString(baseDir)
    println(file1.toRelativeString(baseDir))
    val baseDir2 = File("path2/to")
    val file3 = baseDir2.resolve(relative)
    file3.parentFile.mkdirs()
    file3.createNewFile()

    val myMap = mapOf("sdsd" to 1.0, "sdsd" to 2.0,"sdsd" to 4.0 )
    println(writeDataToFile(myMap, "path1/to1/your1/file3.txt"))

  //println(readFileToMap("path1/to1/your1/file3.txt"))
}

fun createFileOrDirectory(arg: String) {
    File(arg).apply {
        if (arg.endsWith("/")) {
            mkdirs()
        } else {
            parentFile.mkdirs()
            createNewFile()
        }
    }

}

fun writeDataToFile(map: Map<String, Double>, path: String) {
    val dataToString = map.map { "${it.key}=${it.value}" }.joinToString ( "\n")
    println(dataToString)
    createFileOrDirectory(path)
    File(path).writeText(dataToString)

}

fun readFileToMap(path: String) : Map<String, Double> {
    return File(path).readLines()
        .associate{
            val string = it.split("=")
            string[0] to string[1].toDouble()
        }
}