package mthree.training.practice;

class Realme7{
 void RAM()
 {
	 System.out.println("8GB");
 }
}
class Realme8 extends Realme7{
	 void camera()
	 {
		 System.out.println("108Px");
	 }
	}
class Realme8Pro extends Realme8{
	 void InternalStorage()
	 {
		 System.out.println("128GB");
	 }
	}

public class Multilevel {
public static void main(String args[])
{
Realme8Pro obj = new Realme8Pro();
obj.camera();
obj.RAM();
obj.InternalStorage();
}
}
