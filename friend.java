import java.util.*;
import java.util.ArrayList;
import java.lang.StringBuilder;

public class friends {

    private String name;// instant variables
    private int age;
    private int NoOfFriends;
    private int nextfriend;

    friends(String name, int age, int nfriends, int nextfriends) {// constructor
        setname(name);
        setage(age);
        setNoOfFriends(nfriends);
        nextfriends = Null;

    }

    public String getname() {
        return name;

    }

    public int getage() {
        return age;
    }

    public int getNoOfFriends() {
        return NoOfFriends;
    }

    public void setname(String Name) {
        name = Name;

    }

    public void setage(int newage) {
        age = newage;

    }

    public void setNoOfFriends(int newNoOfFriends) {
        NoOfFriends = newNoOfFriends;

    }

    public class facebookFriends extends friends {
        private String username;
        private int NoOfPosts;

        facebookFriends(String username, int NoOfPosts, int nextfriends) {/// constructor
            setusername(username);
            setNoOfPosts(NoOfPosts);
            nextfriends = Null;
        }

        public String getusername() {
            return username;

        }

        public int getNoOfPosts() {
            return NoOfPosts;
        }

        public void setusername(String newuserName) {
            username = newuserName;

        }

        public void setNoOfPosts(int newNoOfPosts) {
            NoOfPosts = newNoOfPosts;

        }
    }

    public class friendslist extends friends {
        String[] fr = { "Shayan", "Tayyab", "Shaz" };

        friendslist(String name, int age, int NoOfFriends) {
            super(name, age, NoOfFriends);

        }

        public void addfriends() {

            StringBuilder str = new StringBuilder("");

            System.out.println(str.append("ammar"));
        }

    }

    class facebookfriendslist extends friends {
        String[] fr = { "sara", "ahmed", "taha" };

        facfriendslist(String name , int age , int NoOfFriends) 
{
	  super(name , age , NoOfFriends);
            
 }

        public void addffriends() {

            StringBuilder str = new StringBuilder("");

            System.out.println(str.append("asher"));
        }

    }

    public static void main(String[] args) {
        friends obj = new friend("hanzala", 45, 156);

        System.out.println("the name is " + obj.getname());
        System.out.println("the age is " + obj.getage());
        System.out.println("the No Of Friends is " + obj.getNoOfFriends());
        friendslist fl = new friendslist("hanzala", 130, 500);
        fl.addfriends();
        facebookFriends obj1 = new facebookFriends("hanzala hashmi", 200, 0);
        facebookfriendslist ffl = new facebookfriendslist("hanzala", 130, 500);
        ffl.addfriends();
        System.out.println("The user name is " + obj1.getusername());
        System.out.println("The no of posts are  " + obj1.getNoOfPosts());
    }

}