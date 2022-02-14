import java.io.File;
import java.io.IOException;

public class Kotik {

    public static void main(String[] args) throws IOException {
        new Kot().meow();
        File file = new File("C:\\Users\\Данияр\\IdeaProjects");
        String[] dff = file.list();
            System.out.println(dff.length);
            int a=3;
            int b=2;
        System.out.println(Math.pow(a,b));
        System.out.println(Math.pow(b,a));
    }
}