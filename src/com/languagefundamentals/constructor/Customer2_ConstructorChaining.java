package com.languagefundamentals.constructor;

public class Customer2_ConstructorChaining {

			int cid,age;
			String c_name;
			long phone;
			
			public Customer2_ConstructorChaining() {
				this(300,23);
				System.out.println("No arg constrctr");
			}
			public Customer2_ConstructorChaining(int cid, int age, String c_name, long phone) {
				System.out.println("4-parameterized constrctr");
				this.cid = cid;
				this.age = age;
				this.c_name = c_name;
				this.phone = phone;
			}
			public Customer2_ConstructorChaining(int cid, String c_name, long phone) {
				
				this();
				
				System.out.println("3-parametr constrctr");

			}
			
			//main method
			public static void main(String[] args) {
				Customer2_ConstructorChaining c3=new Customer2_ConstructorChaining(102, "Pariha", 989898989L);
				c3.show();
				
			}
			public Customer2_ConstructorChaining(int cid, int age) {
				this(200,20,"Fouziya",88888888L);
				System.out.println("2 parametr constrctr");
			}
			void show()
			{
				System.out.println("*****************************");
				System.out.println("Cid= "+cid);
				System.out.println("C age= "+age);
				System.out.println("C name= "+c_name);
				System.out.println("C phone= "+phone);
			}

		}
	

	