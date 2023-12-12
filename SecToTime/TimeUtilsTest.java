package timeUtils;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TimeUtilsTest {
	
	private TimeUtils timeutils = new TimeUtils();
	
	@ParameterizedTest(name = "syote {0} tulos {1}")
	@CsvSource({"3665 , 1:01:05", "0, 0:00:00", "7200, 2:00:00", "1500, 0:25:00", "45, 0:00:45", "3666, 1:01:06", "3661, 1:01:01", "59, 0:00:59", "61, 0:01:01", "1, 0:00:01"})
	public void testTime(int aika, String tulos) {
		String message =  aika + " käänetty väärin, tulos: " + tulos;
		assertEquals(tulos, timeutils.secToTime(aika), message);
	}

}