package com.dunght.config;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.dunght.entity.Role;
import com.dunght.entity.User;
import com.dunght.repository.RoleRepository;
import com.dunght.repository.UserRepository;

@Component
public class DataSeedingListener implements ApplicationListener<ContextRefreshedEvent> {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	  @Autowired
	  private PasswordEncoder passwordEncoder;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {
		
	    // Roles dump database
	    if (roleRepository.findByRoleName("ROLE_ADMIN") == null) {
	      roleRepository.save(new Role("ROLE_ADMIN","Role for Admin"));
	    }

	    
		// TODO Auto-generated method stub
	    if (userRepository.findByUsername("admin")== null) {
	        User adminht = new User();
	        adminht.setUsername("admin");
	        adminht.setFirstName("Dung");
	        adminht.setLastName("Ho");
	        adminht.setPassword(passwordEncoder.encode("12345678"));
	        HashSet<Role> roles = new HashSet<>();
	        roles.add(roleRepository.findByRoleName("ROLE_ADMIN") );
	        adminht.setRoles(roles);
	        userRepository.save(adminht);
	      }
	}

}
