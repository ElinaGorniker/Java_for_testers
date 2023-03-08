package JavaOOP;

public class Cat extends Animal {

    private String name;
    private String breed;

    public Cat (String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }




    public String getName() {
        return name;
    }
    public String getBreed() {
        return breed;
    }

    @Override
    void makeSound() {
        System.out.println("Meou");
    }
}

