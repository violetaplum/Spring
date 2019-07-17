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
		
		
		
		Sawon sa2 = (Sawon)ac.getBean("sawon1");
		sa2.setName("Kang");
		sa2.setId("2");
		System.out.println(sa1+" "+sa2);
		
		
		//둘을 동시에 출력해보면 singleton의 문제가 보임
		//sa1,sa2가 같은 객체이므로 둘다 "Kang"의 객체임..
	}

}
