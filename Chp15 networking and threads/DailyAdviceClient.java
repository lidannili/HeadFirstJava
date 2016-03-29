import java.io.*;
import java.net.*; //class Socket is in java.net

public class DailyAdviceClient
{
	public void go()
	{
		try
		{
			Socket s = new Socket("127.0.0.1", 4242); //localhost

			InputStreamReader streamReader = new InputStreamReader(s.getInputStream());
			BufferedReader reader = new BufferedReader(streamReader); // chain a BufferedReader to an InputStreamReader to the input stream from the Socket

			String advice = reader.readLine();
			System.out.println("Today you shoud: " + advice);
			reader.close();

		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
	}

	public static void main(String[] args)
	{
		DailyAdviceClient client = new DailyAdviceClient();
		client.go();
	}
	
}