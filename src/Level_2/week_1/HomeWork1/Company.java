package Level_2.week_1.HomeWork1;

/**
 * Created by pc on 06.08.2016.
 */
public class Company {

    private static User[] users = new User[10];

    public static void main(String[] args) {
        User user1 = new User();
        User user2 = new User();

        user1.age = 25;
        user1.id = 1;
        user1.name = "name1";
        user1.salary = 1300;

        user2.age = 30;
        user2.id = 2;
        user2.name = "name2";
        user2.salary = 1300;

        addUser(user1);
        addUser(user2);
        showUser(users);
        removeUser(users, user1);
        showUser(users);

    }

    public static User[] addUser(User newUser){

        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                users[i] = newUser;
                break;
            }
        }
        return users;
    }

    public static User[] removeUser(User[] users, User user){
        for (int i = 0; i < users.length; i++) {

            // return users[i] == user ? users[i] = null : "user doesn`t exist";
            if (users[i] == user) {
                users[i] = null;
                break;
            } else {
                System.out.println("user doesn`t exist");
            }
        }
        return users;
    }

    public static void showUser(User[] users){
        String str = "";
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                str += users[i].id + ", " + users[i].name + ", " + users[i].age + ", " + users[i].salary + "\n";
            } else {
                str += " null \n";
            }

        }
        System.out.println(str);
    }

}

