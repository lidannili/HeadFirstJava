public class PhraseOMatic{
	public static void main(String[] args) {
	String[] wordListOne = {"24/7","multi-Tier","30,000 foot","B-to-B","win-win"};
	String[] wordListTwo = {"a","m","foot","B","win"};
	int oneLength = wordListOne.length;
	int twoLength = wordListTwo.length;
	int rand1 = (int)(Math.random()*oneLength);
	int rand2 = (int)(Math.random()*twoLength);
	String phrase = wordListOne[rand1] + ' ' + wordListTwo[rand2];
	System.out.println("what we need is a " + phrase);
	}
}