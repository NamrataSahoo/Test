package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


class Student implements Comparable<Student>
{
	 int id;
	 int age;
	 String name;
	public Student() {
		
	}
	public Student(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if(age == o.age)
			return 0;
		else if(age>o.age )
			return 1;
		else 
			return -1;
		
	}
	
}
public class UserDefinedArrayListTYpe {
	
	public static void main(String[] args) {
		Student student= new Student(1,30,"Nam");
		Student student2= new Student(2,20,"Abha");
		Student student3= new Student(3,10,"SAbha");
		ArrayList arrayList= new ArrayList();
		arrayList.add(student);
		arrayList.add(student2);
		arrayList.add(student3);
		//arrayList.remove(1);
		
		Collections.sort(arrayList);
		Iterator iterator= arrayList.iterator();
		
		while(iterator.hasNext())
		{
			Student stu= (Student) iterator.next();
			System.out.println( stu.id + stu.name + stu.age );
			if(stu.id==2)
			{
				iterator.remove();
			}
			System.out.println("After removal"+ stu.id + stu.name + stu.age );
		}
	}
	

}
