public class CharacterCountingGenerator implements DocumentVisitor {
    int numCharacters = 0;

    @Override
    public void visit(Header header) {
        numCharacters += header.text.length();
    }

    @Override
    public void visit(Paragraph paragraph) {
        numCharacters += paragraph.text.length();
    }

    @Override
    public void visit(BulletList bulletList) {
        for (String item : bulletList.items) {
            numCharacters += item.length();
        }
    }

    @Override
    public String getOutput() {
        return "Number of characters: " + numCharacters;
    }
}
