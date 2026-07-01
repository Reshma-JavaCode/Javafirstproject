package com.languagefundamentals.constructor;

class Test {
    String hero;

    Test(String hero) {
        this.hero = hero;
    }

    Test(Test m) {      // copy constructor
       hero = m.hero;
    }
}
public class Movie2 {

	//difference between copy constructor and copying reference
	//That constructor's purpose is to make a new object 
	//with copied values rather than sharing the same object reference.
	
	public static void main(String[] args) {
		
		Test m1 = new Test("Mahesh");
        Test m2 = new Test(m1); //copy constructor
        
        System.out.println(m1.hero);
        System.out.println(m2.hero); //mahesh

        m2.hero = "Prabhas"; //not gng to affect other object 

        System.out.println(m1.hero); //Mahesh
        System.out.println(m2.hero); //Prabhas

        
        Test t=m1;  //Changes affect both variables
        System.out.println("after copy refernce t= "+t.hero);
        
        t.hero="Vijay deverakonda";        
        System.out.println("after reinitializing for copy refernce t= "+t.hero);
        System.out.println("after reinitializing for copy refernce m1= "+m1.hero);
	}

}
