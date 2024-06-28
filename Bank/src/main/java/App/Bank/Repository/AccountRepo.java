package App.Bank.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import App.Bank.Entity.Account;

@Repository
public interface AccountRepo extends JpaRepository<Account, Long> {
}
