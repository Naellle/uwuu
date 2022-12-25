import java.util.Scanner;

public class clc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double summa, result, r;
        double vyp;
        int month;

        System.out.println("Выберите тип клиента: ");
        String s = scanner.nextLine();

        switch (s) {
            case "human":
                System.out.println("Введите сумму: ");
                summa = scanner.nextDouble();
                if (summa > 0) {
                    System.out.println("Под какой процент хотите взять кредит?: ");

                } else {
                    System.out.println("Сумма некорректна");
                }
                r = scanner.nextDouble();

                System.out.println("Сумма выплаты: ");
                vyp = scanner.nextDouble();

                result = summa + (summa / 100) * r;

                System.out.println("Input: " + summa + " " + vyp + " " + r + "%" + " " + s);

                System.out.println("Итого к оплате: " + result);

                for (result = summa + summa / 100 * r; result >= vyp; result = result - vyp)
                    System.out.println("Сумма кредита: " + result + " Внесено: " + vyp + " Осталось: " + (result - vyp));
                if (0 > result - vyp)
                    break; //немного не разобралась как округлить число, иногда после "," много символов

                break;

            case "business":
                System.out.println("Введите сумму: ");
                summa = scanner.nextDouble();
                if (summa > 0) {
                    System.out.println("Под какой процент хотите взять кредит?: ");

                } else {
                    System.out.println("Сумма некорректна");
                }
                r = scanner.nextDouble();

                System.out.println("Сумма выплаты: ");
                vyp = scanner.nextDouble();


                result = summa + (summa / 100) * r;

                System.out.println("Input: " + summa + " " + vyp + " " + r + "%" + " " + s);


                System.out.println("Итого к оплате: " + result);
                System.out.println("На какой период вы хотите взять кредит (в месяцах)? :");
                month = scanner.nextInt();
                System.out.println("Платежи: ");

                if (month <= 12) {
                    System.out.println("Сумма кредита: " + summa + " Внесено: " + vyp + " Осталось: " + (summa - vyp));
                } else if (month > 12)
                System.out.println("Сумма кредита: " + (summa + summa / 100 * r) + " Внесено: " + vyp + " Осталось: " + (summa - vyp));
                result--;

                break;
            default:
                System.out.println("Мы вам перезвоним. ");
        }
    }

}
