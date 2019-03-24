package com.example.demospringscheduler.task;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Tasks {

	private static final Logger LOG = LoggerFactory.getLogger(Tasks.class);

	@Scheduled(fixedDelay = 5000)
	public void logCurrentDate() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		LOG.info("La hora actual es {}", dateFormat.format(new Date()));
	}

}
