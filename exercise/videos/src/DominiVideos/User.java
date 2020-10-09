package DominiVideos;

import java.util.*;

public class User {

    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String registerDate;
    private List<Video> videoLibrary = new ArrayList<Video>();

    public User(String firstName, String lastName, String nickName, String pass, String registerDate, List<Video> videoLibrary) {
        this.firstName = firstName;
        this.lastName = lastName;
        userName = nickName;
        password = pass;
        this.registerDate = registerDate; 
     }
     
     public void addVideos(List<Video> videoLibrary) {
    	 this.videoLibrary=videoLibrary;
     }
     
     public void setFirstName(String firstName) throws Exception {
    	 if ("".equals(firstName)) {
 			throw new Exception("This field cannot be empty");
    	 }
    	 this.firstName = firstName;
     }

     public void setLastName(String lastName) throws Exception {
    	 if ("".equals(lastName)) {
    		 throw new Exception("This field cannot be empty");
    	 }
    	 this.lastName = lastName;
     }

     public void setUserName(String nickName) throws Exception {
    	 if ("".equals(nickName)) {
  			throw new Exception("This field cannot be empty");
    	 }
    	 this.userName = nickName;
     }

     public void setPassword(String password) throws Exception {
    	 if ("".equals(password)) {
   			throw new Exception("This field cannot be empty");
    	 }
    	 this.password = password;
     }
     
     public void setRegisterDate() {
    	 Date registerDate = new Date();
    	 this.registerDate = registerDate.toString();
     }

     
     public String getFirstName() {
         return firstName;
      }
     
     public String getLastName() {
        return lastName; 
     }

     public String getUserName() {
        return userName;
     }

     public String getPassword() {
        return password;
     } 
     
     public String getRegisterDate() {
         return registerDate;
      }
     
     public List<Video> getVideoLibrary(){
    	 return videoLibrary;
     }

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName + ", password="
				+ password + ", registerDate=" + registerDate + ", videoLibrary=" + videoLibrary + "]";
	}

	

     
}