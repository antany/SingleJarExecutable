package ca.antany.project;

import org.junit.Test;

public class ProjectTest {

	@Test
	public void test1_callMainMethod() throws Exception {
		String[] args = {};
		try {
			Project.main(args);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
