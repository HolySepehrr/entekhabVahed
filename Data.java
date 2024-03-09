import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Data {
    public void getData(ArrayList<Student> students, ArrayList<Course> courses, ArrayList<College> colleges) throws FileNotFoundException {
        File AllStudents = new File("src\\Data\\AllStudents.txt");
        File AllCourses = new File("src\\Data\\AllCourses.txt");
        File AllColleges = new File("src\\Data\\AllColleges");
        Scanner Courses = new Scanner(AllCourses);
        while (Courses.hasNext()) {
            String[] CourseData = Courses.nextLine().split("-");
            Course jadid = new Course(CourseData[0], CourseData[1], CourseData[2], CourseData[3], CourseData[4], Integer.parseInt(CourseData[5]), Integer.parseInt(CourseData[6]), Integer.parseInt(CourseData[7]), CourseData[8]);
            String[] kelasha = CourseData[9].split("@");
            for (String rooz : kelasha) {
                String[] time = rooz.split("_");
                jadid.tabdil(time[0], time[1], time[2]);
            }
            courses.add(jadid);
        }
        Scanner College = new Scanner(AllColleges);
        while (College.hasNext()) {
            String[] CollegeData = College.nextLine().split("-");
            String[] CoursesData = CollegeData[1].split("@");
            String[] ProfessionalCodes = CoursesData[0].split("_");
            ArrayList<Course> ProfessionalCourses = new ArrayList<>();
            for (String ProfessionalCoursesCode : ProfessionalCodes) {
                for (Course course : courses) {
                    if (course.code == Integer.parseInt(ProfessionalCoursesCode)) {
                        ProfessionalCourses.add(course);
                    }
                }
            }
            String[] GeneralCodes = CoursesData[1].split("_");
            ArrayList<Course> GeneralCourses = new ArrayList<>();
            for (String GeneralCoursesCode : GeneralCodes) {
                for (Course course : courses) {
                    if (course.code == Integer.parseInt(GeneralCoursesCode)) {
                        GeneralCourses.add(course);
                    }
                }
            }
            College jadid = new College(GeneralCourses, ProfessionalCourses, CollegeData[0]);
            colleges.add(jadid);
        }
        Scanner Student = new Scanner(AllStudents);
        while (Student.hasNext()) {
            String[] StudentData = Student.nextLine().split("-");
            Student jadid = new Student(StudentData[0], StudentData[1]);
            String[] Darsha = StudentData[2].split("_");
            for (String Dars : Darsha) {
                for (Course course : courses) {
                    if (Integer.parseInt(Dars)==course.getCode()) {
                        int d = jadid.getVahed() + course.vahed;
                        int e = jadid.getGeneralvahed() + course.vahed;
                        ArrayList<Course> f = jadid.courses;
                        f.add(course);
                        jadid.setCourses(f);
                        jadid.setVahed(d);
                        if (course.Type.equals("General")) {
                            jadid.setGeneralvahed(e);
                        }
                        int r = course.getTedaddaaneshjoo() + 1;
                        course.setTedaddaaneshjoo(r);
                        course.getCoursesStudent().add(jadid);
                    }
                }
            }
            students.add(jadid);
        }
    }

    public void setData(ArrayList<Student> students, ArrayList<Course> courses, ArrayList<College> colleges) throws FileNotFoundException {
        File AllStudents = new File("src\\Data\\AllStudents.txt");
        File AllCourses = new File("src\\Data\\AllCourses.txt");
        File AllColleges = new File("src\\Data\\AllColleges");
        PrintWriter Student = new PrintWriter(AllStudents);
        for (Student student : students) {
            Student.print(student.getUsername() + "-" + student.getPassword()+"-");
            for (int i = 0; i < student.getCourses().size(); i++) {
                if (i == student.getCourses().size() - 1) Student.println(student.getCourses().get(i).code+"_");
                else Student.print(student.getCourses().get(i).getCode());
            }
        }
        Student.flush();
        Student.close();
        PrintWriter Course = new PrintWriter(AllCourses);
//        String ostad, String dars, String tarikhemtahan, String Shorouemtahan, String Payanemtahan, int code, int zarfiat, int vahed, String type
        for (Course course : courses) {
            Course.print(course.ostad + "-" + course.dars + "-" + course.tarikhemtahan + "-" + course.timeemtahan[0] + "-" + course.timeemtahan[1] + "-" + course.code + "-" + course.zarfiat + "-" + course.vahed + "-" + course.getType() + "-");
            int i = 0;
            for (String rooz : course.time.keySet()) {
                if (i == course.time.size() - 1)
                    Course.println(rooz + "_" + course.time.get(rooz)[0] + "_" + course.time.get(rooz)[1]);
                else Course.print(rooz + "_" + course.time.get(rooz)[0] + "_" + course.time.get(rooz)[1] + "@");
                i++;
            }
        }
        Course.flush();
        Course.close();
        PrintWriter College = new PrintWriter(AllColleges);
//        ArrayList<General> general, ArrayList<Professional> professionals , String name
        for (College college : colleges) {
            College.print(college.name + "-");
            for (int i = 0; i < college.professionals.size(); i++) {
                if (i == college.professionals.size() - 1) College.print(college.professionals.get(i).code + "@");
                else College.print(college.professionals.get(i).code + "_");
            }
            for (int i = 0; i < college.generals.size(); i++) {
                if (i == college.generals.size() - 1) College.println(college.generals.get(i).code + "@");
                else College.print(college.generals.get(i).code + "_");
            }
        }
        College.flush();
        College.close();
    }
}
