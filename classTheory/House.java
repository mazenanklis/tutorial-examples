public class House {

    private Pet[] pets;

    public House() {
    }

    public void addPet(Pet pet) {
    }
}

public abstract class Pet {

    private String name;
    private House home;

    public Pet(String name, House home) {
    }

    public String getName() {
        return null;
    }

    public House getHome() {
        return null;
    }

    public abstract void makeNoise();
}

public class Dog extends Pet {

    public Dog(String name, House home) {
        super(name, home);
    }

    @Override
    public void makeNoise() {
    }
}


public class Cat extends Pet {

    public Cat(String name, House home) {
        super(name, home);
    }

    @Override
    public void makeNoise() {
    }
}