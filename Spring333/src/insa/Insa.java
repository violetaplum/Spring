package insa;

public class Insa {
	private String name;
	public void setName(String name)
	{
		this.name=name; //���߿� ���ڰ� ��ü�� �Ѿ�� �� �ִ�..//setter injection
	}
	public String insaGo(String str)
	{
		return this.name+" ��\n"+str;
	}

}
