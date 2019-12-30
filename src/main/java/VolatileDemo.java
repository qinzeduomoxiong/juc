import java.util.concurrent.TimeUnit;

/**
 * @author rzq
 * @date 2019-12-30 17:21
 */
public class VolatileDemo {
    /*volatile */boolean running = true;
    void m() {
        System.out.println("m start");
        while (running) {

        }
        System.out.println("m end");
    }

    public static void main(String[] args) {
        VolatileDemo volatileDemo = new VolatileDemo();
        new Thread(volatileDemo::m, "t1").start();
        try {
            TimeUnit.SECONDS.sleep(1);
            System.out.println("main start");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        volatileDemo.running = false;
    }
}
