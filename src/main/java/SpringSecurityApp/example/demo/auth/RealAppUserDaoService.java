package SpringSecurityApp.example.demo.auth;

import java.util.Optional;

public class RealAppUserDaoService implements ApplicationUserDao{
    @Override
    public Optional<ApplicationUser> selectApplicationUserByUsername(String username) {
        return Optional.empty();
    }
}
