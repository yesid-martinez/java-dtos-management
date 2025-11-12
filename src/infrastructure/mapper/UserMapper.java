package infrastructure.mapper;

import application.dto.UserDTO;
import domain.objects.User;

public class UserMapper implements Mapper<User, UserDTO> {
    public User createEntity(UserDTO dto){
        User user = new User();
        user.setUsername(dto.getUsername());
        user.setEmail(dto.getEmail());
        user.setDocumentId(dto.getDocumentId());
        return user;
    }

    public UserDTO createDTO(User entity){
        UserDTO dto = new UserDTO();
        dto.setId(entity.getId());
        dto.setUsername(entity.getUsername());
        dto.setEmail(entity.getEmail());
        dto.setDocumentId(entity.getDocumentId());
        return dto;
    }

}
