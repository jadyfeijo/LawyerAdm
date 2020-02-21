package com.gfadvocaciars.lawyeradm.security;

import com.gfadvocaciars.lawyeradm.domain.Employee;
import com.gfadvocaciars.lawyeradm.domain.User;
import com.gfadvocaciars.lawyeradm.exceptions.NotFoundException;
import com.gfadvocaciars.lawyeradm.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsImpl  implements UserDetailsService {

    @Autowired
    private EmployeeRepository repository;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        Employee employee = repository.findByEmail(email);
        if(employee == null)
            throw new UsernameNotFoundException(email);
        return new User(employee.getId(),employee.getEmail(),employee.getPassword(),employee.getPermission());
    }
}
