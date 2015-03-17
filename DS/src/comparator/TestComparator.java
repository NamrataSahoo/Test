
package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestComparator {
	public static void main(String[] args) {
		Student s1= new Student(70,1,200000);
		Student s2 = new Student(30,2,300000);
ArrayList arrayList = new ArrayList<>();
arrayList.add(s1);
arrayList.add(s2);

Collections.sort(arrayList,new AgeComparator());
Iterator iterator= arrayList.iterator();
while(iterator.hasNext())
{
	Student student= (Student) iterator.next();
	System.out.println(student.age + student.salary);
	
}
	}
	
}
