package is.hello.sense.android;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class AndroidMain {

    public static int port = 3000;
    public static String ipAddress = "localhost";
    public static String deviceName = "Nexus 6P";
    public static String UDID = "5VT7N15A25001890";

    public static void main(String[] args) {
        if (args.length != 4) {
            throw new Error("Invalid number of Android Arguments");
        }
        ipAddress = args[0];
        port = Integer.valueOf(args[1]);
        deviceName = args[2];
        UDID = args[3];
        System.out.println(ipAddress + " " + port + " " + deviceName);

        Result result = JUnitCore.runClasses(AndroidTest.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }

}
