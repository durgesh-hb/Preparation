package Access_Modifiers;

class Car {

    String model; // default access

}

public class Default {
    public static void main(String[] args){

        Car c = new Car();
        c.model = "Tesla";

        System.out.println(c.model);

}
}