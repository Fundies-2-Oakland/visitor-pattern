public interface DocumentVisitor {
    void visit(Header header);

    void visit(Paragraph paragraph);

    void visit(BulletList bulletList);

    String getOutput();
}
