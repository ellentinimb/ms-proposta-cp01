package ellen.ms_proposta.service;

import ellen.ms_proposta.repository.UserRepository;
import ellen.ms_proposta.model.User;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    public User insert(User user) {
        return userRepository.save(user);
    }

    public User update(Long id, User user) {
        Optional<User> existingUser = userRepository.findById(id);
        if (existingUser.isPresent()) {
            User userToUpdate = existingUser.get();
            userToUpdate.setNome(user.getNome());
            userToUpdate.setSobrenome(user.getSobrenome());
            userToUpdate.setCpf(user.getCpf());
            userToUpdate.setTelefone(user.getTelefone());
            userToUpdate.setRenda(user.getRenda());
            return userRepository.save(userToUpdate);
        }
        return null;
    }

    public void delete(Long id) {
        userRepository.deleteById(id);
    }
}
