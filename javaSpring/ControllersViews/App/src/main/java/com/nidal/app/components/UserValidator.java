package com.nidal.app.components;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.nidal.app.models.User;
import com.nidal.app.repositories.UserRepository;

@Component
public class UserValidator implements Validator {
    private final UserRepository userRepository;

    public UserValidator (UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public boolean supports (Class<?> clazz) {
        return User.class.equals(clazz);
    }

    @Override
    public void validate (Object target, Errors errors) {
        User user = (User) target;
        List <User> allUsers = userRepository.findAll();

        if (!user.getPasswordConfirmation().equals(user.getPassword())) {
            errors.rejectValue("passwordConfirmation", "NotConfirmed");
        }
        for (int i = 0; i < allUsers.size(); i++) {
            String email = allUsers.get(i).getEmail();
            if (email.equals(user.getEmail())) {
                errors.rejectValue("email", "AlreadyExist");
            }
        }
    }
}