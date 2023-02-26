package com.constructor.injection.with.dependent.object;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args) {
		Resource r = new ClassPathResource("com/constructor/injection/with/dependent/object/applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(r);

		Employee s = (Employee) factory.getBean("e");
		s.show();
	}
}
