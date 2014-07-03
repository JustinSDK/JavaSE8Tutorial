package cc.openhome;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.logging.*;

public class FileTextDAO implements TextDAO {
    @Override
    public String read(String file) {
        byte[] datas = null;
        try {
            datas = Files.readAllBytes(Paths.get(file));
        } catch (IOException ex) {
            Logger.getLogger(
                 FileTextDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new String(datas);
    }

    @Override
    public void save(String file, String text) {
        try(BufferedWriter writer = Files.newBufferedWriter(
                    Paths.get(file), 
                    Charset.forName(System.getProperty("file.encoding")))) {
            writer.write(text);
        } catch (IOException ex) {
            Logger.getLogger(
                FileTextDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void create(String file) {
        try {
            Files.createFile(Paths.get(file));
        } catch (IOException ex) {
            Logger.getLogger(
                FileTextDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
