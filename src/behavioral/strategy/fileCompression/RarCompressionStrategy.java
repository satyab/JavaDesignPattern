package behavioral.strategy.fileCompression;

import java.io.File;
import java.util.List;

public class RarCompressionStrategy implements CompressionStrategy {

  @Override
  public void compressFiles(List<File> files) {
    System.out.println("Using RAR compression");
  }
}
