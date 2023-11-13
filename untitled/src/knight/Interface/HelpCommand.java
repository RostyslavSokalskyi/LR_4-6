package knight.Interface;

public class HelpCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Довідка:");
        System.out.println("1. Екіпірувати - екіпірувати рицаря");
        System.out.println("2. Пошук за ціною - знаходження амуніції в заданому діапазоні цін");
        System.out.println("3. Сортування за вагою - сортування амуніції за вагою");
        System.out.println("4. Визначити ієрархію - виведення ієрархії амуніції");
        System.out.println("5. Розрахувати загальну вартість - розрахунок загальної вартості амуніції");
        System.out.println("6. Завантажити з файлу - завантаження амуніції з файлу");
        System.out.println("7. Довідка - виведення цього повідомлення");
        System.out.println("8. Вихід - вихід з програми");
    }
}
