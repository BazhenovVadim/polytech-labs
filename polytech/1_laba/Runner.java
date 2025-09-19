package polytech.first_laba;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        HRDepartament hrDepartament = new HRDepartament();
        System.out.println("Введите данные для департамента");
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Ввод данных ===");

        while (true) {
            System.out.print("Введите имя: ");
            String name = scanner.nextLine().trim();
            if (!name.isEmpty()) {
                hrDepartament.setName(name);
                break;
            }
            System.out.println("Имя не может быть пустым!");
        }
        while (true) {
            System.out.print("Введите количество участников: ");
            try {
                long countMembers = Long.parseLong(scanner.nextLine());
                if (countMembers > 0) {
                    hrDepartament.setCountMembers(countMembers);
                    break;
                }
                System.out.println("Количество должно быть больше 0!");
            } catch (NumberFormatException e) {
                System.out.println("Введите корректное число!");
            }
        }

        while (true) {
            System.out.print("Введите норму времени (часы): ");
            try {
                int timeNorm = Integer.parseInt(scanner.nextLine());
                if (timeNorm > 0) {
                    hrDepartament.setTimeNorm(timeNorm);
                    break;
                }
                System.out.println("Норма времени должна быть положительным числом!");
            } catch (NumberFormatException e) {
                System.out.println("Введите корректное число!");
            }
        }

        while (true) {
            System.out.print("Введите зарплату в час: ");
            try {
                int salaryInHour = Integer.parseInt(scanner.nextLine());
                if (salaryInHour > 0) {
                    hrDepartament.setSalaryInHour(salaryInHour);
                    break;
                }
                System.out.println("Зарплата должна быть больше 0!");
            } catch (NumberFormatException e) {
                System.out.println("Введите корректное число!");
            }
        }

        while (true) {
            System.out.print("Введите налог (%): ");
            try {
                float tax = Float.parseFloat(scanner.nextLine());
                if (tax >= 0 && tax <= 100) {
                    hrDepartament.setTax(tax);
                    break;
                }
                System.out.println("Налог должен быть от 0 до 100%!");
            } catch (NumberFormatException e) {
                System.out.println("Введите корректное число!");
            }
        }
        System.out.println("Расчет зарплаты сотрудника с учетом введенных данных: ");
        System.out.println(hrDepartament.calculateSalary(hrDepartament.getSalaryInHour(), hrDepartament.getTax(), hrDepartament.getTimeNorm()));
    }
}
