import java.lang.management.ManagementFactory;
import com.sun.management.OperatingSystemMXBean;

public class SystemInfo {
    public static void main(String[] args) {

        System.out.println("=== System Information Tool ===");

        System.out.println("OS: " + System.getProperty("os.name"));
        System.out.println("OS Version: " + System.getProperty("os.version"));
        System.out.println("User: " + System.getProperty("user.name"));
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("Architecture: " + System.getProperty("os.arch"));

        OperatingSystemMXBean osBean =
                (OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();

        long totalRAM = osBean.getTotalPhysicalMemorySize();
        long freeRAM = osBean.getFreePhysicalMemorySize();

        System.out.println("Total RAM: " + (totalRAM / 1024 / 1024) + " MB");
        System.out.println("Free RAM: " + (freeRAM / 1024 / 1024) + " MB");
    }
}