/**Создайте класс Phone, который содержит переменные number, model и weight.
 Создайте три экземпляра этого класса. Выведите на консоль значения их переменных.
 Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего. Выводит на консоль сообщение “Звонит {name}”.
 Метод getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов.
 Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных класса - number, modelи weight.
 Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model. Добавить конструктор без параметров..
 Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего.Вызвать этот метод. **/
public class Phone {
    private String number;
    private String model;
    private double weight;

    // Конструктор с тремя параметрами
    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    // Конструктор с двумя параметрами
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    // Конструктор без параметров
    public Phone() {
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public String getNumber() {
        return number;
    }

    // Перегруженный метод receiveCall с двумя параметрами
    public void receiveCall(String name, String callerNumber) {
        System.out.println("Звонит " + name + " с номера " + callerNumber);
    }

    public static void main(String[] args) {
        // Создание трех экземпляров класса Phone
        Phone phone1 = new Phone("069456789", "iPhone X", 150);
        Phone phone2 = new Phone("067654321", "Samsung Galaxy S10", 170);
        Phone phone3 = new Phone("065555577", "Xiaomi Redmi 10", 190);

        // Вывод значений переменных для каждого объекта
        System.out.println("Телефон 1:");
        System.out.println("Номер: " + phone1.number);
        System.out.println("Модель: " + phone1.model);
        System.out.println("Вес: " + phone1.weight);

        System.out.println("Телефон 2:");
        System.out.println("Номер: " + phone2.number);
        System.out.println("Модель: " + phone2.model);
        System.out.println("Вес: " + phone2.weight);

        System.out.println("Телефон 3:");
        System.out.println("Номер: " + phone3.number);
        System.out.println("Модель: " + phone3.model);
        System.out.println("Вес: " + phone3.weight);

        // Вызов методов receiveCall и getNumber для каждого объекта
        phone1.receiveCall("Алиса");
        System.out.println("Номер телефона: " + phone1.getNumber());

        phone2.receiveCall("Илья");
        System.out.println("Номер телефона: " + phone2.getNumber());

        phone3.receiveCall("Роман");
        System.out.println("Номер телефона: " + phone3.getNumber());

        // Вызов перегруженного метода receiveCall для каждого объекта
        phone1.receiveCall("Сергей", "060888777");
        phone2.receiveCall("Ина", "068222333");
        phone3.receiveCall("Алла", "022555666");
    }
}