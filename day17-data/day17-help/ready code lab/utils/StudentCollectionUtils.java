package utils;

import static com.app.core.Subject.ANGULAR;
import static com.app.core.Subject.DBT;
import static com.app.core.Subject.JAVA;
import static com.app.core.Subject.REACT;
import static java.time.LocalDate.parse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.app.core.Address;
import com.app.core.Student;
import static java.util.Comparator.comparing;

public class StudentCollectionUtils {
	private static int index = 0;

	public static List<Student> populateList() {
		List<Student> students = new ArrayList<>(Arrays.asList(
				new Student("dac-001", "ravi", parse("1990-12-13"), ANGULAR, 7, Arrays.asList("reading", "music")),
				new Student("dac-009", "riya", parse("1992-12-13"), REACT, 6.9, Arrays.asList("football", "music")),
				new Student("dac-004", "shekhar", parse("1991-12-13"), DBT, 8.9,
						Arrays.asList("reading", "music", "cricket")),
				new Student("dac-002", "priya", parse("1990-02-23"), JAVA, 7.7,
						Arrays.asList("trekking", "zumba", "music")),
				new Student("dac-007", "kiran", parse("1993-02-13"), DBT, 8.1,
						Arrays.asList("cricket", "music", "hiking")),
				new Student("dac-003", "meeta", parse("1993-12-13"), DBT, 7.9,
						Arrays.asList("rafting", "music", "football")),
				new Student("dac-008", "sameer", parse("1991-12-06"), JAVA, 8.2, Arrays.asList("cricket", "music"))));
		List<Address> adrs = Arrays.asList(new Address("pune", "MH", "452446"), new Address("pune", "MH", "652446"),
				new Address("nagpur", "MH", "852446"), new Address("indore", "MP", "752446"),
				new Address("mumbai", "MH", "672446"), new Address("pune", "MH", "692446"),
				new Address("chennai", "TN", "862446"));

		students.forEach(s -> s.assignAddress(adrs.get(index++)));
		return students;// rets populated growable list of students with adr
	}

	// add a static method to accept list of student details & rets a map populated
	// with the same
	public static Map<String, Student> populateMap(List<Student> list) {
		HashMap<String, Student> hm = new HashMap<>();
		list.forEach(s -> hm.put(s.getRollNo(), s));
		return hm;

	}

}
