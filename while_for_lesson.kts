import kotlin.math.pow

// Кубы чисел от A до B
fun task1() {
    print("Введите a: ")
    var a = readLine().toString().toInt()
    print("Введите b: ")
    var b = readLine().toString().toInt()

    if (a > b) {
        for (n in a downTo b step 1) {
            val result = n.toDouble().pow(3).toInt()
            println("$result")
        }
    } else {
        for (n in a..b) {
            val result = n.toDouble().pow(3).toInt()
            println("$result")
        }
    }


}


// Числа Фибоначчи
fun task2() {
    print("Введите количество первых чисел Фибоначчи, которое хотите получить: ")
    var n = readLine().toString().toInt()

    var result = 0
    var pre_last = 0
    var last = 1
    for (i in 1..n) {
        println("$result")

        if (result == 1) {
            println("1")
        }

        result = pre_last + last
        pre_last = last
        last = result


    }


}

// "Переворот" числа
fun task3() {
    print("Введите число, которое необходимо перевернуть: ")
    var n = readLine().toString().toInt()
    var result = 0
    while (n != 0) {
        val digit = n % 10
        result = result * 10 + digit
        n /= 10
    }
    print("$result")
}


// Удалить цифру из числа
fun task4() {
    print("Введите число: ")
    var num = readLine().toString().toInt().toString()
    print("Введите цифру, которую надо удалить из этого числа: ")
    var digit_to_del = readLine().toString().toInt().toString().get(0)

    var result = ""
    for (n in num) {
        if (n != digit_to_del) {
            result += n
        }
    }

    print(result)

}


// Гипотеза Сиракуз
fun task5() {
    print("Введите любое натуральное число: ")
    var num = readLine().toString().toInt()


    while (num != 1) {

        if (num % 2 == 0) {
            num /= 2
        } else {
            num = (num * 3) + 1
        }
        println("$num")
    }

}

// Комбинации из трех чисел, дающие в сумме заданное число
fun task6() {
    print("Введите N: ")
    var n = readLine().toString().toInt()
    print("Введите S: ")
    var s = readLine().toString().toInt()


    for (a in 1..n) {
        for (b in 1..n) {
            for (c in 1..n) {
                if (a*b*c == s){
                    println("$a * $b * $c = $s")
                }
            }
        }
    }
}

task1()
task2()
task3()
task4()
task5()
task6()