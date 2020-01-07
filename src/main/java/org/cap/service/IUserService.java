package org.cap.service;

import org.cap.entities.AppUser;

public interface IUserService {
	AppUser getUserById(int id);

    boolean credentialsCorrect(int id, String password);
}
