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
		System.out.println(b1);
		
		
		Bangka1 b3 = (Bangka1)ac1.getBean("bangkaBean1");
		b3.bangkabangka1("������");
		System.out.println(b3);
		//ConnectionPool : db�����Ҷ� ���Ӱ�ü ����°�ó�� 
		
		
		
		Bangka2 b2 = (Bangka2)ac1.getBean("bangkaBean2");
		b2.bangkabangka2("hongGilDong");
		System.out.println(b2); //b2��b11�� �ٸ�
		
		
		Bangka2 b11 = (Bangka2)ac1.getBean("bangkaBean2");
		b11.bangkabangka2("ȫ���");
		System.out.println(b11); //b2�� b11�� prototype -->�翬�� �ٸ���
		//scope�� prototype�϶� �ڹ� new�� ���� ����
	
	}

}
