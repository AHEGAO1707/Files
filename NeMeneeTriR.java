import java.io.IOException;
import java.io.FileInputStream;
/*Программа, вычисляющая число слов в произвольном файле, каждое из которых содержит не менее трех символов 'r'.*/
public class NeMeneeTriR {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("C:\\Users\\Егор\\Desktop\\Java.txt");
        byte[] str = new byte[file.available()];
        file.read(str);
        String text = new String(str);
        int n = 0;
        int R = 0;
        int probel = 0;
        for (int i = 0; i < text.length(); i++) {
            if ((text.charAt(i) == 'r') && (text.charAt(i) != ' ')) {
                R++;
            }
            if (text.charAt(i) == ' ') {
                if (R >= 3) {
                    n++;
                    R = 0;
                }
                else {
                    R = 0;
                }
            }
            if (text.charAt(i) == ' ') {
                probel++;
            }
        }
        if (R >= 3) {
            n++;
        }
        if ((n == 0) && (probel == 0) && (R >= 3)) {
            System.out.println("В файле введено одно слово. Оно СОДЕРЖИТ не менее трёх символов 'r'.");
        }
        if ((n == 0) && (probel == 0) && (R < 3)) {
            System.out.println("В файле введено одно слово. Оно НЕ СОДЕРЖИТ не менее трёх символов 'r'.");
        }
        if ((n == 0) && (probel != 0)) {
            System.out.println("В файле нет слов, содержащих не менее трёх символов 'r'.");
        }
        if (n != 0) {
            System.out.println("Количество слов в файле, содержащих не менее трёх символов 'r' равно => " + n);
        }
    }
}
