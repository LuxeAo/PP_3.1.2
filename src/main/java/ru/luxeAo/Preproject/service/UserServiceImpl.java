package ru.luxeAo.Preproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.luxeAo.Preproject.model.User;
import ru.luxeAo.Preproject.repositories.UserRepositories;

import java.util.List;
import java.util.Optional;


@Service
public class UserServiceImpl implements UserService {

    private final UserRepositories userRepository;

    @Autowired
    public UserServiceImpl(UserRepositories userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    @Transactional
    public void save(User user) {
        userRepository.save(user);
    }


    @Override
    @Transactional
    public void removeUserById(long id) {
        userRepository.deleteById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(long id) {
        Optional<User> foundUser = userRepository.findById(id);
        return foundUser.orElse(null);
    }

    @Override
    @Transactional
    public void update(User user) {
        userRepository.save(user);
    }
}