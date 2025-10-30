package non.access.modifers;

public class Chrome implements Selenium {

	@Override
	public void click() {
		System.out.println("Clicking on Chrome Browser");
		
	}

	@Override
	public void sendKeys(String value) {
		System.out.println("Sending keys on Chrome Browser: "+value);
		
	}

	@Override
	public void getText() {
		System.out.println("Getting text from Chrome Browser");
		
	}

	@Override
	public void getTitle() {
		System.out.println("Getting title from Chrome Browser");
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getAI() {
		System.out.println("Getting AI from Edge Browser");
		
	}

	

}
