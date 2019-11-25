package behavioral.strategy.fileCompression;

import java.io.File;
import java.util.List;

public class CompressionContext {

  private CompressionStrategy compressionStrategy;

  public void createArchive(List<File> files) {
    this.compressionStrategy.compressFiles(files);
  }

  public void setCompressionStrategy(CompressionStrategy compressionStrategy) {
    this.compressionStrategy = compressionStrategy;
  }
}
