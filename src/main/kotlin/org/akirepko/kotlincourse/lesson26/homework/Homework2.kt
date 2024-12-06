package org.example.org.akirepko.kotlincourse.lesson26.homework

/*Задания на отработку синтаксиса

Задания на разработку кода
Напишите функцию filterStrings, которая принимает список строк и функцию-фильтр,
оставляющую только строки, удовлетворяющие условию (то-есть принимающая строку и возвращающая булево значение).
Функция должна вернуть результат фильтрации исходного списка строк.
Создайте функцию applyToNumbers, которая принимает список чисел и функцию,
преобразующую каждое число в другое число (те-есть принимающая число и возвращающая число).
Функция должна вернуть результат преобразования исходного списка чисел.
Реализуйте функцию sumByCondition, которая принимает список чисел и функцию, определяющую условие для включения числа в сумму.
 Функция должна вернуть сумму чисел, прошедших проверку.
Напишите функцию combineAndTransform,
 которая принимает две коллекции одного типа и функцию для их объединения и
  преобразования в одну коллекцию другого типа. Функция должна вернуть результат преобразования (коллекцию второго типа)

⚡ Для последних четырёх заданий сделать минимум по две разные реализации лямбда функций и проверить работу на разных наборах данных
*/

fun main() {
    val strings = listOf("one", "two", "three")
    val filterMyStrings = { it: String ->
        it.length == 3
    }

    val filterMyStringsOne = { it: String ->
        it.length > 3
    }

    println(filterStrings(strings, filterMyStrings))
    println(filterStrings(strings, filterMyStringsOne))

    val numbers = listOf(1, 2, 3, 4)

    val transformer = { it: Int ->
        it - 1

    }
    val deseptikon = { it: Int ->
        it * it

    }

    println(applyToNumbers(numbers, transformer))
    println(applyToNumbers(numbers, deseptikon))

    val condition = { it: Int ->
        it > 2
    }
    val conditionOne = { it: Int ->
        it <= 2
    }

    println(sumByCondition(numbers, conditionOne))
    println(sumByCondition(numbers, condition))

    val myTransformer = {

    }

}

fun filterStrings(
    strings: List<String>,
    filterMyStrings: (String) -> Boolean
): List<String> {
    return strings.filter(filterMyStrings)
}

fun applyToNumbers(
    numbers: List<Int>,
    transformer: (Int) -> Int
): List<Int> {
    return numbers.map(transformer)
}

fun sumByCondition(
    numbers: List<Int>,
    condition: (Int) -> Boolean
): Int {
    return numbers.filter (condition) .sum()
}

fun combineAndTransform(
    numbers: List<Int>,
    strings: List<String>,
    transformMap: (List<Int>, List<String>) -> Map<String, Int>
): Map<String, Int> {
    return transformMap(numbers, strings)
}