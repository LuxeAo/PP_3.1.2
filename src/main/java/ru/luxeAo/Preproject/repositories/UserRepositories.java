package ru.luxeAo.Preproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.luxeAo.Preproject.model.User;

@Repository
public interface UserRepositories extends JpaRepository<User, Long> {
}
