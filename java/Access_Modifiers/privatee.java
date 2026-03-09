package Access_Modifiers;

class Person {

    private String name;   // private variable

    void setName(String n){
        name = n;
    }

    void showName(){
        System.out.println(name);
    }
}

public class privatee {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p = new Person(); // create object

        p.setName("Alice");      // set value
        p.showName();
       // p.name="nithin";  its shows error 
         // print value
          // ERROR (because name is private)
	}

}