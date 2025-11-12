package application.service;

import application.dto.UserDTO;
import domain.objects.User;
import infrastructure.mapper.UserMapper;

public class UserService {
    UserMapper mapper = new UserMapper();
    // UserRepository repo = new UserRepository();
    public void register(UserDTO dto) {
        User user = mapper.createEntity(dto);
        if(!user.checkEmail()){
            System.out.println("Invalid email: " + user.getEmail());
        }else{
            // Repository.save(user);
            System.out.println("User created successfully!");
        }
    }

    public void /* List<T> */ getAllUsers(){
        /* return T.getAll(); */
    }
}
