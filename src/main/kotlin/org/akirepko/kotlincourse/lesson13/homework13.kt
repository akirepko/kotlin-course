package org.example.org.akirepko.kotlincourse.lesson13

fun main() {

//    1. Предварительные задачи на использование методов.
//    Подбери подходящий для задачи метод
//    Задачи на приведение коллекций к значению
//            isNotEmpty
//    getOrElse
//    joinToString
//    firstOrNull
//    size
//    isEmpty
//    minOrNull
//    contains
//    sum
//    average
//    maxOrNull
//
    val numbers = listOf(1, 2, 3, 4, 5)
//    Проверить, что размер коллекции больше 5 элементов.
    if (numbers.size > 5)
//    Проверить, что коллекция пустая
        numbers.isEmpty()
//    Проверить, что коллекция не пустая
    numbers.isNotEmpty()
//    Взять элемент по индексу или создать значение если индекса не существует
    numbers.getOrElse(10) { 133 }
//    Собрать коллекцию в строку
    numbers.joinToString(separator = " ")
//            Посчитать сумму всех значений
    numbers.sum()
//            Посчитать среднее
    numbers.average()
//            Взять максимальное число
    numbers.maxOrNull()
//    Взять минимальное число
    numbers.minOrNull()
//    Взять первое число или null
    numbers.firstOrNull()
//    Проверить что коллекция содержит элемент
    numbers.contains(3)
//
//    Задачи на обработку коллекций
//            sorted+
//    groupBy
//    distinct
//    take
//    takeLast
//    filter+
//    filterNot+
//    map+
//    associate+
//    sortedDescending+
//    forEach
//    filterNotNull+
    val strings = listOf("asds", null, "sd", "asdf")
//    Отфильтровать коллекцию по диапазону 18-30
    numbers.filter { it in 18..20 }
//    Выбрать числа, которые не делятся на 2 и 3 одновременно
    numbers.filterNot { it % 6 == 0 }

//    Очистить текстовую коллекцию от null элементов
    strings.filterNotNull()

//            Преобразовать текстовую коллекцию в коллекцию длин слов
    val stringsOne = mutableListOf("cv", "dfd", "sdf")
    println(stringsOne.map { it.length })

//    Преобразовать текстовую коллекцию в мапу, где ключи - слова, а значения - перевёрнутые слова
    val myMap = stringsOne.associate { it to it.reversed() }
    println(myMap)
//    Отсортировать список в алфавитном порядке
    stringsOne.sorted()
//    Отсортировать список по убыванию
    stringsOne.sortedDescending()
//            Распечатать квадраты элементов списка
    numbers.forEach { println(it * it) }
//            Группировать список по первой букве слов
    val newMap = strings.groupBy { it?.get(0) }
    println(newMap)
//            Очистить список от дублей
    numbers.distinct()
//            Взять первые 3 элемента списка
    numbers.take(3)
//    Взять последние 3 элемента списка
    numbers.takeLast(3)
    //

////    Если коллекция пустая - “Пусто”
//    Если количество элементов меньше пяти - “Короткая”
//    Если коллекция начинается с 0 - “Стартовая”
//    Если сумма всех чисел больше 10000 - “Массивная”
//    Если среднее значение равно 10 - “Сбалансированная”
//    Если длина строки образованная склеиванием коллекции в строку равна 20 - “Клейкая”
//    Если максимальное число меньше -10 - “Отрицательная”
//    Если минимальное число больше 1000 - “Положительная”
//    Если содержит одновременно числа 3 и 14 - “Пи***тая”
//    Иначе - “Уникальная”
//
//    Вызвать метод с данными, подходящими под каждую из веток
//
//    Задание 3: Анализ Учебных Оценок
//    Начальные значения:
    val grades = listOf(85, 58, 90, 74, 88, 67, 95, 92, 50, 42, 12)
    grades.filter { it >= 60 }.sorted().take(3)
//    Цель:
//    Отфильтровать удовлетворительные оценки (>=60),
//    отсортировать оставшиеся по возрастанию и взять первые 3.
//
//    Задание 4: Создание каталога по первой букве.
//    Начальные значения: val list = listOf(
//        "Стол", "табурет", "ваза", "Кружка", "Зеркало", "ковер", "Шкаф", "часы", "Люстра", "подушка", "Картина", "столик", "Вазон", "шторы", "Пуф", "книга", "Фоторамка", "светильник", "Коврик", "вешалка", "Подставка", "телевизор", "Комод", "полка", "Абажур", "диван", "Кресло", "занавеска", "Бра", "пепельница", "Глобус", "статуэтка", "Поднос", "фигурка", "Ключница", "плед", "Тумба", "игрушка", "Настенные часы", "подсвечник", "Журнальный столик", "сувенир", "Корзина для белья", "посуда", "Настольная лампа", "торшер", "Этажерка"
//    )
//    Цель: Привести все слова в списке к нижнему регистру,
//    сгруппировать в каталог по первой букве.
    val list = listOf(
        "Стол", "табурет", "ваза", "Кружка", "Зеркало", "" +
                "ковер", "Шкаф", "часы", "Люстра", "подушка",
        "Картина", "столик", "Вазон", "шторы", "Пуф", "книга", "Фоторамка",
        "светильник", "Коврик", "вешалка", "Подставка", "телевизор", "Комод",
        "полка", "Абажур", "диван", "Кресло", "занавеска", "Бра", "пепельница",
        "Глобус", "статуэтка", "Поднос", "фигурка", "Ключница", "плед", "Тумба",
        "игрушка", "Настенные часы", "подсвечник", "Журнальный столик", "сувенир",
        "Корзина для белья", "посуда", "Настольная лампа", "торшер", "Этажерка"
    )
    println(list.map { it.lowercase() }.groupBy { it[0] })

//    Задание 5: Подсчёт средней длины слов в списке.
//    Начальные значения из задачи 3.
//    Цель: Перевести все слова в количество букв,
//    подсчитать среднее значение
//    . Вывести форматированный текст с двумя знаками после запятой.
    val avg = list.map { it.length }.average().toString()
    val text = "%.2f"

    val formattedAvg = text.format(avg.toDouble())

    println(formattedAvg)
//
//    Задание 6: Категоризация чисел.
//    Начальные значения: val numbers = listOf(1, 3, 5, 7, 3, 1, 8, 9, 9, 7)
//    Цель: Отобрать уникальные числа,
//    отсортировать по убыванию и сгруппировать по четности (“четные” и “нечетные”).
    val numbersTwo = listOf(1, 3, 5, 7, 3, 1, 8, 9, 9, 7)
    println(numbersTwo.distinct().sorted().groupBy { if (it % 2 == 0) "Четные" else "Нечетные" })

//
//    Задание 7: Поиск первого подходящего элемента
//    Начальные значения: val ages = listOf(22, 18, 30, 45, 17, null, 60)
    val ages = listOf(22, 18, 30, 45, 17, null, 60)
//    Цель: Найти первый возраст в списке, к
//    оторый соответствует условию (больше 18),
    val check = ages.firstOrNull { it!! > 18 }

    println(ages.firstOrNull { it!! > 18 }.toString())
//    преобразовать его к строке, или вернуть сообщение "Подходящий возраст не найден".


//    Подсказки (Да!)
//
//    Задание 2
//
//    fun analize(list): String {
//        вернуть when {
//            если первое условие -> результат 1
//                    если второе словие -> результат 2
//                    иначе -> результат n
//        }
//    }
//
//    Задание 3
//
//    Если метод возвращает список,
//    можно прям у него вызывать последующий метод myList.filter {  }.map {  }.firstOrNull().?length
//
//            Задание 4
//
//    к нижнему регистру приводим через map { // it.кНижнемуРегистру }
//        группируем через groupBy {  // тут просто получить первую букву слова у it  }
//
//            Задание 5
//
//            Сначала преобразуем слова в длины через map {  }
//            после чего используем метод для вычисление среднего значения в списке чисел.
//
//            Задание 6
//
//            Используем последовательно три метода - distinct, sorted и groupBy с
//            генерацией ключа через проверку чётности it % 2 == 0
//
//            Задание 7
//
//            Можно использовать метод firstOrNull { // проверка на соответствие it условию }
//            потом преобразование к строке через nullable проверку ?.map { //преобразовать к строке }
//            и в конце оператор элвиса с сообщением об отсутствии значения.


}

//    Задание 2: Характеристика числовой коллекции
//    Написать метод, который принимает коллекцию чисел и возвращает
//    строку с текущим состоянием коллекции используя конструкцию when
fun analize(numbers: List<Int>): String {
    return when {
        numbers.isEmpty() -> "Пусто"
        numbers.size < 5 -> "Короткая"
        numbers.firstOrNull() == 0 -> "Стартовая"
        numbers.sum() > 100000 -> "Массивная"
        numbers.average() == 10.0 -> "Сбалансированная"
        numbers.joinToString().length == 20 -> "Клейкая"
        numbers.maxOrNull()!! < -10 -> "Отрицательная"
        numbers.minOrNull()!! > 1000 -> "Положительная"
        numbers.contains(3) && numbers.contains(14) -> "Пи***тая"
        else -> "Иначе"
    }
}