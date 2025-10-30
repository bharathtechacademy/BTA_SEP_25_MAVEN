package non.access.modifers;

@FunctionalInterface
public interface FunctionalInterfaceExample {

	void click();

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
