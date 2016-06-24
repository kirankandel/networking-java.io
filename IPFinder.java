import java.net.*;
import java.util.*;
public class IPFinder {
		public static void main(String args[]){
			String host;
			Scanner input = new Scanner(System.in);
			InetAddress address;
			System.out.println("\nEnter The Hostname");
			host = input.next();
			
//As the class InetAddress throws UnknownHostExcepton, we try and catch the error 
			try{
				address = InetAddress.getByName(host);
				System.out.println("\n\nThe IP Address is :  " + address.toString());
			
			}
			
			catch(UnknownHostException uhEx){
				System.out.println("Could not find "+host);
			}
			
			
		}
}
