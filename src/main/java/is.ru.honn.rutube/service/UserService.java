package is.ru.honn.rutube.service;

import is.ru.honn.rutube.domain.ServiceException;
import is.ru.honn.rutube.domain.User;

import java.util.List;

/**
 * Created by Snojo on 30/09/16.
 */
public interface UserService
{
    int addUser(User user) throws ServiceException;
    User getUser(int userId);
    List<User> getUsers();
}
