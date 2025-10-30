package non.access.modifers;

public class InternetExplorer implements Selenium {

	@Override
	public void click() {
		System.out.println("Clicking on Internet Explorer Browser");
		
	}

	@Override
	public void sendKeys(String value) {
		System.out.println("Sending keys on Internet Explorer Browser: "+value);
		
	}

	@Override
	public void getText() {
		System.out.println("Getting text from Internet Explorer Browser");
		
	}

	@Override
	public void getTitle() {
		System.out.println("Getting title from Internet Explorer Browser");
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	

}
