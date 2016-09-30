package is.ru.honn.rutube.service;

import is.ru.honn.rutube.domain.ServiceException;
import is.ru.honn.rutube.domain.Video;

import java.util.List;

/**
 * Created by krihf on 30.9.2016.
 */
public class VideoServiceStub implements VideoService {

    public int addVideo(Video video, int userId) throws ServiceException
    {
        return 0;
    }

    public List<Video> getVideosbyUser(int userId)
    {
        return null;
    }

    public Video getVideo(int videoId)
    {
        return null;
    }
}
