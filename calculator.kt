import java.util.*

fun main() {
    val reader = Scanner(System.`in`)
    print("Введите первое число: ")
    val num1 = reader.nextDouble()

    print("Введите второе число: ")
    val num2 = reader.nextDouble()

    print("Выберите операцию (+, -, *, /): ")
    val operator = reader.next()[0]

    val result = when (operator) {
        '+' -> num1 + num2
        '-' -> num1 - num2
        '*' -> num1 * num2
        '/' -> num1 / num2
        else -> throw IllegalArgumentException("Неверный оператор")
    }

    println("Результат: $result")
}
