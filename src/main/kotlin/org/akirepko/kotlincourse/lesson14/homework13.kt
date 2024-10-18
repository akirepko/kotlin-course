package org.example.org.akirepko.kotlincourse.lesson14

fun main() {
//Дан словарь с именем и временем выполнения каждого автоматизированного теста в секундах.
// Определите среднее время выполнения теста.
//
    val testMap = mapOf<String, Double>()
    val listAvg = testMap.map { it.value }
    val avg = listAvg.sum() / testMap.count()
//Имеется словарь с метаданными автоматизированных тестов
// , где ключи — это имена тестовых методов а значения - строка с метаданными.
// Выведите список всех тестовых методов.
    val metaMap = mapOf<String, String>()
    println(metaMap.map { it.key })

//В изменяемый словарь с данными о прохождении тестов добавьте новый тест и его результат.
    val mutabelTest = mutableMapOf<String, String>()
    mutabelTest + ("test" to "result")
//
//Посчитайте количество успешных тестов в словаре с результатами.
    mutabelTest.count { it.value == "passed" }
//
//Удалите из изменяемого словаря с баг-трекингом запись о баге, который был исправлен.
    val bugMap = mutableMapOf<String, String>()
    bugMap.remove("Bug-111")
//
//Для словаря с результатами тестирования веб-страниц
// (ключ — URL страницы, значение — статус ответа), выведите сообщение о странице и статусе её проверки.
    val resultTest = mapOf<String, String>()
    resultTest.getValue("")
//
//Найдите в словаре с названием и временем ответа сервисов только те,
// время ответа которых превышает заданный порог.
    val timeAnswer = mapOf<String, Double>()
    timeAnswer.filterValues { it < 2.0 }
//
//В словаре хранятся результаты тестирования
// API (ключ — endpoint, значение — статус ответа в строке).
// Для указанного endpoint найдите статус ответа,
// если endpoint отсутствует, предположите, что он не был протестирован.
    val apiMap = mapOf<String, Int>()
    apiMap.getOrElse("/main") { throw Exception("Not tested") }
//
//Из словаря, содержащего конфигурации тестового окружения
// (ключ — название параметра конфигурации), получите значение для "browserType".
// Ответ не может быть null.
    val configMap = mutableMapOf<String, String>()
    configMap.getOrDefault("browserType", "unknown")
//
//Создайте копию неизменяемого словаря с данными о версиях тестируемого ПО, чтобы добавить новую версию.
    val versionMap = mapOf<String, Int>()
    val copiMap = versionMap.toMutableMap()
    copiMap["Android"] = 14
//
//Используя словарь с настройками тестирования для различных
// мобильных устройств (ключ — модель устройства),
// получите настройки для конкретной модели или верните настройки по умолчанию.
    val mobileMap = mapOf<String, String>()
    mobileMap.getOrDefault("Realme", "Norhing")
//
//Проверьте, содержит ли словарь с ошибками тестирования (код и описание) определенный код ошибки.
    val errorMap = mapOf<String, Int>()
    errorMap.any() { it.value == 111 }
//
//Дан неизменяемый словарь,
// где ключи — это идентификаторы тестовых сценариев в формате "TestID_Version",
// а значения — статусы выполнения этих тестов ("Passed", "Failed", "Skipped").
// Отфильтруйте словарь, оставив только те сценарии,
// идентификаторы которых соответствуют определённой версии тестов.
    val statusTestMap = mapOf<String, String>()
    statusTestMap.filterKeys { it == "TestID_Version" }
        .filterValues { it == "Passed" || it == "Failed" || it == "Skipped" }
//
//У вас есть словарь,
// где ключи — это названия функциональных модулей приложения,
// а значения — результаты их тестирования. Проверьте, есть ли модули с неудачным тестированием.
    val moduleMap = mapOf<String, String>()
    moduleMap.containsValue("Failed")
//
//Добавьте в изменяемый словарь с настройками тестовой среды настройки из другого словаря.
    val settingsMap = mutableMapOf<String, String>()
    settingsMap.putAll(mapOf())
//
//Объедините два неизменяемых словаря с данными о багах.
    val bugReportOne = mapOf<String, String>()
    val bugReportTwo = mapOf<String, String>()
bugReportOne.toMutableMap().putAll(bugReportTwo)
//Очистите изменяемый словарь с временными данными о последнем прогоне автоматизированных тестов.
//
    bugMap.clear()
//Исключите из отчета по автоматизированному тестированию те случаи,
// где тесты были пропущены (имеют статус “skipped”)
    statusTestMap.filterNot { it.value=="skipped" }
//
//Удалите из словаря с конфигурациями тестирования набор устаревших конфигураций.
    configMap.remove("old")
//
//Создайте отчет о тестировании,
// преобразовав словарь с результатами тестирования
// (ключ — идентификатор теста, значение — результат) в список строк формата "Test ID: результат".
    resultTest.map{"Test ID:${it.key} результат${it.value}"}
//
//Преобразуйте изменяемый словарь с результатами последнего тестирования в неизменяемый для архивации.
    resultTest.toMap()
//
//Преобразуйте словарь,
// содержащий ID теста и данные о времени выполнения тестов,
// заменив идентификаторы тестов на их названия
// (название можно получить вызвав фейковый метод, например getNameById(id: String))


//
//Для словаря с оценками производительности различных версий приложения увеличьте каждую оценку на 10%, чтобы учесть новые условия тестирования.
//
//Проверьте, пуст ли словарь с ошибками компиляции тестов.
//
//Убедитесь, что словарь с результатами нагрузочного тестирования не пуст.
//
//Проверьте, прошли ли успешно все автоматизированные тесты в словаре с результатами.
//
//Определите, содержит ли словарь с результатами тестирования хотя бы один тест с ошибкой.
//
//Отфильтруйте словарь с результатами тестирования сервисов, оставив только те тесты, которые не прошли успешно и содержат в названии “optional”.
}