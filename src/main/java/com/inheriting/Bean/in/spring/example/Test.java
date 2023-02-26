package com.inheriting.Bean.in.spring.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args) {
		Resource r = new ClassPathResource("com/inheriting/Bean/in/spring/example/applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(r);

		Employee e1 = (Employee) factory.getBean("e2");
		e1.show();
		
		Employee e2 = (Employee) factory.getBean("d2");
		e2.show();
	}
}
