package operators;

public class operators {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Arithmetic Operators [ +,-,/,*,%]
		
		//2. Unary Operators
		
		  // Integer declared
            int a = 200;
            int b = 10;

        // Using unary operators
        System.out.println("Postincrement : " + (a++));
        
        System.out.println("Postdecrement : " + (b--));
        System.out.println("Predecrement : " + (--b));
        
        //3. Assignment Operator {+=,-+,/=,*=,%=}
        
        //4. Relational Operators  //[>,<,>=,<=,==,!=]         // Comparison operators

        //5. Logical Operators   [&&,||,!]
        
        /*6./ Ternary Operator  :
        The Ternary Operator is a shorthand version of the
         if-else statement. */

        //condition ? value_if_true : value_if_false;\
        {
        	int age = 20;

        	String result = (age >= 18) ? "Adult" : "Minor";
        	System.out.println(result);
        }
    
        //7. Bitwise Operators   [&,|,~,<<,>>]
        
	}

}