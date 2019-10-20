package HW6;

public class AnimalHierarchyVol1 {

    public static void main(String[] args) {
        Dog dog = new Dog(181298, 10, 5, "black", "Barbsos", "Vaccinated");
        Cat cat = new Cat(92928, 5, 3, "white", "Matroskin", "Vaccinated");
        GuideDog guideDog = new GuideDog(910293, 7, 6, "Black", "GoodBoy", "Vaccianated", "Trained");
        Wolf wolf = new Wolf(9182918, 15, 15, "Gray", "Predator");
        Lion lion = new Lion(93939, 12, 85, "white", "Predator");
        Giraffe giraffe = new Giraffe(393939, 16, 100, "OrangeBrown", "Predator");
        Crocodile crocodile = new Crocodile(18181881, 30, 100, "Green", "Predator");
        Hamster hamster = new Hamster(81818, 1, 1, "Grey", "Predator");
        Fish fish = new Fish(8372, 1, 1, "Gold");

        Animal[] animals = {dog, cat, guideDog, wolf, lion, giraffe, crocodile, hamster, fish};

        for (Animal animal : animals) {
            animal.voice();
        }
    }
}

interface VoiceAll {
    default void voice() {
        System.out.println("Hello, " + makeVoice());
    }
    String makeVoice();
}

abstract class Animal implements VoiceAll {
    private int id;
    private int age;
    private int weight;
    private String color;


    public Animal(int id, int age, int weight, String color) {
        this.id = id;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

abstract class Pet extends Animal implements VoiceAll {
    private String name;
    private String isVaccinated;

    public Pet(int id, int age, int weight, String color, String name, String isVaccinated) {
        super(id, age, weight, color);
        this.name = name;
        this.isVaccinated = isVaccinated;
    }

    @Override
    public String makeVoice() {
        return "my name is " + name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsVaccinated() {
        return isVaccinated;
    }

    public void setIsVaccinated(String isVaccinated) {
        this.isVaccinated = isVaccinated;
    }
}


class Dog extends Pet{
    public Dog(int id, int age, int weight, String color, String name, String isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
    }

    @Override
    public String makeVoice() {
        return "my name is " + getName() + "\n Woof";
    }

}

class Cat extends Pet {
    public Cat(int id, int age, int weight, String color, String name, String isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
    }

    @Override
    public String makeVoice() {
        return "my name is " + getName() + "\n Meow";
    }
}

class GuideDog extends Pet {
    private String isTrained;

    public GuideDog(int id, int age, int weight, String color, String name, String isVaccinated, String isTrained) {
        super(id, age, weight, color, name, isVaccinated);
        this.isTrained = isTrained;
    }

    @Override
    public String makeVoice() {
        return "my name is " + getName() + "\n I can take you home";
    }

    public void goToHome() {
        System.out.println("I can take you home");
    }

    public String getIsTrained() {
        return isTrained;
    }

    public void setIsTrained(String isTrained) {
        this.isTrained = isTrained;
    }
}

abstract class Wild extends Animal {
    private String isPredator;

    public Wild(int id, int age, int weight, String color, String isPredator) {
        super(id, age, weight, color);
        this.isPredator = isPredator;
    }

    @Override
    public String makeVoice() {
        return "I am a wild animal";
    }

    public String getIsPredator() {
        return isPredator;
    }

    public void setIsPredator(String isPredator) {
        this.isPredator = isPredator;
    }
}

class Wolf extends Wild {
    public Wolf(int id, int age, int weight, String color, String isPredator) {
        super(id, age, weight, color, isPredator);
    }

    @Override
    public String makeVoice() {
        return "I am a wild animal \n and I am angry";
    }
}

class Lion extends Wild {
    public Lion(int id, int age, int weight, String color, String isPredator) {
        super(id, age, weight, color, isPredator);
    }

    @Override
    public String makeVoice() {
        return "I am a wild animal \n and I am angry";
    }
}

class Giraffe extends Wild {
    public Giraffe(int id, int age, int weight, String color, String isPredator) {
        super(id, age, weight, color, isPredator);
    }

    @Override
    public String makeVoice() {
        return "I am a wild animal";
    }
}

class Crocodile extends Wild {
    public Crocodile(int id, int age, int weight, String color, String isPredator) {
        super(id, age, weight, color, isPredator);
    }

    @Override
    public String makeVoice() {
        return "I am a wild animal \n and I am angry";
    }
}

class Hamster extends Wild {
    public Hamster(int id, int age, int weight, String color, String isPredator) {
        super(id, age, weight, color, isPredator);
    }

    @Override
    public String makeVoice() {
        return "I am a wild animal";
    }
}

class Fish extends Animal {
    public Fish(int id, int age, int weight, String color) {
        super(id, age, weight, color);
    }

    @Override
    public String makeVoice() {
        return "....";
    }

}
