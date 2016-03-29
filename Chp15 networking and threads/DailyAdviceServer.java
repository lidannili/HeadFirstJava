import java.io.*;
import java.net.*; //class Socket is in java.net

public class DailyAdviceServer
{
	String[] adviceList = {"Take smaller bites","Go for the tight jeans. No they do Not make you look fat.","One word: inappropriate","Just for Today, be honest.","You might want to rethink your haircut."};

	public void go()
	{
		try
		{
			ServerSocket serverSock = new ServerSocket(4242); //ServerSocket makes this server application 'listens' for client requests on port 4242 on the machine this code is running on
			
			// The server goes into a permanent loop, waiting for(and servicing) client requests
			while(true)
			{
				Socket sock = serverSock.accept();
				// the accept method blocks (just sits there) until a request comes in, and then the method returns a Socket(on some anonymous port) for communicating with the client

				PrintWriter writer = new PrintWriter(sock.getOutputStream());
				String advice = getAdvice();
				writer.close();
				System.out.println(advice);

			}
		}	
			catch(IOException ex)
			{
				ex.printStackTrace();
			}

	}




	private String getAdvice()
	{
		int random = (int)(Math.random() * adviceList.length);
		return adviceList[random];
	}

	public static void main(String[] args)
	{
		DailyAdviceServer server = new DailyAdviceServer();
		server.go();
	}

}


