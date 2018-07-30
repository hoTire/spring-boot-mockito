package com.kakao.hotire.service;

import com.kakao.hotire.model.TestUser;
import com.kakao.hotire.repository.TestRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

/**
 * @author : hotire
 */
@RunWith(MockitoJUnitRunner.class)
public class TestServiceTest {

    @InjectMocks
    private TestService testService;

    @Mock
    private TestRepository testRepository;

    @Test
    public void getUser() {
        given(testRepository.getUser("abc")).willReturn(new TestUser("abc","hotire"));
        final TestUser result = testService.getUser("abc");

        verify(testRepository).getUser("abc");
        assertEquals("abc",result.getId());
        assertEquals("hotire",result.getName());
    }
}