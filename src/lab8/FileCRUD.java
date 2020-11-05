package lab8;

import java.io.*;

public class FileCRUD {
    private final File file;
    public FileCRUD(String file) {
        this.file = new File(file);
    }

    public void write(String s, boolean append) {
        try(FileWriter writer = new FileWriter(file, append)) {
            writer.write(s);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String read() {
        StringBuilder res = new StringBuilder();

        try(FileReader reader = new FileReader(file)) {
            int c;
            while ((c = reader.read()) != -1) {
                res.append((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return res.toString();
    }
}
