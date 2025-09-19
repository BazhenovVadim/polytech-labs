class HRDepartament:
    def __init__(self):
        self.name = ""
        self.count_members = 0
        self.time_norm = 0
        self.salary_in_hour = 0
        self.tax = 0.0

    def validate_name(self):
        while True:
            name = input("Введите имя: ").strip()
            if name:
                return name
            print("Имя не может быть пустым!")

    def validate_positive_int(self, field_name, max_value=None):
        while True:
            try:
                value = int(input(f"Введите {field_name}: "))
                if value > 0:
                    if max_value and value > max_value:
                        print(f" {field_name} не может превышать {max_value}!")
                    else:
                        return value
                else:
                    print(f" {field_name} должно быть больше 0!")
            except ValueError:
                print(" Введите корректное целое число!")

    def validate_positive_long(self, field_name):
        while True:
            try:
                value = int(input(f"Введите {field_name}: "))
                if value > 0:
                    return value
                else:
                    print(f" {field_name} должно быть больше 0!")
            except ValueError:
                print("Введите корректное число!")

    def validate_tax(self):
        while True:
            try:
                value = float(input("Введите налог (%): "))
                if 0 <= value <= 100:
                    return value
                print("Налог должен быть от 0 до 100%!")
            except ValueError:
                print("Введите корректное число!")

    def input_data(self):
        print("=== Ввод данных ===")

        self.name = self.validate_name()
        self.count_members = self.validate_positive_long("количество участников")
        self.time_norm = self.validate_positive_int("норму времени (часы)", 24)
        self.salary_in_hour = self.validate_positive_int("зарплату в час")
        self.tax = self.validate_tax()

        print(" Данные успешно введены!")

    def display_data(self):
        print("\n=== Введенные данные ===")
        print(f"Имя: {self.name}")
        print(f"Количество участников: {self.count_members}")
        print(f"Норма времени: {self.time_norm} часов")
        print(f"Зарплата в час: {self.salary_in_hour}")
        print(f"Налог: {self.tax}%")

    def calculate_salary(self):
        gross_salary = self.salary_in_hour * self.time_norm
        net_salary = gross_salary * (1 - self.tax / 100)
        print(f"\n Расчет зарплаты:")
        print(f"Брутто: {gross_salary} руб.")
        print(f"Нетто (после налога {self.tax}%): {net_salary:.2f} руб.")


if __name__ == "__main__":
    data_input = HRDepartament()
    data_input.input_data()
    data_input.display_data()
    data_input.calculate_salary()