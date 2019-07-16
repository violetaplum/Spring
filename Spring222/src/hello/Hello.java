package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bangka.*;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac1 = 
				new ClassPathXmlApplicationContext("applicationContext1.xml");
		//classpath���� xml�� �о�� bean���� ��Ÿ���� ���� ���
		//applicationcontext�ν��Ͻ��� ����
		//Bangka1 Ŭ������ ���� new �� ���⼭ ����°� �ƴ�
	
	
		Bangka1 b1 = (Bangka1)ac1.getBean("bangkaBean1");
		//No new
		//bean��ü�� ������ IoC�����̳ʷ� ���� bean��ü�� �����´�(get�Ѵ�)
		//DI (������ ����)�� �̷������.
		//��, ���� ���ϸ� new�� xmlȯ�漳������ �����
		//�ش簴ü�� ����ͼ� ���
		//������ ������ �ʿ��xml ���ַ� �����ϸ� ��
		b1.bangkabangka1("ȫ�浿");
		
		Bangka2 b2 = (Bangka2)ac1.getBean("bangkaBean2");
		b2.bangkabangka2("hongGilDong");
	
	}

}
