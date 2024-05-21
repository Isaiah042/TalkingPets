public class Pets implements Comparable<Pets>{
//Field
    private String name;

    //Constructor
    public Pets() {
        this.name = "No name";
    }
//Methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void speak(){
        System.out.println("I messed up");
    }


    @Override
    public int compareTo(Pets pets) {
        return this.getName().compareTo((pets.getName()));
    }

    @Override
    public String toString() {
        return "Pets{" +
                "name='" + name + '\'' +
                '}';
    }
}

