package is.ru.honn.rutube.service;

import is.ru.honn.rutube.domain.ServiceException;
import is.ru.honn.rutube.domain.Video;

import java.util.List;

/**
 * Created by Snojo on 30/09/16.
 */
public interface VideoService
{
    Video getVideo(int videoId);
    List<Video> getVideosbyUser(int userId);
    int addVideo(Video video, int userId) throws ServiceException;
}
