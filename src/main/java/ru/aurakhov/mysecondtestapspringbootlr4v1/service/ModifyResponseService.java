package ru.aurakhov.mysecondtestapspringbootlr4v1.service;

import org.springframework.stereotype.Service;
import ru.aurakhov.mysecondtestapspringbootlr4v1.model.Response;

@Service
public interface ModifyResponseService {

    Response modify(Response response);



}

