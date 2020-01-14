package allkindsoftest;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author rzq
 * @date 2019-12-31 10:26
 */
public class IOTest {

    public static void main(String[] args) throws IOException {
        String file = "F:\\芹泽\\test.txt";
        String charSet = "utf-8";

        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream,charSet);
        char[] buf = new char[64];
        int count = 0;
        StringBuffer stringBuffer = new StringBuffer();
        try {
            while ((count = inputStreamReader.read(buf)) != -1) {
                stringBuffer.append(buf, 0, count);
            }
            System.out.println(stringBuffer.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            inputStreamReader.close();
        }

    }
}
