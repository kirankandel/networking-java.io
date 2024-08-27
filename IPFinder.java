import java.net.*;
import java.util.*;
import java.util.regex.*;

public class IPFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userInput;

        System.out.println("Enter the hostname or IP address:");
        userInput = input.nextLine().trim();

        if (isValidIPAddress(userInput)) {
            performReverseDNSLookup(userInput);
        } else {
            resolveHostname(userInput);
        }

        input.close();
    }

    public static boolean isValidIPAddress(String ip) {
        String ipPattern = 
                "^(([0-9]{1,3})\\.){3}([0-9]{1,3})$"; 
        Pattern pattern = Pattern.compile(ipPattern);
        Matcher matcher = pattern.matcher(ip);
        return matcher.matches();
    }

    public static void resolveHostname(String host) {
        try {
            InetAddress[] addresses = InetAddress.getAllByName(host);
            System.out.println("\nThe IP address(es) for " + host + " are:");
            for (InetAddress address : addresses) {
                System.out.println(" - " + address.getHostAddress());
            }
        } catch (UnknownHostException uhEx) {
            System.out.println("Could not find the IP address for the hostname: " + host);
        }
    }

    public static void performReverseDNSLookup(String ip) {
        try {
            InetAddress address = InetAddress.getByName(ip);
            String hostname = address.getHostName();
            System.out.println("\nThe hostname for IP address " + ip + " is: " + hostname);
        } catch (UnknownHostException uhEx) {
            System.out.println("Could not find the hostname for the IP address: " + ip);
        }
    }
}