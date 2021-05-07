package day3_homework2;

import java.sql.SQLOutput;

public class UserManager {

    public void signUp(User user) {
        System.out.println(user.getFirstName() + " isimli kullanıcı üye oldu.");
    }

    public void delete(User user) {
        System.out.println(user.getFirstName() + " isimli kullanıcı üyeliğini sildi.");
    }

    public void signIn(User user) {
        System.out.println(user.getFirstName() + " isimli kullanıcı giriş yaptı.");
    }

    public void signOut(User user) {
        System.out.println(user.getFirstName() + "isimli kullanıcı çıkış yaptı.");
    }

    public void changePassword(User user) {
        System.out.println(user.getFirstName() + "isimli kullanıcı şifresini değiştirdi.");
    }
}
