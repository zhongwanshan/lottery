package lottery.service.repository;

import lottery.entity.User;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaSpecificationExecutor<User>,PagingAndSortingRepository<User,Long> {

    User findByUsername(String username);
    List<User> findByRole(String role);
}