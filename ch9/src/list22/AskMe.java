package list22;

public class AskMe implements SharedConstants {
	static void answer(int result) {
		switch(result) {
		case NO:
			System.out.println("No");
			break;
		case YES:
			System.out.println("YES");
			break;
		case MAYBE:
			System.out.println("May Be");
			break;
		case SOON:
			System.out.println("Soon");
			break;
		case LATER:
			System.out.println("Later");
			break;
		case NEVER:
			System.out.println("Never");
			break;
			
		}
	}
	
	public static void main(String[] args) {
		Question q = new Question();
		answer(q.ask());
		answer(q.ask());
		answer(q.ask());
		answer(q.ask());
	}
}
