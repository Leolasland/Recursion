import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GetAllFiles {

  public static List<File> getAllFiles(String path) {
    if (path == null || path.isEmpty()) {
      return Collections.emptyList();
    }
    File directory = new File(path);
    if (!directory.exists()) {
      return Collections.emptyList();
    }
    List<File> result = new ArrayList<>();
    List<File> listDirectory = new ArrayList<>();
    listDirectory.add(directory);
    return findAllFiles(result, directory, listDirectory);
  }

  private static List<File> findAllFiles(List<File> files, File directory, List<File> listDirectory) {
    if (!directory.isDirectory()) {
      files.add(directory);
    }
    File[] listFiles = directory.listFiles();
    if (listFiles != null) {
      for (File file : listFiles) {
        if (file.isFile()) {
          files.add(file);
        } else {
          listDirectory.add(file);
        }
      }
    }
    listDirectory.remove(directory);
    if (listDirectory.isEmpty()) {
      return files;
    }
    directory = listDirectory.get(0);
    return findAllFiles(files, directory, listDirectory);
  }

  public static void main(String[] args) {
    String path = "C:\\Users\\qwerty\\test\testt\\testt";
    List<File> allFiles = getAllFiles(path);
    for (File file : allFiles) {
      System.out.println(file.getName());
    }
  }
}
