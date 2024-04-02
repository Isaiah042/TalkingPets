public class Pets {

    private String name;

    public Pets() {
        this.name = "No name";
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pets(String name){
        this.name = name;
    }
    public void speak(){
        System.out.println("I messed up");
    }


}

