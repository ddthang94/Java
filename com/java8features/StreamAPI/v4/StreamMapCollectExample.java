package com.java8features.StreamAPI.v4;

import java.util.ArrayList;
import java.util.List;

public class StreamMapCollectExample {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User(1,"John", "go123","john@gmail.com"));
        users.add(new User(2,"Jane", "go234","jane@gmail.com"));
        users.add(new User(3,"Jack", "go345","jack@gmail.com"));
        users.add(new User(4,"Jacky", "go456","jacky@gmail.com"));

        /* traditional way to map User to UserDTO */
//        List<UserDTO> userDTOs = new ArrayList<>();
//        for (User user : users) {
//            userDTOs.add(new UserDTO(user.getId(), user.getName(), user.getEmail()));
//        }
//
//        for (UserDTO dto : userDTOs) {
//            System.out.println(dto);
//        }

        /* Using streamAPI to map an object (User) to other object (UserDTO) */
        users.stream()
                .map((User user)-> (new UserDTO(user.getId(), user.getName(), user.getEmail())))
                .forEach(System.out::println);
        System.out.println("=======");

//        collect as a list
        List<UserDTO> userDTOList = users.stream()
                                        .map((User user) -> (new UserDTO(user.getId(),
                                                                        user.getName(),
                                                                        user.getEmail())))
                                        .toList();

        userDTOList.forEach(System.out::println);
    }
}

class UserDTO {
    private int id;
    private String name;
    private String email;

    public UserDTO(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User [" +
                "id: " + id +
                ", name: '" + name + '\'' +
                ", email: '" + email + '\'' +
                ']';
    }
}

class User {
    private int id;
    private String name;
    private String password;
    private String email;

    public User(int id, String name, String password, String email) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
    }

    public int getId() {
        return id;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User [" +
                "id: " + id +
                ", name: '" + name + '\'' +
                ", password: '" + password + '\'' +
                ", email: '" + email + '\'' +
                ']';
    }
}