package sml.proxyPattern;

public class RealImage implements Image{
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFormDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFormDisk(String fileName) {
        System.out.println("Loading " + fileName);
    }
}
