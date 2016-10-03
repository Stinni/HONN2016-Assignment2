package is.ru.honn.rutube.domain;

import java.util.*;
import java.util.Date;

/**
 * Created by Snojo on 30/09/16.
 */
public class User {
    public int userId;
    public String firstName;
    public String lastName;
    public String email;
    public String displayName;
    public String birthDate;
    public List<Video> videos;

    public User(){}

    public User(int userId, String firstName, String lastName, String email, String displayName, String birthDate) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.displayName = displayName;
        this.birthDate = birthDate;
    }

    public void setVideos(List<Video> videos){
        this.videos = videos;
    }
}
