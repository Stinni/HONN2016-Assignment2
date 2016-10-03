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
        videos = new ArrayList<Video>();
    }

    public int addVideo(Video video, int userId) throws ServiceException
    {
        User u = _uService.getUser(userId);
        if(u == null) {
            throw new ServiceException("User doesn't exist.");
        }

        int videoId = video.getVideoId();
        for (Video v : videos) {
            if(v.getVideoId() == videoId) {
                throw new ServiceException("Video already exists.");
            }
        }

        u.videos.add(video);
        videos.add(video);
        return video.getVideoId();
    }

    public List<Video> getVideosbyUser(int userId)
    {
        return _uService.getUser(userId).videos;
    }

    public Video getVideo(int videoId)
    {
        for(Video v : videos) {
            if(v.getVideoId() == videoId) {
                return v;
            }
        }
        return null;
    }
}
