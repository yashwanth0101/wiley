package mthree.training.practice;

public class Encaps {
private int id;
private String name;
public void setId(int id)
{
this.id=id;
}
public void setName(String name)
{
this.name=name;
}
public int getId()
{
return id;
}
public String getName()
{
return name;	
}
public static void main(String[] args) {
		// TODO Auto-generated method stu
		Encaps obj=new Encaps();
		obj.setId(12);
		obj.setName("Yashwanth");
		System.out.println(obj.getId());
		System.out.println(obj.getName());
	}

}
