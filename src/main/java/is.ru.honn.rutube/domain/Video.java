package is.ru.honn.rutube.domain;

import java.util.List;

/**
 * Created by krihf & Snojo on 30/09/16.
 */
public class Video {

    private int videoId;
    public String title;
    public String description;
    public String src;
    public String type;
    public List<String> tags;

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

    public void addTag(String tag){
        tags.add(tag);
    }
}
