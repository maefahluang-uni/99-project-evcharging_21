package th.mfu.Repository;



import org.springframework.data.jpa.repository.JpaRepository;

import th.mfu.Entity.User;




public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String username);
      
}