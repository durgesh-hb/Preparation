package methods;

public class instance {

    void show() {
        System.out.println("Instance Method");
    }

    public static void main(String[] args) {

        instance obj = new instance(); // create object
        obj.show();            // calling method

    }
}