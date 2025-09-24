public class Animal {
    //Base class Animal has makeSound(). Subclasses Dog, Cat, Cow override it.
    //1.	Create class Animal with method void makeSound().
    //2.	Override: Dog → "Bark", Cat → "Meow", Cow → "Moo".
    //3.	In main(), test all.
    String makeSound(){
        return " ";

    }

}
class Dog extends Animal{
    private String sound;

    Dog(String sound){
        this.sound = sound;
    }
    @Override
    String makeSound() {
        return sound;
    }
}


class Cat extends Animal{
    private String sound;

    Cat(String sound){
        this.sound = sound;
    }
    @Override
    String makeSound() {
        return sound;
    }
}


class Cow extends Animal{
    private String sound;

    Cow(String sound){
        this.sound = sound;
    }
    @Override
    String makeSound() {
        return sound;
    }
}

