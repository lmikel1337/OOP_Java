class Help implements Command {
    @Override
    public void execute() {
        System.out.println("Help instruction:\n" +
                "a: return the contents of the container;\n" +
                "b: add element to the end;\n" +
                "c: remove all elements;\n" +
                "d: delete the first instance of the specified element from the container;\n" +
                "e: compare;\n" +
                "f: return size of the container;\n"+
                "g: check if the element is in the container;\n" +
                "h: sort your elements;\n" +
                "j: use the class of another student;\n"+
                "x: exit program.");
    }
}

