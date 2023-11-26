package th.mfu.Service;

import th.mfu.Entity.User;

public interface UserService extends UserDetailsService{
	User save(User registrationDto);
	
}