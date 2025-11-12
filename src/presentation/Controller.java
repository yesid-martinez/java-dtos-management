package presentation;

import application.dto.UserDTO;
import application.service.UserService;
import utils.InputReader;

public class Controller {
    UserService userService;
    UserDTO userDto;

    public Controller(){
        userService = new UserService();
        userDto = new UserDTO();
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
                    userService.register(userDto);
                    break;
                case 2:
                    System.out.println(2);
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
