package studysiyou;

import org.junit.jupiter.api.Test;

class TestMain {

	@Test
	void test() {
		String input2 = "-1,-5,3,2";
		String max2 = sortArray(input2);
		assertThat(max2, 6);
	}
}
