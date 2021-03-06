package williamguan.com.library.entity;

/**
 * williamguan.com.library.entity
 * Email: william.guanluck@gmail.com
 * Created by Willi on 5/11/2016.
 */
public class MenuItemEntity {

    private String text;

    private Object tag;

    private boolean showMask;

    public boolean isShowMask() {
        return showMask;
    }

    public void setShowMask(boolean showMask) {
        this.showMask = showMask;
    }

    public Object getTag() {
        return tag;
    }

    public void setTag(Object tag) {
        this.tag = tag;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
