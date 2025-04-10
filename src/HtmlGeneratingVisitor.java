public class HtmlGeneratingVisitor implements DocumentVisitor {
    StringBuilder sb = new StringBuilder();

    @Override
    public void visit(Header header) {
        // Example: <h1>Title</h1>
        sb.append("<h");
        sb.append(header.level);
        sb.append(">");
        sb.append(header.text);
        sb.append("</h");
        sb.append(header.level);
        sb.append(">\n");
    }

    @Override
    public void visit(Paragraph paragraph) {
        // <p>text</p>
        sb.append("<p>")
                .append(paragraph.text)
                .append("</p>\n");
    }

    @Override
    public void visit(BulletList bulletList) {
        sb.append("<ul>\n");
        for (String item : bulletList.items) {
            sb.append("<li>").append(item).append("</li>\n");
        }
        sb.append("</ul>\n");
    }

    @Override
    public String getOutput() {
        return sb.toString();
    }
}
