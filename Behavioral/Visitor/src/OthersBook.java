public class OthersBook implements ProgramingBook{
    @Override
    public String getResource() {
        return "Undefined";
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
