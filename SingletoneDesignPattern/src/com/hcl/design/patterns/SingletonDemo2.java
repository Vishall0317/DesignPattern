
//program demonstrates Early instantiation of singleton instance

package com.hcl.design.patterns;

class ECart {
	int id;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ECart(int id) {
		super();
		this.id = id;
	}

	private static ECart cartObj=new ECart(); //early or eager instantiation

	private ECart() {

		System.out.println("ECart constructor invoked.");
	}

	public static ECart getECartObject(int i) {

		return cartObj;
	}
}

public class SingletonDemo2 {

	public static void main(String[] args) {

		ECart cart1 = ECart.getECartObject(2);
		System.out.println(cart1.getId());
		ECart cart2 = ECart.getECartObject(2);

		ECart cart3 = ECart.getECartObject(3);

		System.out.println(cart1.hashCode());
		System.out.println(cart2.hashCode());
		System.out.println(cart3.hashCode());	
		
	}

}
