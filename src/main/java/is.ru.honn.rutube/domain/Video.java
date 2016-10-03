package is.ru.honn.rutube.domain;

import java.util.List;

/**
 * Created by krihf & Snojo on 30/09/16.
 */
public class Video {

    protected int videoId;
    protected String title;
    protected String description;
    protected String src;
    protected String type;
    protected List<String> tags = null;

    public Video() {}

    public Video(int videoId, String title, String description, String src, String type, List<String> tags) {
        this.videoId = videoId;
        this.title = title;
        this.description = description;
        this.src = src;
        this.type = type;
        this.tags = tags;
    }

    public int getVideoId() {
        return videoId;
    }

    public void setVideoId(int videoId) {
        this.videoId = videoId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public void addTag(String tag){
        tags.add(tag);
    }
}
