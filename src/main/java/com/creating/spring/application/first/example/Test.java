package com.creating.spring.application.first.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("com/creating/spring/application/first/example/applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);

		Student student = (Student) factory.getBean("studentbean");
		student.displayInfo();
		
		Student student1 = (Student) factory.getBean("student");
		student1.displayInfo();
	}
}
