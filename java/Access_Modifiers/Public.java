package Access_Modifiers;

class MathUtils{
    public static int n; //can access this variable anywhere

    public static int add(int a, int b){ //also this 
        return a + b;
    }

}
public class Public {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        System.out.println(MathUtils.add(5,10));
        
        MathUtils.n = 10; 
        
        System.out.println(MathUtils.n);
		
	}

}