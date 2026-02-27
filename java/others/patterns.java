package others;

public class patterns{
    public static void main(String[] args) {
        pattern1(5);
    }

    static void pattern1(int n){
        for(int i=0; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}