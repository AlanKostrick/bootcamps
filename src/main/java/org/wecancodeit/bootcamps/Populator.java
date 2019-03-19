package org.wecancodeit.bootcamps;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Populator implements CommandLineRunner {

	@Resource
	private CampusRepository campusRepo;

	@Resource
	private BootcampRepository bootcampRepo;

	@Override
	public void run(String... args) throws Exception {

		Campus columbus = new Campus("Columbus");
		Campus cleveland = new Campus("Cleveland");

		campusRepo.save(columbus);
		campusRepo.save(cleveland);

		Bootcamp flexcode = new Bootcamp("FlexCode", columbus);
		Bootcamp cSharp = new Bootcamp("cSharp", cleveland);
		Bootcamp javaScript = new Bootcamp("JavaScript", columbus);
		Bootcamp java = new Bootcamp("Java", columbus);

		bootcampRepo.save(flexcode);
		bootcampRepo.save(cSharp);
		bootcampRepo.save(javaScript);
		bootcampRepo.save(java);

	}

}
