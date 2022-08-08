import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CreateStudent {
	static String value="opt";
	static List<Student> studentsList;
	Map<Student, String> getStudent() {
		Student j= new Student("Jaggu", "Dindoor", 9, 8);
		Student k= new Student("Jaggu", "Dind", 7, 5);
		Student l= new Student("Jag", "Dindoor", 9, 5);
		Student m= new Student("Jaggu", "oor", 5, 5);
		
		studentsList= Arrays.asList(j,k,l,m);
		
//		for(Student s:studentsList) {
//			if(s.getRollNo()==9 && s.getStandard()==5)
//				System.out.println(s);
//			else
//				System.out.println("not found");
//		}
		Map<Student, String> map= new HashMap<>();
		map.put(j, value);
		map.put(k, value);
		map.put(l, value);
		map.put(m, value);
		
		return  map;
		
	}
	List<Student> searchStudents(int rollNo,int std){
		Predicate<Student> p1=i->i.rollNo==rollNo;
		Predicate<Student> p2=i->i.firstName.startsWith("J");
		return  studentsList.stream().filter(p1. and (p2)).filter(s->s.standard==std).collect(Collectors.toList());
	}
	public static void main(String[] args) {
		CreateStudent createStudent= new CreateStudent();
		//System.out.println(createStudent.getStudent());
		boolean pre= createStudent.getStudent().containsKey(new Student("", "", 9, 0));
		System.out.println(pre);
		List<Student> searchresult=createStudent.searchStudents(6, 5);
		System.out.println(searchresult);
		
		
	}
	
}
