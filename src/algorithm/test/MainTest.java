package algorithm.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import algorithm.continiousArray1.ContiniousArray01;

class MainTest {

	@Test
	void test() {
		ContiniousArray01 continiousArray01 = new ContiniousArray01();
		String[] args = {"1","4","3","2"};
		continiousArray01.main(args);
	}

}
