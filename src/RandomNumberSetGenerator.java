import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class RandomNumberSetGenerator {
    public static void main(String[] args) throws IOException {
        //путь к папке создания csv с наборами данных
        String path = "C://Users//Admin//Desktop//";

        //размерность каждого из набора данных
        ArrayList<Integer> amount = new ArrayList<>();
        amount.add(100);
        amount.add(500);
        amount.add(1000);
        amount.add(5000);
        amount.add(10000);
        amount.add(25000);
        amount.add(50000);
        amount.add(100000);
        amount.add(250000);
        amount.add(500000);
        amount.add(750000);
        amount.add(1000000);

        write(path, amount);
    }

    static void write(String path,  ArrayList<Integer> amount) throws IOException {
        Random random = new Random();
        for(int j = 0; j < amount.size(); j++) {
            File file = new File(path+amount.get(j)+".csv");
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            for (int i = 0; i < amount.get(j); i++) {
                bw.write(random.nextInt(500) + ",");
            }
            bw.close();
        }
    }
}
