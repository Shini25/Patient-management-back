package leopard.PatientManagement.service;

import leopard.PatientManagement.model.User_account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import leopard.PatientManagement.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User_account> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User_account> getUserByUsername(String username) {
        return userRepository.findById(username);
    }

    public User_account saveUser(User_account user) {
        return userRepository.save(user);
    }

    public void deleteUser(String username) {
        userRepository.deleteById(username);
    }
}
