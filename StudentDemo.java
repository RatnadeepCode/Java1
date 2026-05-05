import java.util.*;

// Interface
interface Department {
    String deptName = "CSE";
    String deptHead = "Dr. XYZ";

    void printDeptData();
}

// Hostel Class
class Hostel {
    String hostelName, hostelLocation;
    int numberOfRooms;

    void getHostelData(Scanner sc) {
        System.out.print("Enter Hostel Name: ");
        hostelName = sc.next();
        System.out.print("Enter Hostel Location: ");
        hostelLocation = sc.next();
        System.out.print("Enter Number of Rooms: ");
        numberOfRooms = sc.nextInt();
    }

    void printHostelData() {
        System.out.println("Hostel: " + hostelName + ", " + hostelLocation + ", Rooms: " + numberOfRooms);
    }
}

// Student Class
class Student extends Hostel implements Department {
    String studentName, regdNo, electiveSubject;
    double avgMarks;

    void getData(Scanner sc) {
        System.out.print("Enter Name: ");
        studentName = sc.next();
        System.out.print("Enter Regd No: ");
        regdNo = sc.next();
        System.out.print("Enter Elective Subject: ");
        electiveSubject = sc.next();
        System.out.print("Enter Avg Marks: ");
        avgMarks = sc.nextDouble();

        getHostelData(sc);
    }

    void printData() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + studentName);
        System.out.println("Regd No: " + regdNo);
        System.out.println("Subject: " + electiveSubject);
        System.out.println("Marks: " + avgMarks);

        printHostelData();
        printDeptData();
    }

    public void printDeptData() {
        System.out.println("Department: " + deptName + ", Head: " + deptHead);
    }
}

// Driver
public class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();

        while(true) {
            System.out.println("\n1. Admit Student\n2. Migrate Student\n3. Display\n4. Exit");
            int ch = sc.nextInt();

            switch(ch) {
                case 1:
                    Student s = new Student();
                    s.getData(sc);
                    list.add(s);
                    break;

                case 2:
                    System.out.print("Enter Regd No to remove: ");
                    String reg = sc.next();
                    list.removeIf(st -> st.regdNo.equals(reg));
                    System.out.println("Student Migrated");
                    break;

                case 3:
                    for(Student st : list)
                        st.printData();
                    break;

                case 4:
                    return;
            }
        }
    }
}