package is.ru.honn.rutube.service;

import is.ru.honn.rutube.domain.ServiceException;
import is.ru.honn.rutube.domain.User;
import is.ru.honn.rutube.domain.Video;
import java.util.*;

/**
 * Created by krihf on 30.9.2016.
 */
public class VideoServiceStub implements VideoService {

    private UserServiceStub _uService;

    public VideoServiceStub(UserServiceStub u)
    {
        _uService = u;
    }

    public int addVideo(Video video, int userId) throws ServiceException
    {
        User theUser = _uService.getUser(userId);
        if(theUser == null) {
            throw new ServiceException("User doesn't exist.");
        }

        int videoId = video.getVideoId();
        List<User> userlist = _uService.getUsers();
        if(userlist != null) {
            for (User u : userlist) {
                List<Video> videoList = u.getVideos();
                if (videoList != null) {
                    for (Video v : videoList) {
                        if (v.getVideoId() == videoId) {
                            throw new ServiceException("Video already exists.");
                        }
                    }
                }
            }
        }

        List<Video> userVideos = theUser.getVideos();
        if(userVideos == null) {
            userVideos = new ArrayList<>();
        }

        userVideos.add(video);
        theUser.setVideos(userVideos);
        return videoId;
    }

    public List<Video> getVideosByUser(int userId)
    {
        User u = _uService.getUser(userId);
        if(u == null) {
            return null;
        }
        return u.getVideos();
    }

    public Video getVideo(int videoId)
    {
        List<User> userList = _uService.getUsers();
        if(userList != null) {
            for(User u: userList) {
                List<Video> videoList = u.getVideos();
                if(videoList != null) {
                    for(Video v : videoList) {
                        if(v.getVideoId() == videoId) {
                            return v;
                        }
                    }
                }
            }
        }

        return null;
    }
}
