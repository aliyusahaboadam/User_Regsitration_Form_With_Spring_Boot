package codingtechniques.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import codingtechniques.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
