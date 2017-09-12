package eu.purecode.springloginapp.service;

import eu.purecode.springloginapp.model.User;

public interface UserService {

    public void save(User user);
    public User findByUsername(String username);
}
