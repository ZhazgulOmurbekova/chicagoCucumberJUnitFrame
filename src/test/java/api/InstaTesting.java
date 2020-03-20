package api;

public class InstaTesting {
    public static void main(String[] args) {
        Instagram instagram = new Instagram();
        // sign up page
        // on sign up page users must provide name , age , username ets

        InstagramUser user1 = new InstagramUser("John Wick", 45, "jw123");
        instagram.addUser(user1);
        System.out.println();
        instagram.seeAllUsers("234");

        System.out.println();

        InstagramUser user2 = new InstagramUser("Jamn Bondk", 25, "124");
        instagram.addUser(user2);
        instagram.seeAllUsers("Cyb32134");



        // InstagramUser user2 = new InstagramUser()
    }
}
