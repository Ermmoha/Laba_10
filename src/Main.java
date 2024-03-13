public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("китикет", "на полу", "Овчарка");
        Cat cat = new Cat("вискас", "на кровати","Данек Лапицкий");
        Horse horse = new Horse("сено", "в амбаре",2);
        Veterinar veterinar = new Veterinar("Бобик", 15);
        Veterinar veterinar2 = new Veterinar("Данек Лапицкий", 11);
        Veterinar veterinar3 = new Veterinar("Молния", 4);
        dog.Sleep();
        dog.Eat();
        dog.makeNoise();
        cat.Sleep();
        cat.Eat();
        cat.makeNoise();
        horse.Sleep();
        horse.Eat();
        horse.makeNoise();
        veterinar.treatAnimal(dog);
        veterinar2.treatAnimal(cat);
        veterinar3.treatAnimal(horse);
    }
}
class Animal {
    String Food;
    String Location;
    Animal(String Food, String Location){
        this.Food = Food;
        this.Location = Location;
    }
    public void makeNoise(){
        System.out.println("Какое-то животное сладко лежит");
    }
    public void Eat(){
        System.out.println("Какое-то животное сладко кушает");
    }
    public void Sleep(){
        System.out.println("Какое-то животное сладко спит");
    }
}
class Dog extends Animal {
    String Type;
    Dog(String Food, String Location, String Poroda) {
        super(Food, Location);
        this.Type = Poroda;
    }
    @Override
    public void makeNoise() {
        System.out.println("Собачка сладко лежит " + Location);
    }
    @Override
    public void Eat() {
        System.out.println("Собачка сладко кушает " + Food);
    }
    @Override
    public void Sleep() {
        System.out.println("Собачка сладко спит " + Location);
    }
}
class Cat extends Animal{
    String Name;
    Cat(String Food, String Location, String name) {
        super(Food, Location);
        this.Name = name;
    }
    @Override
    public void makeNoise() {
        System.out.println("Кот сладко лежит " + Location);
    }
    @Override
    public void Eat() {
        System.out.println("Кот сладко кушает " + Food);
    }
    @Override
    public void Sleep() {
        System.out.println("Кот сладко спит " + Location);
    }
}
class Horse extends Animal {
    int High;
    Horse(String Food, String Location, int high) {
        super(Food, Location);
        this.High = high;
    }
    @Override
    public void makeNoise() {
        System.out.println("Лошадь сладко спит " + Location);
    }
    @Override
    public void Eat() {
        System.out.println("Лошадь сладко кушает " + Food);
    }
    @Override
    public void Sleep() {
        System.out.println("Лошадь сладко спит " + Location);
    }
}
class Veterinar {
    String Name;
    int Age;
    Veterinar(String Name, int Age){
        this.Name = Name;
        this.Age = Age;
    }
    void treatAnimal(Animal animal){
        System.out.println( "Животное: " +Name+ " пришел к ветеринару. " + "Он ест: " + animal.Food + " Он обитает " + animal.Location);
    }
}