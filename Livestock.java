import java.util.ArrayList;

// Абстракт класс
abstract class Livestock {
    String name;
    int age;

    public Livestock(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract String makeSound();
    
    void graze() {
        System.out.println(name + " талбайд бэлчинэ.");
    }
    
    void graze(String food) {
        System.out.println(name + " " + food + "-ыг бэлчинэ.");
    }
}

// Интерфейс
interface WorkRole {
    String performTask();
}

// Морь класс
class Horse extends Livestock implements WorkRole {
    public Horse(String name, int age) {
        super(name, age);
    }

    @Override
    String makeSound() {
        return "Янцгаана!";
    }

    @Override
    public String performTask() {
        return "Морь талбайд уналгад хэрэглэгдэнэ.";
    }
}

// Хонь класс
class Sheep extends Livestock {
    public Sheep(String name, int age) {
        super(name, age);
    }

    @Override
    String makeSound() {
        return "Маа!";
    }
}

// Тэмээ класс
class Camel extends Livestock implements WorkRole {
    public Camel(String name, int age) {
        super(name, age);
    }

    @Override
    String makeSound() {
        return "Буйлна!";
    }

    @Override
    public String performTask() {
        return "Тэмээ говийн тээвэрт хэрэглэгдэнэ.";
    }
}

// Ямаа класс
class Goat extends Livestock {
    public Goat(String name, int age) {
        super(name, age);
    }

    @Override
    String makeSound() {
        return "Мээ!";
    }

    // Хэт ачаалсан метод
    String makeSound(int volume) {
        return "Мээ! Дууны хэмжээ: " + volume;
    }
}

// Сүрэг класс
class Herd {
    ArrayList<Livestock> livestock = new ArrayList<>();

    void addLivestock(Livestock animal) {
        livestock.add(animal);
    }

    void dailyRoutine() {
        for (Livestock animal : livestock) {
            System.out.println(animal.name + ": " + animal.makeSound());
            if (animal instanceof WorkRole) {
                System.out.println(((WorkRole) animal).performTask());
            }
            animal.graze();
        }
    }
}

// Үндсэн класс
public class NomadLivestockDemo {
    public static void main(String[] args) {
        Herd herd = new Herd();
        herd.addLivestock(new Horse("Баян", 4));
        herd.addLivestock(new Sheep("Чулуун", 2));
        herd.addLivestock(new Camel("Тэмүр", 6));
        herd.addLivestock(new Goat("Сувдаа", 3));

        herd.dailyRoutine();
        
        // Полиморфизм туршилт
        Livestock[] animals = {
            new Horse("Сүлд", 5),
            new Sheep("Бор", 3),
            new Camel("Арц", 7),
            new Goat("Цагаан", 2)
        };
        
        for (Livestock animal : animals) {
            animal.graze();
        }
    }
}
