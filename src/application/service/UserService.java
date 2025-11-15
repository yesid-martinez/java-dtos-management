package application.service;

import application.dto.UserDTO;
import domain.objects.User;
import infrastructure.mapper.UserMapper;
import infrastructure.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    UserMapper mapper = new UserMapper();
    UserRepository repo = new UserRepository();

    public void register(UserDTO dto) {
        User user = mapper.createEntity(dto);
        if(!user.checkEmail()){
            System.out.println("Invalid email: " + user.getEmail());
            return;
        }

        if(!user.checkDoc()){
            System.out.println("Invalid document: " + user.getDocumentId());
            return;
        }
        repo.save(user);
        System.out.println("User created successfully!");
    }

    public List<UserDTO> getAllUsers(){
        List<User> users = repo.read();
        List<UserDTO> usersDTO = new ArrayList<>();
        for (User u : users){
            usersDTO.add(mapper.createDTO(u));
        }
        return usersDTO;
    }
}
