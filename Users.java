public class Users {

    String name;
    String password;
    String login(){
        return "Logged In";
    }

    String register(){
        if (name.equals("") || password.equals("")) {
            return "Can't be empty";
        } else {
            return "Successful!";
        }
    }
}


