package parcial2.univsys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import parcial2.univsys.model.User;
import parcial2.univsys.service.MyUserDetailsService;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private MyUserDetailsService userDetailsService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody User user) {
        userDetailsService.save(user, passwordEncoder);
        return ResponseEntity.ok("User registered successfully");
    }
}
