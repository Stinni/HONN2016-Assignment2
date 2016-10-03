package is.ru.honn.rutube.service;

import is.ru.honn.rutube.domain.ServiceException;
import is.ru.honn.rutube.domain.User;

import java.rmi.server.ServerCloneException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by krihf on 30.9.2016.
 */

public class UserServiceStub implements UserService {
    public List<User> users = new ArrayList<>();

    public int addUser(User user) throws ServiceException
    {
        User u = new User();

        users.add(u);
        return u.getUserId();
    }

    public User getUser(int userId)
    {

        for( User s : users){
            if(s.getUserId() == userId){
                return s;
            }
        }
        return null;

    }

    public List<User> getUsers()
    {
        return null;
    }
}
