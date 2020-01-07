package org.cap.dao;

import java.util.HashMap;
import java.util.Map;

import org.cap.entities.AppUser;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoIml implements IUserDao {
	private Map<Integer, AppUser> store = new HashMap<>();

    public UserDaoIml() {
        AppUser user1 = new AppUser(1,"Divya","1234");
        store.put(1, user1);
        AppUser user2 = new AppUser(2,"Harika","12345");
        store.put(2, user2);
        AppUser user3 = new AppUser(3,"Indu","123456");
        store.put(3, user3);
    }

	@Override
	public AppUser getUserById(int id) {
		// TODO Auto-generated method stub
		AppUser user = store.get(id);
        return user;
		
	}

	@Override
	public boolean credentialsCorrect(int id, String password) {
		AppUser user = store.get(id);
        if (user == null) {
            return false;
        }
        return user.getPassword().equals(password);
	}
	

}
