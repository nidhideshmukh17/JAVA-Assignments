class Document {
    private String title;
    private String content;

    public Document(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Document{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}

interface DocumentBuilder {
    DocumentBuilder setTitle(String title);
    DocumentBuilder addContent(String content);
    Document build();
}

class TextDocumentBuilder implements DocumentBuilder {
    private String title;
    private StringBuilder content = new StringBuilder();

    @Override
    public DocumentBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    @Override
    public DocumentBuilder addContent(String content) {
        this.content.append(content).append("\n");
        return this;
    }

    @Override
    public Document build() {
        return new Document(title, content.toString());
    }
}

class DocumentDirector {
    public Document createReport(DocumentBuilder builder) {
        return builder
                .setTitle("Design Patterns")
                .addContent("Two Design Patterns : ")
                .addContent("Pattern 1: Factory")
                .addContent("Pattern 2: Observer")
                .build();
    }
}

public class BuilderDesignPattern {
    public static void main(String[] args) {
        DocumentBuilder textDocumentBuilder = new TextDocumentBuilder();
        Document report = textDocumentBuilder.build();

        DocumentDirector director = new DocumentDirector();
        Document report2 = director.createReport(new TextDocumentBuilder());

        System.out.println(report);
        System.out.println(report2);
    }
}