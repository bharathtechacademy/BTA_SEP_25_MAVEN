package keywords;

public enum Maths {

	ADD {
		public int operation(int a, int b) {
			return a + b;
		}
	},
	SUBTRACT {
		public int operation(int a, int b) {
			return a - b;
		}
	},
	MULTIPLY {
		public int operation(int a, int b) {
			return a * b;
		}
	},
	DIVIDE {
		public int operation(int a, int b) {
			return a / b;
		}
	};
	
	public abstract int operation(int a, int b);

}
