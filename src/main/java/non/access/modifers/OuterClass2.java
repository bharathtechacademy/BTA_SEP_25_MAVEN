package non.access.modifers;

public class OuterClass2 {

	public static void main(String[] args) {
		
		//Call normal inner class data
		OuterClass.InnerClass outer = new OuterClass().new InnerClass();
		System.out.println(outer.value);
		
		//Call normal inner class data
		OuterClass.StaticInnerClass staticClass =new OuterClass.StaticInnerClass();
		System.out.println(staticClass.value);

	}

}
