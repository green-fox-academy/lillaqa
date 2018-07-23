package ControlFlow;

public class ConditionalVariableMutation {

	public static void main(String[] args) {

		double a = 24;
		int out = 0;
		if (a % 2 == 0) {
			out = out + 1;
		}

		System.out.println(out);


		int b = 13;
		String out2 = "";


		if (10 <= b && b <= 20) {
			out2 = "Sweet";
		} else if (b < 10) {
			out2 = "Less!";
		} else if (b > 20) {
			out2 = "More!";
		}


		System.out.println(out2);


		int c = 123;
		int credits = 100;
		boolean isBonus = false;


		boolean creditsCheck;
		if ((credits > 50)) creditsCheck = true;
		else creditsCheck = false;

		if ((creditsCheck = true) && (isBonus = false)) {
			c -= 2;
		} else if ((creditsCheck = false) && (isBonus = false)) {
			c -= 1;
		} else if (isBonus = true) {
			c--;
		}

		System.out.println(c);


		int d = 8;
		int time = 120;
		String out3 = "";


		if (d % 4 == 0 && time < 200) {
			out3 = "check";
		} else if (time > 200) {
			out3 = "Time out";
		} else {

			out3 = "Run, Forest run!";
		}

		System.out.println(out3);

	}

}
