package is.ru.honn.rutube.service;

/**
 * Created by Snojo on 30/09/16.
 */
public interface VideoService
{
    Video getVideo(int videoId);
    List<Video> getVideosbyUser(int userId);
    int addVideo(Video video, int userId) throws ServiceException;
}
