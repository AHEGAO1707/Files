import java.io.IOException;
import java.io.FileInputStream;
/*Программа, которая вычисляет количество символов 'r' в произвольном файле.*/
public class KolichestvoR {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("C:\\Users\\Егор\\Desktop\\Java.txt");
        byte[] str = new byte[file.available()];
        file.read(str);
        String text = new String(str);
        int n = 0;
        for(int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == 'r') {
                n++;
            }
        }
        if (n == 0) {
            System.out.println("В файле нет ни одного символа 'r'.");
        }
        else {
            System.out.println("Количество символов 'r' в файле равно => " + n);
        }
    }
}