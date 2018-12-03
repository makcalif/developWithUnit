package com.gradle.developWithUnit;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DevelopWithUnitApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void shouldFail() {
		Assertions.assertThat(Boolean.FALSE).isTrue();
	}

}
