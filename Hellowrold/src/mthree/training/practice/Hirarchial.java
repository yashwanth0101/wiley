package mthree.training.practice;

class Realme{
	void camera()
	{
		System.out.println("108MP");
	}
}
class Realmee8 extends Realme{
	void Internalstorage()
	{
		System.out.println("64GB");
	}
}
class Realmee8Pro extends Realme{
	void Internalstorage()
	{
		System.out.println("128GB");
	}
}

public class Hirarchial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Realmee8 obj = new Realmee8();
        System.out.println("The specifications of Realme8");
        obj.camera();
        obj.Internalstorage();
        Realmee8Pro obj1 = new Realmee8Pro();
        System.out.println("The specifications of Realme8Pro");
        obj1.camera();
        obj1.Internalstorage();
	}

}
