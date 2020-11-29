public class Calculator {
    private double a;
    private double b;
    private String operate;

    public Calculator(double num1, String operation, double num2) {
        a = num1;
        b = num2;
        operate = operation;

        switch (operation) {
            case ("add"):
                System.out.println(add(num1, num2));
                break;
            case ("substract"):
                System.out.println(substract(num1, num2));
                break;
            case ("multiplication"):
                System.out.println(multiplication(num1, num2));
                break;
            case ("division"):
                System.out.println(division(num1, num2));
                break;
            default:
                System.out.println("Проверьте корректность вводённой операции");
        }
    }

    public double add(double num1, double num2) {

        return num1 + num2;
    }

    public double substract(double num1, double num2) {

        return num1 - num2;
    }

    public double multiplication(double num1, double num2) {

        return num1 * num2;
    }

    public double division(double num1, double num2) {

        return num1 / num2;
    }
}