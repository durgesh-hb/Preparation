package file_handling;
import java.io.FileReader;
public class readerclass {
    public static void main(String[] args) {
		// TODO Auto-generated method stub

		    try {
		        FileReader fr = new FileReader("D:\\HTML\\new java\\leraning_java\\src\\file_handlig\\sample.txt");
		        int i;
		        while ((i = fr.read()) != -1) { //run till file become -1
		            System.out.print((char)i); // converting to char from ascii
		        }
		        fr.close();
		    } catch (Exception a) {
		        System.out.println(a);
		    }
		}
}
