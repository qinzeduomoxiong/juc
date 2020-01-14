package chapter1;

import static sun.misc.Version.println;

/**
 * @author rzq
 * @date 2019-12-30 22:02
 */
public class TryConcurrency {

    public static void main(String[] args) {
        /*for (int i = 0; i < 100; i++) {
            println("Task i=>" + i);
        }

        for (int j = 0; j < 100; j++) {
            println("Task j=>" + j);
        }*/

        try {
            Thread.sleep(3000*100L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        /*readDataFromDataBase();
        writeDataToFile();*/
    }

    private static void readDataFromDataBase() {
        try {
            println("Begin read data from db.");
            Thread.sleep(1000*10L);
            println("Read data done and start handle it.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        println("The data handle finish and successfully");
    }

    private static void writeDataToFile() {
        try {
            println("Begin write data to file.");
            Thread.sleep(2000*10L);
            println("Write data done and start handle it.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        println("The data handle finish and successfully");
    }

    private static void println(String message) {
        System.out.println(message);
    }
}
