package behavioral.strategy.textProcessor;

import java.util.List;

public class TextProcessor {

  private ListStrategy listStrategy;
  private StringBuilder sb;

  public TextProcessor(OutputFormat format) {
    sb = new StringBuilder();
    setOutputFormat(format);
  }

  public void setOutputFormat(OutputFormat format) {
    switch (format) {
      case MARKDOWN:
        this.listStrategy = new MarkdownListStrategy();
        break;
      case HTML:
        this.listStrategy = new HtmlListStrategy();
        break;
    }
  }

  public void createList(List<String> items) {
    listStrategy.start(this.sb);
    for (String item : items) {
      listStrategy.addListItem(sb, item);
    }
    listStrategy.end(this.sb);
  }

  @Override
  public String toString() {
    return sb.toString();
  }

  public void clear() {
    this.sb.setLength(0);
  }
}
