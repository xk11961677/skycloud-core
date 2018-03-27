package com.skycloud.core.eureka;

import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

/**
 * 应用程序测试
 * 
 * @author sky
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)

@ContextConfiguration(classes = EurekaApplication.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@DirtiesContext
public class ApplicationTests {

	@LocalServerPort
	private int port = 0;

	/**
	 * 测试服务
	 */
	@Test
	@SuppressWarnings("rawtypes")
	public void configurationAvailable() {
		ResponseEntity<Map> entity = new RestTemplate().getForEntity("http://localhost:" + port + "/info",
				Map.class);
		Assert.assertEquals(HttpStatus.OK, entity.getStatusCode());
	}


}