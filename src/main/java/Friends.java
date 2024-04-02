import java.util.Scanner;

public class Friends {
    public static void main(String[] args) {
        Scanner scanObj = new Scanner(System.in);
        System.out.println("How many pets do you have?");
        int allPets = scanObj.nextInt();
        Pets[] pets = new Pets[allPets];

        for (int i = 0; i < allPets; i++) {
            System.out.println("What is pet " + (i + 1) + " name?");
            String petName = scanObj.next();
            System.out.println("What kind of animal is it?");
            String petAnimal = scanObj.next();


            switch (petAnimal.toLowerCase()) {
                case "monkey":
                    Monkey addMonkey = new Monkey();
                    addMonkey.setName(petName);
                    pets[i] = addMonkey;
                    continue;
                case "tiger":
                    Tiger addTiger = new Tiger();
                    addTiger.setName(petName);
                    pets[i] = addTiger;
                    continue;
                case "dog":
                    Dog addDog = new Dog();
                    addDog.setName(petName);
                    pets[i] = addDog;
                    continue;
                case "cat":
                    Cat addCat = new Cat();
                    addCat.setName(petName);
                    pets[i] = addCat;
                    continue;
                default:
                    Pets addPet = new Pets();
                    addPet.setName(petName);
                    pets[i] = addPet;
            }

        }

        for (Pets Pet : pets) {
            System.out.println("Pet Name: " + Pet.getName());
            Pet.speak();

        }
    }

}
