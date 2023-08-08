public class Animals
{
    void eat(){};
    void sound(){};

}
class Cat extends Animals
{
    @Override
    void eat() {
        System.out.println("meat");
        super.eat();
    }

    @Override
    void sound() {
        System.out.println("Miwo");
        super.sound();
    }
}
class Dog extends Animals
{
    @Override
    void eat() {
        System.out.println("meat");
        super.eat();
    }

    @Override
    void sound() {
        System.out.println("wh wh");
        super.sound();
    }
}

class Bird extends Animals
{
    @Override
    void eat() {
        System.out.println("Beans");
        super.eat();
    }

    @Override
    void sound() {
        System.out.println("Tutt ");
        super.sound();
    }
}