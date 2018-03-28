
import java.util.Arrays;
import java.util.Comparator;

public class SortStudentInfo {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
        
        Student[] studInfo = {new Student(33,"Tina",3.68),new Student(85,"Louis",3.85),new Student(56,"Samil",3.75),new Student(19,"Samar",3.75),new Student(22,"Lorry",3.76)};
        Arrays.sort(studInfo,new Comparator()  {
        	public int sortStudent(Object o1, Object o2) {
        		if (o1 != null && o2 != null) {
        			//Sort by Student GPA
        			double p1 = ((Student) o1).getGpa();
        			double p2 = ((Student) o2).getGpa();

        			if (p1 == p2) {
        				// same gpa detected ... use name to compare

        				String name1 = ((Student) o1).getName();
        				String name2 = ((Student) o2).getName();

        				if(name1.startsWith(name2.substring(0))){

        					// same first name detected ... use id to compare

        					int id1 = ((Student) o1).getId();
        					int id2 = ((Student) o2).getId();

        					return Integer.compare(id1,id2);
        				}else
        					return name1.compareTo(name2);
        			}else
        				return Double.compare(p2, p1);

        		}

        		return -1;
        	}

        	@Override
        	public int compare(Object o1, Object o2) {
        		// TODO Auto-generated method stub
        		return sortStudent((Student) o1, (Student) o2);
        	}
	    });

        for (int i = 0; i < studInfo.length; i++){
            System.out.println(studInfo[i].getName());
        }
    }
}

class Student {
	private int id;
	private String name;
	private double gpa;

	public Student() {
		super();
	}
	public Student(int id, String name, double gpa) {
		this.id = id;
		this.name = name;
		this.gpa = gpa;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
}

