package koreait.day11;

import koreait.day10.Person;

public class ClassAbsTest {
 public static void main(String[] args) {
	Person momo = new Person();
	//ClassAbs abs = new ClassAbs();//abstract cant be new not yet specified
	ClassAbs abs = new ClassX();   //infer super 
	ClassX cls = new ClassX();   //infer child class
	System.out.println("test1 method");
	abs.test();
	cls.test();
	abs.name= "son";
	cls.name= "momo";
	abs.print();
	cls.print();
	System.out.println("2nd test : c field num");
	cls.setNum(23);
	cls.test();
	ClassX x = (ClassX)abs;
	x.setNum(100);
	abs.test();
		
}
}
