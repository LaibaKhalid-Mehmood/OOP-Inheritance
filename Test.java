
public class Test {
    public static void main(String[] args) {

 
        Media media = new Media( 150.5, "MP4");
        media.displayInfo();

        System.out.println();

        Video video = new Video(200.0, "MP4", 45.0, "1080p");
        video.displayInfo();
        video.play();
        video.pause();

        System.out.println();

      EducationalVideo eduVideo = new EducationalVideo( 350.0, "MP4",60.0, "720p","Object Oriented Programming", "Dr. Ahmed");
        eduVideo.displayInfo();
        eduVideo.play();
        eduVideo.pause();
        eduVideo.calculateWatchTime();
    }
}