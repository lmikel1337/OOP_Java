

class Menu implements Command {
    @Override
    public void execute() {
        System.out.println("Hello.\n" + "Press '-h' or 'help' to call help menu.");
        System.out.print("New command: ");
    }
}
