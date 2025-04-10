import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<DocumentPart> elements = List.of(
                new Header(1, "Ellen's Favorite Quotations"),
                new Paragraph("Ellen often repeats these sayings to her students:"),
                new BulletList(List.of(
                        "There are only two hard things in computer science: " +
                                "cache invalidation, naming, and off-by-one errors. --Jeff Atwood",
                        "Program testing can be used to show the presence of bugs, but never to show their absence! " +
                                "-- Edsger Dijkstra",
                        "I'm not a great programmer. I'm just a good programmer with great habits. --Kent Beck"
                )));
        generateText(new HtmlGeneratingVisitor(), elements);
        generateText(new MarkdownGeneratingVisitor(), elements);
        generateText(new CharacterCountingGenerator(), elements);
    }

    private static void generateText(DocumentVisitor visitor, List<DocumentPart> elements) {
        for (DocumentPart part : elements) {
            part.accept(visitor);
        }
        System.out.println(visitor.getOutput());
    }
}
