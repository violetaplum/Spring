package mainpkg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lotto.Lotto;

public class KajaLottomain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext2.xml");
		Lotto lo1 = (Lotto)ac.getBean("lotto1");
		lo1.kajaLotto("print!!!! >>>> ");
		lo1.kajaLotto("print!!!! >>>> ");
		lo1.kajaLotto("print!!!! >>>> ");
		lo1.kajaLotto("print!!!! >>>> ");
		lo1.kajaLotto("print!!!! >>>> ");
		lo1.kajaLotto("print!!!! >>>> ");
		lo1.kajaLotto("print!!!! >>>> ");
		
	}

}
