package org.cap.entities;

public class AppUser {

    private String password;

	public AppUser() {

    }

    public AppUser( int id,String password,String name) {
        
        this.name = name;
        this.id = id;
        this.password=password;
    }

    private int id;

    public int getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;

   @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof AppUser)) {
            return false;
        }
        AppUser user = (AppUser) obj;
        return user.id==(this.id);
    }
    

    @Override
    public int hashCode() {
        return hashCode();
    }
}
