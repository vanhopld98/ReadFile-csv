import java.io.*;
import java.util.Scanner;

public class ReadFilecsv {

    public static void copyFile(String path) throws IOException {
        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line = null;

        while ((line = bufferedReader.readLine()) != null) {
            String Arrline[] = line.split(",");
            System.out.println(Arrline[2]);
        }
        bufferedReader.close();
        fileReader.close();
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập đường dẫn file");
        String filePath = sc.nextLine();
        copyFile(filePath);
    }
}