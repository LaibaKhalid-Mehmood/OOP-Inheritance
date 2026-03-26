public class Media {
    private double size;
    private String format;

  Media(double size, String format) {
        this.size = size;
        this.format = format;
    }

    public void displayInfo(){
        System.out.println("Size: " + this.size + " MB");
        System.out.println("Format: " + this.format);
    }

    public double getSize() { 
     return size; 
}
    public String getFormat() { 
    return format; 
}
}