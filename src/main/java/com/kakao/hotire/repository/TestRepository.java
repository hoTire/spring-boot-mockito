package com.kakao.hotire.repository;

import com.kakao.hotire.model.TestUser;
import org.springframework.stereotype.Repository;

/**
 * @author : hotire
 */
@Repository
public interface TestRepository {
    TestUser getUser(String id);
}
