package devops.numbers;

public class NumberWords {
	private static final String[] numberNames = {
			"",
			"one",
			"two",
			"three",
			"four",
			"five",
			"six",
			"seven",
			"eight",
			"nine",
			"ten",
			"eleven",
			"twelve",
			"thirteen",
			"fourteen",
			"fifteen",
			"sixteen",
			"seventeen",
			"eighteen",
			"nineteen"
	};
	
	private static final String[] tenseNames = {
			"",
			"",
			"twenty",
			"thirty",
			"forty",
			"fifty",
			"sixty",
			"seventy",
			"eighty",
			"ninety"
	};

	public String toWords( int number ) {
		String result = "" ;
		
		if(number <= 0){
			result = "Number out of range";
		} else if(number < 20){
			result = numberNames[number];
		} else if(number < 100){
			result = tenseNames[number / 10] + ((number % 10 != 0) ? " " : "") + numberNames[number % 10];
		} else if(number < 1000) {
			result = numberNames[number / 100] + " hundred" + ((number % 10 != 0) ? " " : "") + toWords(number % 100);
		} else {
			result = "Number out of range";
		}
		
		return result.trim() ;

	}

}
