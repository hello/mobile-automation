package is.hello.sense.ios;

import is.hello.sense.android.AndroidTest;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class IOSMain {

    public static int port = 4000;
    public static String deviceName = "iPhone 5";
    public static String platformVersion = "8.0.2";
    public static String UDID = "4996d1cb11eef6b2ecdb26486e568da5b460c68b";
    public static String ipAddress = "localhost";

    public static void main(String[] args) {
        if (args.length != 5) {
            throw new Error("Invalid number of IOSMain Arguments");
        }
        ipAddress = args[0];
        port = Integer.valueOf(args[1]);
        deviceName = args[2];
        platformVersion = args[3];
        UDID = args[4];
        System.out.println(ipAddress+" "+port+" "+deviceName+" "+platformVersion+" "+UDID);

        Result result = JUnitCore.runClasses(IOSTest.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }

}
