// Есть ли 7 в числе
fun task1() {
    var user_number = readLine().toString()

    if ("7" in user_number) {
        println("Есть")
    } else {
        println("Нет")
    }
}

// Есть ли 4 и 6 в числе
fun task2() {
    var user_number = readLine().toString()

    if ("4" in user_number && "6" in user_number) {
        println("Есть")
    } else {
        println("Нет")
    }
}


// Определение принадлежности диапазону
fun task3() {
    var user_number = readLine().toString().toInt()
    var a = 1
    var b = 10

    if (!(user_number in a..b)) {
        println("Число $user_number не принадлежит диапазоноу [$a , $b]")
    } else {
        println("Число $user_number есть в [$a , $b]")
    }
}

// Склонение слов
fun task4() {
    var price: Int = readLine().toString().toInt()
    val range1 = listOf(0, 5, 6, 7, 8, 9)
    val range2 = 10..19


    if (price % 10 in range1 || price % 100 in range2) {
        println("Цена $price рублей")
    } else if (price % 10 == 1) {
        println("Цена $price рубль")
    } else {
        println("Цена $price рубля")
    }
}

// День рождения
fun task5() {

    println("Введите данные пользователя")


    var age = readLine().toString().toInt()
    var fio = readLine().toString()
    var gender = readLine().toString()

    if (age < 18) {
        println("Пользователю нет 18 лет")
        return
    }

    var type_of_birthday = "днём рождения"
    if (age % 5 == 0) {
        type_of_birthday = "юбилеем"
    }

    var respected = "Уважаемый"
    if (gender == "f") {
        respected = "Уважаемая"
    }


    println("$respected $fio. Поздравляю с $type_of_birthday. Желаю всего самого наилучшего!")


}

//task1()
//task2()
//task3()
//task4()
//task5()

