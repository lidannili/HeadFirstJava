import java.io.*; //serializable is in the java.io package

public class Box implements Serializable{
	private int width; 
	private int height; //these two values will be saved

	public void setWidth(int w){
		width = w;
	}

	public void setHeight(int h){
		height = h;
	}

	public static void main (String[] args){
		Box myBox = new Box();
		myBox.setWidth(50);
		myBox.setHeight(20);
	
		try{
			FileOutputStream fs = new FileOutputStream("foo.ser"); //Connect to a file named"foo.ser" if it exits. If not, create one.
			ObjectOutputStream os = new ObjectOutputStream(fs); //Make a ObjectOutputStream chained to the connection stream.
			os.writeObject(myBox);
			os.close(); 
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	} 
}