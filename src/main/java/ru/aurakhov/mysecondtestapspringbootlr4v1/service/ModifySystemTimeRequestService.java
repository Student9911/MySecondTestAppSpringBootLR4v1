package ru.aurakhov.mysecondtestapspringbootlr4v1.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import ru.aurakhov.mysecondtestapspringbootlr4v1.model.Request;
import ru.aurakhov.mysecondtestapspringbootlr4v1.util.DateTimeUtil;

import java.util.Date;

@Service
@Component
public class ModifySystemTimeRequestService implements ModifyRequestService{
    @Override
    public void modify(Request request) {
        request.setSystemTime(DateTimeUtil.getCustomFormat().format(new Date()));

    }
}
