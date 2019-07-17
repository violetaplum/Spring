package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bangka.*;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac1 = 
				new ClassPathXmlApplicationContext("applicationContext1.xml");
		//classpath에서 xml을 읽어와 bean설정 메타정보 등을 얻어
		//applicationcontext인스턴스를 생성
		//Bangka1 클래스에 대한 new 가 여기서 만드는게 아님
	
	
		Bangka1 b1 = (Bangka1)ac1.getBean("bangkaBean1");
		//No new
		//bean객체를 생성한 IoC컨테이너로 부터 bean객체를 가져온다(get한다)
		//DI (의존성 주입)가 이루어진다.
		//즉, 쉽게 말하면 new를 xml환경설정에서 만들고
		//해당객체를 갖고와서 사용
		//복잡한 수정이 필요시xml 위주로 수정하면 됨
		b1.bangkabangka1("홍길동");
		System.out.println(b1);
		
		
		Bangka1 b3 = (Bangka1)ac1.getBean("bangkaBean1");
		b3.bangkabangka1("성춘향");
		System.out.println(b3);
		//ConnectionPool : db접속할때 접속객체 만드는것처럼 
		
		
		
		Bangka2 b2 = (Bangka2)ac1.getBean("bangkaBean2");
		b2.bangkabangka2("hongGilDong");
		System.out.println(b2); //b2와b11은 다름
		
		
		Bangka2 b11 = (Bangka2)ac1.getBean("bangkaBean2");
		b11.bangkabangka2("홍깃순");
		System.out.println(b11); //b2와 b11은 prototype -->당연히 다르다
		//scope가 prototype일때 자바 new와 같은 형태
	
	}

}
