package com.skycloud.core.config;

import java.util.List;
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
 * @author sky
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConfigApplication.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@DirtiesContext
public class ApplicationTests {

	@LocalServerPort
	private int port = 0;

	/**
	 * 测试服务及配置可用
	 */
	@Test
	@SuppressWarnings("rawtypes")
	public void configurationAvailable() {
		ResponseEntity<Map> entity = new RestTemplate().getForEntity("http://localhost:" + port + "/config/test/dev",
				Map.class);
		Assert.assertEquals(HttpStatus.OK, entity.getStatusCode());
		List obj = (List) entity.getBody().get("propertySources");
		Assert.assertTrue(!obj.isEmpty());
	}

	/**
	 * 测试服务及配置可用
	 */
	@Test
	public void configurationConfigAvailable() {
		String rs = new RestTemplate().getForObject("http://localhost:" + port + "/config/test/default", String.class);
		Assert.assertNotNull(rs);
	}


}