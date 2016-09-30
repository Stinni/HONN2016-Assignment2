package is.ru.honn.rutube.service;

import is.ru.honn.rutube.domain.ServiceException;
import is.ru.honn.rutube.domain.User;

import java.util.List;

/**
 * Created by krihf on 30.9.2016.
 */
public class UserServiceStub implements UserService {

    public int addUser(User user) throws ServiceException
    {
        return 1;
    }

    public User getUser(int userId)
    {
        return null;
    }

    public List<User> getUsers()
    {
        return null;
    }
}
