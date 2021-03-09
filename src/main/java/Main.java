
import model.User;
import service.UserService;
import service.UserServiceImpl;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Борис", "Eльцин", (byte) 76);
        userService.saveUser("Владимир", "Путин", (byte) 56);
        userService.saveUser("Дмитрий", "Медведев", (byte) 47);
        userService.saveUser("Владимир", "Путин", (byte) 68);
        userService.removeUserById(4);

        Stream<User> users = userService.getAllUsers().stream();
        users.forEach(System.out::println);

        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}