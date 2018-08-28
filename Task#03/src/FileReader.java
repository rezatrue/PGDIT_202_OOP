import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.stream.Stream;

public class FileReader {
	
	static int count= 0;
	public static void main(String[] args) {
		String fileName = "input.txt";
		
        InputStream fis = null;
		try {
			fis = new FileInputStream(fileName);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
        BufferedReader br = new BufferedReader(isr);
         
        
        br.lines().forEach(line -> {
        	System.out.print((++count) + " "); 
        	String space=" ";
            String[] words=((String)line).split(space);
        	System.out.println(words.length);}
        	);
        
        
       
	}

}
