public class MainAnimal {
    public static void main(String[] args) {
        Animal d = new Dog("Bark--->> Bow Bow!!");
        Animal c = new Cat("cat --->> Meow Meow!!");
        Animal co = new Cow("cow--->>Ambaa Ambaa!!");

        System.out.println("the sound of  dog is "+d.makeSound());
        System.out.println("the sound of cat is "+c.makeSound());
        System.out.println("the sound of cow is "+co.makeSound());
    }

}
