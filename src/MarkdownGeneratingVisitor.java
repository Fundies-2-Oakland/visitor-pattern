public class MarkdownGeneratingVisitor implements DocumentVisitor {
    StringBuilder sb = new StringBuilder();

    @Override
    public void visit(Header header) {
        // # Header 1
        // ## Header 2
        sb.append("#".repeat(header.level));
        sb.append(' ').append(header.text).append('\n');
    }

    @Override
    public void visit(Paragraph paragraph) {
        sb.append(paragraph.text).append('\n');
    }

    @Override
    public void visit(BulletList bulletList) {
        for (String item : bulletList.items) {
            sb.append("   * ").append(item).append('\n');
        }
    }

    @Override
    public String getOutput() {
        return sb.toString();
    }
}
