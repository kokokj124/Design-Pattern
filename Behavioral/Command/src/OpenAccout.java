public class OpenAccout implements Command{
    private Account account;
    public OpenAccout(Account account){
        this.account = account;
    }
    @Override
    public void execute() {
        account.open();
    }
}
