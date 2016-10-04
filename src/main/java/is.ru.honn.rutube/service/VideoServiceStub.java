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
    private List<Video> videos;

    public VideoServiceStub(UserServiceStub u)
    {
        _uService = u;
        videos = new ArrayList<>();
    }

    public int addVideo(Video video, int userId) throws ServiceException
    {
        User u = _uService.getUser(userId);
        if(u == null) {
            throw new ServiceException("User doesn't exist.");
        }

        int videoId = video.getVideoId();
        if(videos != null) {
            for (Video v : videos) {
                if(v.getVideoId() == videoId) {
                    throw new ServiceException("Video already exists.");
                }
            }
        }

        List<Video> userVideos = u.getVideos();
        if(userVideos == null) {
            userVideos = new ArrayList<>();
        }

        userVideos.add(video);
        videos.add(video);
        u.setVideos(userVideos);
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
        if(videos != null) {
            for(Video v : videos) {
                if(v.getVideoId() == videoId) {
                    return v;
                }
            }
        }

        return null;
    }
}
