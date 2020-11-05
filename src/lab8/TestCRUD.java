package lab8;

import java.io.File;

public class TestCRUD {
    public static void main(String[] args) {
        FileCRUD fileCRUD = new FileCRUD("C:\\Users\\user\\IdeaProjects\\data.txt");
        fileCRUD.write("dfgsdgsdfgd2", true);
        System.out.println(fileCRUD.read());
    }
}
