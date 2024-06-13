package vn.example.itviec.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import vn.example.itviec.domain.User;
import vn.example.itviec.service.UserService;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/users")
    public ResponseEntity<User> createNewuser(@RequestBody User postManuser) {
       
        User user=this.userService.handleCreateUser(postManuser);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<String> deleteuser(@PathVariable("id") long id) {
        this.userService.handleDeleteUser(id);
        return ResponseEntity.status(HttpStatus.OK).body("user") ;
    }
    // fetch users by id
    @GetMapping("/users/{id}")
    public ResponseEntity<User> getuserById(@PathVariable("id") long id) {
        User fetchUser=this.userService.fetchUserById(id);
        return ResponseEntity.status(HttpStatus.OK).body(fetchUser);
    }

    // fetch all userss
    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllusers() {
        return ResponseEntity.status(HttpStatus.OK).body(this.userService.fetchAllUser());
    }
    @PutMapping("/users")
    public ResponseEntity<User> updateusers(@RequestBody User user) {
        User updateUser = this.userService.handleUpdateUser(user);
        return ResponseEntity.status(HttpStatus.OK).body(updateUser);
    }
}
