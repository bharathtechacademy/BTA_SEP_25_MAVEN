package non.access.modifers;

public interface Selenium {
	
	void click();
	
	void sendKeys(String value);
	
	void getText();
	
	void getTitle();
	
	void close();	
	
	default void getAI() {
		System.out.println("Getting AI from Selenium Interface");
		getMCP();
	}
	
	static void getAgent() {
		System.out.println("Getting Agent from Selenium Interface");
	}		
	
	private void getMCP() {
		System.out.println("Getting MCP from Selenium Interface");
	}	

}
