package hiber.dao;

import hiber.model.User;

import java.util.List;

public interface UserDao {
   User search(String model, int series);
   void add(User user);
   List<User> listUsers();
}
