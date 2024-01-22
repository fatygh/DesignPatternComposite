import com.sun.tools.javac.Main;
import fs.File;
import fs.Folder;

    public class Test {
    public static void main(String[] args) {
        Folder root=new Folder("Root");
        root.add(new File("Java.txt"));
        root.add(new File("pom.xml"));
        Folder src=(Folder) root.add(new Folder("src"));
        src.add(new File("data.csv"));
        src.add(new File("config.txt"));
        src.add(new File("config2.txt"));
        src.add(new File("data.bin"));
        root.afficher();

    }
}
