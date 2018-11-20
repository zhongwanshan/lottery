package lottery.service.repository;

import lottery.entity.UserLoginInfo;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserLoginInfoRepository extends JpaSpecificationExecutor<UserLoginInfo>,PagingAndSortingRepository<UserLoginInfo,Long> {

}