public class StatePatternExample {
    public static void main(String[] args) {
        DocumentContext context = new DocumentContext();

        context.setState(new NewState());
        context.applyState();

        context.setState(new RejectedState());
        context.applyState();

        context.setState(new ApprovedState());
        context.applyState();
    }
}
