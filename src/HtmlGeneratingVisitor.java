public class HtmlGeneratingVisitor implements DocumentVisitor {
    @Override
    public void visit(Header header) {
        // Example: <h1>Title</h1>
    }

    @Override
    public void visit(Paragraph paragraph) {

    }

    @Override
    public void visit(BulletList bulletList) {

    }

    @Override
    public String getOutput() {
        return null;
    }
}
