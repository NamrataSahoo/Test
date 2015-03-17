package PropertiesEx;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
	public static void main(String[] args) {
		Properties properties= new Properties();
		properties.setProperty("dbanme","risk");
		properties.setProperty("maxconnection","10");
		
		try {
			properties.store(new FileWriter("C:\\NamrataRCR2\\occmigrationrrds\\ws\\Test\\src\\PropertiesEx\\testfile.properties"), "test");
			System.out.println("inside try");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("inside catch");
			e.printStackTrace();
		}
	}
	
	

}
