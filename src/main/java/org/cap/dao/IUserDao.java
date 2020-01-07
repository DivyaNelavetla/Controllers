package org.cap.dao;

import org.cap.entities.AppUser;

public interface IUserDao {


    AppUser getUserById(int id);

    boolean credentialsCorrect(int id, String password);

}
