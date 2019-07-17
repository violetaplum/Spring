package insa;

public class Insa {
	private String name;
	public void setName(String name)
	{
		this.name=name; //나중에 인자가 객체로 넘어올 수 있다..//setter injection
	}
	public String insaGo(String str)
	{
		return this.name+" 님\n"+str;
	}

}
