package devops.numbers;

import org.junit.*;

import devops.numbers.NumberWords;

public class NumberWordsTests {
	private NumberWords numberWords ;

	@Before
	public void setup() {
		numberWords = new NumberWords() ;
	}

	@Test
	public void numberOutOfRangeReturnsError() {
		Assert.assertEquals( "Error on less than Zero", "Number out of range", numberWords.toWords( -1 ) ) ;
	}
	
	@Test
	public void numberZeroReturnsError() {
		Assert.assertEquals( "Error on Zero", "Number out of range", numberWords.toWords( -1 ) ) ;
	}
	
	@Test
	public void numberGreaterThanNineHundredNinetyNineReturnsError() {
		Assert.assertEquals( "Error on more than 999", "Number out of range", numberWords.toWords( 1000 ) ) ;
	}
	
	@Test
	public void numberOneReturnsOne() {
		Assert.assertEquals( "One", "one", numberWords.toWords( 1 ) ) ;
	}
	
	@Test
	public void numberTwoReturnsTwo() {
		Assert.assertEquals( "Two", "two", numberWords.toWords( 2 ) ) ;
	}
	
	@Test
	public void numberTenReturnsTen() {
		Assert.assertEquals( "Ten", "ten", numberWords.toWords( 10 ) ) ;
	}
	
	@Test
	public void numberFifteenReturnsFifteen() {
		Assert.assertEquals( "Fifteen", "fifteen", numberWords.toWords( 15 ) ) ;
	}
	
	@Test
	public void numberTwentyReturnsTwenty() {
		Assert.assertEquals( "Twenty", "twenty", numberWords.toWords( 20 ) ) ;
	}
	
	@Test
	public void numberNinetyNineReturnsNinetyNine() {
		Assert.assertEquals( "Ninety Nine", "ninety nine", numberWords.toWords( 99 ) ) ;
	}
	
	@Test
	public void numberNineHundredNinetyNineReturnsNineHundredNinetyNine() {
		Assert.assertEquals( "Nine Hundred Ninety Nine", "nine hundred ninety nine", numberWords.toWords( 999 ) ) ;
	}
}
