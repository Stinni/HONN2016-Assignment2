package is.ru.honn.rutube.service;

import is.ru.honn.rutube.domain.User;

import java.util.List;

/**
 * Created by Snojo on 30/09/16.
 */
public interface UserService
{
    int addUser(User user) throws ServiceException;
    User getUser(int userId);  // Added 29.09.2016
    List<User> getUsers();
}
