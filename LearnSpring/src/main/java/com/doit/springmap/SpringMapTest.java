package com.doit.springmap;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SpringMapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Resource resource= new ClassPathResource("applicationContext.xml");
		BeanFactory beanFactory= new XmlBeanFactory(resource);
		SpringMap springMap= (SpringMap) beanFactory.getBean("springmapbean");
		springMap.displayInfo();

	}

}
