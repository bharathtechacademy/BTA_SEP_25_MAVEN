package accesss.mod2;

import accesss.mod1.AccessMod1;

public class AccessMod3 extends AccessMod1{

	public static void main(String[] args) {
		AccessMod3 obj = new AccessMod3();
		System.out.println(obj.name);
		obj.printEmpId();
//		System.out.println(obj.getName());
//		obj.setName("Bharath Reddy");
	}

}
