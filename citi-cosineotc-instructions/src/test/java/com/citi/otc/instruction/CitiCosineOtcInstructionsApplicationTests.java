package com.citi.otc.instruction;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CitiCosineOtcInstructionsApplicationTests {

	@Autowired
	private RabbitTemplate template;

	@Value("${amqp.monet.otc.inbound.queue}")
	private String  inbound;

	@Test
	public void contextLoads() {
		Assert.assertNotNull(template);
		/* start  equart*/
		System.out.println("amqp.monet.otc.inbound.queue::" +  inbound );
		Assert.assertEquals(inbound , "amqp.monet.otc.inbound.queue");

	}

}
