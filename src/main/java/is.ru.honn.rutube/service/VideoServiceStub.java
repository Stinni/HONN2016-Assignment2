package is.ru.honn.rutube.service;

import is.ru.honn.rutube.domain.ServiceException;
import is.ru.honn.rutube.domain.Video;
import java.util.*;

/**
 * Created by krihf on 30.9.2016.
 */
public class VideoServiceStub implements VideoService {

    private ArrayList<Video> videos;

    public VideoServiceStub()
    {
        videos = new ArrayList<Video>();
    }

    public int addVideo(Video video, int userId) throws ServiceException
    {
        for (Video v : videos) {
            if(v.getVideoId() == video.getVideoId()) {
                throw new ServiceException();
            }
        }

        // here we presume that it's been checked that the user exists
        // TODO: check if we need to add a pointer to the user service stub
        videos.add(video);
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
