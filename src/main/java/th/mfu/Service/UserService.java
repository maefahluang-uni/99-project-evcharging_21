package th.mfu.Service;

import th.mfu.Entity.User;
import th.mfu.WebDTo.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(User registrationDto);
}