package eu.purecode.springloginapp.service;

public interface SecurityService {
    String findLoggedInUsername();

    void autologin(String username, String password);
}
