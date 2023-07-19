class Animal{

    public void bark(){
        System.out.println("No Barking");
    }


}

class Dog extends Animal{
    public void bark(){
        System.out.println("Bow Bow");
    }
}

class Cat extends Animal{
    public void bark(){
        System.out.println("Meaw Meaw");
    }
}
public class OverRide {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();
        Cat c = new Cat();

        a.bark();
        d.bark();
        c.bark();
    }
}
