package com.bridgelabz.FileIO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

public class FileUtils extends Java8WatchService {

    public FileUtils(Path dir) throws IOException {
        super(dir);
    }

    public static boolean deleteFiles(File contentsToDelete) {
        File[] allContents = contentsToDelete.listFiles();
        if (allContents != null) {
            for (File file : allContents) {
                deleteFiles(file);
            }
        }
        return contentsToDelete.delete();
    }
}