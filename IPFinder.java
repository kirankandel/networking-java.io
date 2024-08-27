import java.net.*;
import java.util.*;

public class IPFinder {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("\nEnter The Hostname");
		String host = input.next();

		try {
			InetAddress address = InetAddress.getByName(host);
			System.out.println("\n\nThe IP Address is :  " + address.toString());

		} catch (UnknownHostException uhEx) {
			System.out.println("Could not find " + host);
		} finally {
			input.close();
		}

	}
}
