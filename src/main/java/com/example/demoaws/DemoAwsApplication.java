package com.example.demoaws;

import com.amazonaws.services.s3.AmazonS3;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
@RequiredArgsConstructor
public class DemoAwsApplication implements CommandLineRunner {

	private final AmazonS3 s3;

	public static void main(String[] args) {
		SpringApplication.run(DemoAwsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	//	s3.putObject("myfolder88","test", new File("file.txt"));
		s3.createBucket("backet-from-java");
		s3.listBuckets().forEach(System.out::println);
	}
}
