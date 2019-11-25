package behavioral.strategy.textProcessor;

import com.sun.tools.javac.util.List;

public class Demo {
  public static void main(String[] args) {

    TextProcessor textProcessor = new TextProcessor(OutputFormat.HTML);
    textProcessor.createList(List.of("A", "B", "C"));

    System.out.println(textProcessor);

    textProcessor.clear();
    textProcessor.setOutputFormat(OutputFormat.MARKDOWN);
    textProcessor.createList(List.of("1", "2", "3"));

    System.out.println(textProcessor);

  }
}
