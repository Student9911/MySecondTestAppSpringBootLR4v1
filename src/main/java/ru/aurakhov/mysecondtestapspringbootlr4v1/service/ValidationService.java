package ru.aurakhov.mysecondtestapspringbootlr4v1.service;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import ru.aurakhov.mysecondtestapspringbootlr4v1.exception.ValidationFailedException;

@Service
public interface ValidationService {

    void isValid(BindingResult bindingResult) throws ValidationFailedException;
}
