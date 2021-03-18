package Section8_Arrays_JavaInBuiltLists_AutoBoxing_Unboxing.D_LinkedLists.Exercises;

public class Song {

    // member vars
    private String title;
    private double duration;

    // constructors
    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    // getters

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return this.title + ": " + this.duration;
    }
}