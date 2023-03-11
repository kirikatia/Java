package toys;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ToyWriter {
    public static void writePrizesToFile(ArrayList<Toy> prizes) {
        try {
            FileWriter writer = new FileWriter("prizes.txt");
            for (Toy toy : prizes) {
                writer.write(toy.getName() + "\n");
            }
            writer.flush();
            writer.close();
        }
        catch (IOException e) {
            System.out.println("Ошибка записи в файл");
            e.printStackTrace();
        }
    }
}
