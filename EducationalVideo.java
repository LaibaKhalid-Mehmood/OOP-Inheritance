public class EducationalVideo extends Video {
    private String topic;
    private String teacherName;

 EducationalVideo(double size, String format, double duration, String resolution,String topic, String teacherName) {
        super(size, format, duration, resolution); 
        this.topic = topic;
        this.teacherName = teacherName;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Topic: " + this.topic);
        System.out.println("Teacher: " + this.teacherName);
    }

    public void calculateWatchTime() {
        double watchTime = getDuration() * 1.5; 
        System.out.println("Recommended watch time for '" + this.topic
                         + "': " + watchTime + " mins");
    }
}