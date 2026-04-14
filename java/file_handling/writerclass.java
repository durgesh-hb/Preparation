package file_handling;
import java.io.FileWriter;
import java.io.IOException;
public class writerclass {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileWriter write = new FileWriter("D:\\HTML\\new java\\leraning_java\\src\\file_handlig\\sample.txt");
		
		write.write("hello this is written by writer class");
		write.write("\n hello bro ");
		write.close();
		
		System.out.println("written into the file");
		
		}
		
		catch(IOException e) {
			System.out.println("An error occurred: " + e.getMessage());
		}
		
	}
    
}
