// Encapsulating the Good Dog class
class GoodDog {
	// make the instance variable private.
	private int size;

	// make the getter and setter methods public
	public int getSize() {
		return size;
	}
	public void setSize(int s){
		size = s;
	}

	void bark() {
		if(size>60) {
			System.out.println("Woof!Woof!.");
		} else if (size>14){
			System.out.println("Ruff! Ruff!");
		} else {
			System.out.println("Yip! Yip!");
		}
	}

}

class GoodDogTestDrive {
	public static void main (String[] args){
		GoodDog one = new GoodDog();
		one.setSize(70);
		GoodDog two = new GoodDog();
		two.setSize(8);
		System.out.println("Dog One: " + one.getSize());
		System.out.println("Dog Two: " + two.getSize());
		one.bark();
		two.bark();
	}
}