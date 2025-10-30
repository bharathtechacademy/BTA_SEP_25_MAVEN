package accesss.mod1;

 public class AccessMod1 {
	
	 public String name = "Bharath";
	
	 public void printEmpId() {
		System.out.println(1234);
	 }
	 
//	 public String getName() {
//		 return name;
//	 }
//	 
//	 public void setName(String newName) {
//		 name =newName;
//	 }

	public static void main(String[] args) {
		AccessMod1 obj = new AccessMod1();
		System.out.println(obj.name);
		obj.printEmpId();
	}

}
