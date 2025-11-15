package presentation;

import application.dto.UserDTO;
import application.service.UserService;
import utils.InputReader;

import java.util.List;

public class Controller {
    UserService userService;
    UserDTO userDto;

    public Controller(){
        userService = new UserService();
        userDto = new UserDTO();
    }

    public void addUser(){
        System.out.print("Enter username: ");
        userDto.setUsername(InputReader.scanString());

        System.out.print("Enter email: ");
        userDto.setEmail(InputReader.scanString());

        System.out.print("Enter document ID: ");
        userDto.setDocumentId(InputReader.scanLong());

        try {
            userService.register(userDto);
        } catch (IllegalArgumentException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public void getAllUsers(){
        List<UserDTO> users = userService.getAllUsers();
        System.out.println(" -- Users list -- ");
        if (users.isEmpty()){
            System.out.println("No users found.");
            return;
        }

        for (UserDTO u : users){
            System.out.println(
                    u.getId() + ". " + u.getUsername() +
                            "\n   Email: " + u.getEmail() +
                            "\n   Document: " + u.getDocumentId() + "\n"
            );
        }
    }

    public void run(){
        int opt;
        do{
            System.out.println(" -- DTO's Management --");
            System.out.println("1. Add User");
            System.out.println("2. Show Users list");
            System.out.println("3. Stop Application");
            System.out.println("Select a option: ");
            opt = InputReader.scanNum();

            switch (opt){
                case 1:
                    addUser();
                    break;
                case 2:
                    getAllUsers();
                    break;
                case 3:
                    System.out.println("Closing application...");
                    break;
                default:
                    System.out.println("Wrong option!");
                    break;
            }
        }while(opt != 3);
    }
}
