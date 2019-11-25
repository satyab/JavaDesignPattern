package behavioral.strategy.fileCompression;

import java.io.File;

import com.sun.tools.javac.util.List;

public class Demo {
  public static void main(String[] args) {
    CompressionContext context = new CompressionContext();

    context.setCompressionStrategy(new ZipCompressionStrategy());
    context.createArchive(List.of(new File("a.txt"), new File("b.txt")));

    context.setCompressionStrategy(new RarCompressionStrategy());
    context.createArchive(List.of(new File("a.txt"), new File("b.txt")));

  }
}
