import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import org.junit.runner.JUnitCore;

public class Lab2Test {

	@Test
	public void ex_sum() throws Exception {
		
		Lab2 lab2 = new Lab2();
		
		assertThat(lab2.sum(8, 5), is(13));
	}
	
	@Test
	public void test1_average() throws Exception {
		
		Lab2 lab2 = new Lab2();
		
		assertThat(lab2.average(21, 33, 24), is(26));
	}
	
	@Test
	public void test2_circle_area() throws Exception {
		
		Lab2 lab2 = new Lab2();
		
		assertThat(lab2.circle_Area(21.5), is(closeTo(1451.465, 0.1)));
	}
	
	@Test
	public void test3_BMI_Index() throws Exception {
		
		Lab2 lab2 = new Lab2();
		
		assertThat(lab2.BMI_Index(180.0, 70.0), is(closeTo(21.6, 0.1)));
	}
	
	@Test
	public void test4_time_Transform() throws Exception {
		
		Lab2 lab2 = new Lab2();
		Time time;
		
		time = lab2.time_Transform(300025);
		
		assertThat(time.day, is(3));
		assertThat(time.hour, is(11));
		assertThat(time.minute, is(20));
		assertThat(time.second, is(25));
	}
	
	@Test
	public void test5_inner_Range() throws Exception {
		
		Lab2 lab2 = new Lab2();
		
		assertThat(lab2.inner_Range(21, 33, 24), is(true));
		assertThat(lab2.inner_Range(96, 112, 114), is(false));
	}
	
}
