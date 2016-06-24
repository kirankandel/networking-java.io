
import java.net.*;
public class localHost {
	public static void main(String args[]){
	try{
		InetAddress address = InetAddress.getLocalHost();
		System.out.println("\nlocal address is "+ address );
	}
	
	catch(UnknownHostException uhEx){
		System.out.println("Couldn't find local address!");
	}
		
	}
	

}
