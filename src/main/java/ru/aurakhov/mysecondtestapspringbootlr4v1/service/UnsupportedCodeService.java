package ru.aurakhov.mysecondtestapspringbootlr4v1.service;

import org.springframework.stereotype.Service;
import ru.aurakhov.mysecondtestapspringbootlr4v1.exception.UnsupportedCodeException;

@Service
public interface UnsupportedCodeService {

    void isValid(String s) throws UnsupportedCodeException;
}


