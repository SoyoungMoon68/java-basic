package access;

public class SpeakerMain {
    private static void main(String[] args) {
        Speaker speaker = new Speaker(200);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
    speaker.showVolume();

    //필드에 직접 접근
        System.out.println("volume 필드 직접 접근 수정");
        speaker.volume = 200;
        speaker.showVolume();
    }
}
