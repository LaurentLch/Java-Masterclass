package Section9_InnerClasses_AbstractClasses_Interfaces.B_InnerClasses.Video;

public class Button {

    //FIELDS
    private String title;
    private OnClickListener onClickListener;

    public Button(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setOnClickListener (OnClickListener onClickListener){
        this.onClickListener = onClickListener;
    }

    public void onClick(){
        this.onClickListener.onClick(this.title);
    }

    public interface OnClickListener{
        public void onClick(String title);
    }
}
