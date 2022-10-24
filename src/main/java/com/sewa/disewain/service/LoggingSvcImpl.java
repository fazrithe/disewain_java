package com.sewa.disewain.service;

import com.sewa.disewain.model.LoggingModel;
import com.sewa.disewain.repository.LoggingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.UUID;

@Service
public class LoggingSvcImpl implements LoggingSvc {

    @Autowired
    private LoggingRepository loggingRepository;

    @Override
    public void createLog(HashMap<String, Object> data, String type) {
        LoggingModel log = new LoggingModel();
        log.setId(UUID.randomUUID().toString());
        log.setData(data);
        log.setType(type);
        loggingRepository.save(log);
    }
}