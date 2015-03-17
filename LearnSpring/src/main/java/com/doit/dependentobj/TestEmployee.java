package com.doit.dependentobj;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestEmployee {
	public static void main(String[] args) {
		
	
	Resource resource= new ClassPathResource("applicationcontext.xml");
	BeanFactory beanFactory= new XmlBeanFactory(resource);
	Employee employee= (Employee) beanFactory.getBean("employeeaddbean");
	System.out.println(employee);
	System.out.println(employee.getAddress().toString());
	}	

}
