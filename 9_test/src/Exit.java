class Exit implements Command{
    @Override
    public void execute() {
        System.out.println("The program successfully closed");
    }
}
