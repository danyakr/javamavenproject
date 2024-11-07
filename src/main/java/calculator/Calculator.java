package calculator;

public class Calculator {
    
    /**
     * Выполняет сложение двух чисел.
     *
     * @param a Первое число.
     * @param b Второе число.
     * @return Сумма a и b.
     */
    public double add(double a, double b) {
        return a + b;
    }

    /**
     * Выполняет вычитание одного числа из другого.
     *
     * @param a Первое число.
     * @param b Второе число.
     * @return Разница между a и b.
     */
    public double subtract(double a, double b) {
        return a - b;
    }

    /**
     * Выполняет умножение двух чисел.
     *
     * @param a Первое число.
     * @param b Второе число.
     * @return Произведение a и b.
     */
    public double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Выполняет деление одного числа на другое.
     *
     * @param a Делимое.
     * @param b Делитель.
     * @return Результат деления a на b.
     * @throws ArithmeticException Если b равно нулю.
     */
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль невозможно.");
        }
        return a / b;
    }
}
