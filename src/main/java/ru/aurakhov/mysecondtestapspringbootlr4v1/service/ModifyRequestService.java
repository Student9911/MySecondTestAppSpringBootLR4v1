package ru.aurakhov.mysecondtestapspringbootlr4v1.service;

import org.springframework.stereotype.Service;
import ru.aurakhov.mysecondtestapspringbootlr4v1.model.Request;

@Service
public interface ModifyRequestService {

    void modify(Request request);
}
