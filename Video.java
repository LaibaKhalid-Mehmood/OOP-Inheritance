public class Video extends Media {
    private double duration;
    private String resolution;

   Video(double size, String format, double duration, String resolution) {
        super(size, format);
        this.duration = duration;
        this.resolution = resolution;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Duration: " + this.duration + " mins");
        System.out.println("Resolution: " + this.resolution);
    }

    public void play() {
        System.out.println("Playing video..");
    }

    public void pause() {
        System.out.println("Video paused.");
    }

    public double getDuration() { return duration; }
    public String getResolution() { return resolution; }
}