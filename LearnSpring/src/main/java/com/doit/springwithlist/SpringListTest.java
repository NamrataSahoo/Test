package com.doit.springwithlist;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SpringListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Resource resource= new ClassPathResource("applicationContext.xml");
		BeanFactory beanFactory= new XmlBeanFactory(resource);
		SpringList springList= (SpringList) beanFactory.getBean("springlistbean");
		System.out.println("springList.question" + springList.question);
		System.out.println("springList.answers" + springList.question);
		List<String> ans= springList.answers;
		for (int i=0; i<ans.size();i++)
		{
			System.out.println("in for loop" + ans.get(i).toString());
		}
		for(String item: ans)
		{
			System.out.println("for each loop" + item);
		}
			
		springList.displayInfo();

	}

}
