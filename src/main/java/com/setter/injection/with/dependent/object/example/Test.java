package com.setter.injection.with.dependent.object.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args) {
		Resource r = new ClassPathResource("com/setter/injection/with/dependent/object/example/applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(r);

		Employee e = (Employee) factory.getBean("obj");
		e.displayInfo();
		
		Employee e2 = (Employee) factory.getBean("obj2");
		e2.displayInfo();
		
	}
}
