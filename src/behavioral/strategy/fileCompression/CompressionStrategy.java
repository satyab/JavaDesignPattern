package behavioral.strategy.fileCompression;

import java.io.File;
import java.util.List;

public interface CompressionStrategy {

  public void compressFiles(List<File> files);
}
