package presentation;

import utils.InputReader;

public class Controller {

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
                    System.out.println(1);
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
