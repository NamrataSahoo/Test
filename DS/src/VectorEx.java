import java.util.Enumeration;
import java.util.Vector;


public class VectorEx {
	public static void main(String[] args) {
		Vector vector= new Vector();
		vector.add("Nam");
		vector.add("Sahoo");
		Enumeration enumeration= vector.elements();
		while(enumeration.hasMoreElements())
		{
			System.out.println(enumeration.nextElement());
		}
	}

}
