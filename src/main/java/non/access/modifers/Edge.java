package non.access.modifers;

public  class Edge implements Selenium {

	@Override
	public void click() {
		System.out.println("Clicking on Edge Browser");		
	}

	@Override
	public void sendKeys(String value) {
		System.out.println("Sending keys on Edge Browser: "+value);		
	}

	@Override
	public void getText() {
		System.out.println("Getting text from Edge Browser");		
	}

	@Override
	public void getTitle() {
		System.out.println("Getting title from Edge Browser");		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getAI() {
		System.out.println("Getting AI from Edge Browser");
//		Selenium.getAgent();
	}

	

}
