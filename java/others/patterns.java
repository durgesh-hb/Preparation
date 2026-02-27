package others;

public class patterns{
    public static void main(String[] args) {
        pattern1(5);
    }

    static void pattern1(int n){
        //outter loop for row
        for(int row=0; row<=n; row++){
            //inner loop for calumn
            for(int cal=1; cal<=n; cal++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}