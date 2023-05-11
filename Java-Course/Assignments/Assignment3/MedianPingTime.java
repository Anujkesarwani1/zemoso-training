package Assignment3;

import java.io.IOException;
import java.net.InetAddress;
import java.util.Scanner;

// Write a java function that will ping any host ( given as input ) and computes the median of the time taken to ping.
// Use the system ping utility, do not use any deprecated methods.

public class MedianPingTime {
    public static long getPingMedian(String host) throws IOException {
        InetAddress inetAddress = InetAddress.getByName(host);
        System.out.println("Sending Ping Request to " + host);
        long ping;
        long finishTime;
        long startTime = System.currentTimeMillis();

        if(inetAddress.isReachable(5000)) {
            finishTime = System.currentTimeMillis();
             ping = finishTime - startTime;
        }
        else {
            ping = 0;
        }
        return ping;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String host;
        System.out.print("Enter url/ip address to Ping : ");
        host = sc.nextLine();
        long ping = 0;
        try {
            ping = getPingMedian(host);
            System.out.println("Median ping time to " + host + ": " + ping);
        } catch (IOException e) {
            System.out.println("Sorry! We can't react to this host");
        }
    }
}

// Output:
// Enter url/ip address to Ping : www.google.com
// Sending Ping Request to www.google.com
// Median ping time to www.google.com: 22
