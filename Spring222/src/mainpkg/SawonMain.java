package mainpkg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sawon.Sawon;

public class SawonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext3.xml"); //GenericXmlApplicationContext("");를 써도 무방!!
		Sawon sa1 = (Sawon)ac.getBean("sawon1");
		sa1.setName("Jang  Hee Soo");
		sa1.setId("1");
		System.out.println(sa1.toString());
	}

}
