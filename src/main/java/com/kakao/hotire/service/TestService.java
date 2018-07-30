package com.kakao.hotire.service;

import com.kakao.hotire.model.TestUser;
import com.kakao.hotire.repository.TestRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : hotire
 */
@Service
@Slf4j
public class TestService {
    @Autowired
    TestRepository testRepository;

    public TestUser getUser(String id) {
        return testRepository.getUser(id);
    }
}
