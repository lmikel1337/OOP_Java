public class Other implements Command{
    @Override
    public void execute() {
        System.out.println("Incorrect input. Command not find. \n Press '-h' or 'help' to call help menu.");
    }

}
