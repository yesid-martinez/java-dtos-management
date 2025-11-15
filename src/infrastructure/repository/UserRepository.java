package infrastructure.repository;

import domain.objects.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository implements Repository<User>{
    private List<User> storage;
    private int userCounter = 1;

    public UserRepository(){
        storage = new ArrayList<>();
    }

    public void save(User u) {
        u.setId(userCounter++);
        this.storage.add(u);
    }

    public List<User> read() {
        return new ArrayList<>(storage);
    }
}
