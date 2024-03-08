import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class CLI {
    ArrayList<Student> Students;
    ArrayList<College> college;

    ArrayList<Course> course;


    public CLI() {
        HashMap<String, LocalTime[]> Set = new HashMap<>();

        General riazi1 = new General("moghadasi", "riazi1", "1403/04/03", "08:00", "11:00", 3069, 100, 4);
        riazi1.tabdil("shanbe", "08:00", "10:00");
        riazi1.tabdil("doshanbe", "08:00", "10:00");

        Professional riazi2 = new Professional("pornaki", "riazi2", "1403/04/03", "08:00", "11:00", 3070, 100, 4);
        riazi2.tabdil("shanbe", "15:00", "17:00");
        riazi2.tabdil("doshanbe", "15:00", "17:00");

        Professional bp = new Professional("tofighi", "bp", "1403/04/10", "08:00", "11:00", 2077, 30, 4);
        bp.tabdil("yekshanbe", "08:00", "10:00");
        bp.tabdil("seshanbe", "08:00", "10:00");


        ArrayList<General> MathGenerals = new ArrayList<>();
        ArrayList<Professional> MathProfessionals = new ArrayList<>();

        MathGenerals.add(riazi1);
        MathProfessionals.add(riazi2);
        MathProfessionals.add(bp);
        College Math = new College(MathGenerals, MathProfessionals, "Math");


        Professional physics2 = new Professional("ali", "physics2", "1403/04/04", "08:00", "11:00", 2022, 100, 3);
        physics2.tabdil("shanbe", "10:00", "12:00");
        physics2.tabdil("doshanbe", "10:00", "12:00");

        General physics1 = new General("pornaki", "physics1", "1403/04/04", "08:00", "11:00", 2021, 100, 3);
        physics1.tabdil("shanbe", "10:00", "12:00");
        physics1.tabdil("doshanbe", "10:00", "12:00");

        Professional azphysics2 = new Professional("kianoosh", "azphysics2", "1403/04/11", "08:00", "11:00", 1001, 40, 1);
        azphysics2.tabdil("yekshanbe", "12:00", "14:00");
        azphysics2.tabdil("seshanbe", "12:00", "14:00");


        ArrayList<General> PhysicsGenerals = new ArrayList<>();
        ArrayList<Professional> PhysicsProfessionals = new ArrayList<>();

        PhysicsGenerals.add(physics1);
        PhysicsProfessionals.add(physics2);
        PhysicsProfessionals.add(azphysics2);
        College Physics = new College(PhysicsGenerals, PhysicsProfessionals, "Physics");


        General chemistry1 = new General("jesse", "chemistry1", "1403/04/05", "08:00", "11:00", 4001, 100, 3);
        chemistry1.tabdil("shanbe", "08:00", "10:00");
        chemistry1.tabdil("doshanbe", "08:00", "10:00");

        Professional chemistry2 = new Professional("Heisenberg", "chemistry2", "1403/04/05", "08:00", "11:00", 4002, 30, 3);
        chemistry2.tabdil("shanbe", "08:00", "10:00");
        chemistry2.tabdil("doshanbe", "08:00", "10:00");

        Professional masaleh = new Professional("bana", "masaleh", "1403/04/12", "08:00", "11:00", 4235, 30, 3);
        masaleh.tabdil("yekshanbe", "17:00", "18:00");
        masaleh.tabdil("seshanbe", "17:00", "18:00");


        ArrayList<General> ChemistryGenerals = new ArrayList<>();
        ArrayList<Professional> ChemistryProfessionals = new ArrayList<>();

        ChemistryGenerals.add(chemistry1);
        ChemistryProfessionals.add(chemistry2);
        ChemistryProfessionals.add(masaleh);
        College Chemistry = new College(ChemistryGenerals, ChemistryProfessionals, "Chemistry");


        General zaban1 = new General("ostad arian", "zaban1", "1403/04/15", "15:00", "17:00", 9896, 40, 3);
        zaban1.tabdil("shanbe", "17:00", "18:30");
        zaban1.tabdil("doshanbe", "17:00", "18:30");

        Professional zaban2 = new Professional("iraj maleki", "zaban2", "1403/04/15", "15:00", "17:00", 9897, 40, 3);
        zaban2.tabdil("shanbe", "17:00", "18:30");
        zaban2.tabdil("doshanbe", "17:00", "18:30");

        Professional adabiat2 = new Professional("kamali", "adabiat1", "1403/04/15", "15:00", "17:00", 9856, 40, 3);
        adabiat2.tabdil("yekshanbe", "12:00", "14:00");
        adabiat2.tabdil("seshanbe", "12:00", "14:00");


        ArrayList<General> ZabanhaGenerals = new ArrayList<>();
        ArrayList<Professional> ZabanhaProfessionals = new ArrayList<>();

        ZabanhaGenerals.add(zaban1);
        ZabanhaProfessionals.add(zaban2);
        ZabanhaProfessionals.add(adabiat2);
        College Zabanha = new College(ZabanhaGenerals, ZabanhaProfessionals, "Zabanha");


        Students = new ArrayList<>();
        college = new ArrayList<>();
        course = new ArrayList<>();

        college.add(Math);
        college.add(Physics);
        college.add(Chemistry);
        college.add(Zabanha);

        course.add(zaban1);
        course.add(zaban2);
        course.add(adabiat2);

        course.add(riazi1);
        course.add(riazi2);
        course.add(bp);

        course.add(physics2);
        course.add(physics1);
        course.add(azphysics2);

        course.add(chemistry1);
        course.add(chemistry2);
        course.add(masaleh);
    }

    public void Start() {
        Scanner sc = new Scanner(System.in);
        a:
        while (true) {
            System.out.println("1.student");
            System.out.println("2.admin");
            String input1 = sc.nextLine();
            if (input1.equals("1")) {
                boolean a = false, b = false;
                String input2 = "";
                b:
                while (true) {
                    if (!a) {
                        System.out.println("1.login");
                        System.out.println("2.sign up");
                        System.out.println("0.back");
                        input2 = sc.nextLine();
                    }
                    if (input2.equals("1") || a) {
                        a = false;
                        c:
                        while (true) {
                            System.out.println("sign up:");
                            System.out.println("Enter your username");
                            System.out.println("0.back");
                            String input3 = sc.nextLine();

                            if (input3.equals("0")) {
                                continue b;
                            }
                            Student student1 = new Student(null, null);
                            for (Student student : Students) {
                                if (student.getUsername().equals(input3)) {
                                    student1 = student;
                                    b = true;
                                }
                            }
                            if (!b) {
                                System.out.println("your username is not found");
                                continue c;
                            } else {
                                d:
                                while (true) {
                                    System.out.println("your username is\"" + input3 + "\"");
                                    System.out.println("Enter your password");
                                    System.out.println("0.back");
                                    String input4 = sc.nextLine();
                                    if (input4.equals("0")) {
                                        continue c;
                                    }

                                    if (student1.getPassword().equals(input4)) {
                                        e:
                                        while (true) {

                                            System.out.println("1.list of courses");
                                            System.out.println("2.my courses");
                                            System.out.println("3.Add course");
                                            System.out.println("4.Delete course");
                                            System.out.println("0.exit");


                                            String input5 = sc.nextLine();
                                            if (input5.equals("0")) {
                                                continue a;
                                            }


                                            if (input5.equals("1")) {
                                                for (int i = 0; i < college.size(); i++) {
                                                    College college1 = college.get(i);
                                                    System.out.println("Faculty of " + college1.getName() + ":");
                                                    college1.Tostring();
                                                }
                                            } else if (input5.equals("2")) {
                                                for (int i = 0; i < student1.courses.size(); i++) {
                                                    Course course1 = student1.courses.get(i);
                                                    course1.Tostring();
                                                }
                                            } else if (input5.equals("3")) {
                                                while (true) {
                                                    System.out.println("Enter the lesson code");
                                                    System.out.println("0.back");
                                                    String input6 = sc.nextLine();

                                                    if (input6.equals("0")) {
                                                        continue e;
                                                    }
                                                    for (int i = 0; i < course.size(); i++) {
                                                        if (input6.equals(Integer.toString(course.get(i).code))) {
                                                            Course course1 = course.get(i);
                                                            boolean a1 = false, a2 = false, a3 = false;
                                                            int d = student1.getVahed() + course.get(i).vahed;
                                                            if (d <= 20) {
                                                                a1 = true;
                                                            } else {
                                                                System.out.println("Units cannot exceed 20");
                                                            }
                                                            int e = student1.getGeneralvahed() + course.get(i).vahed;
                                                            if (course.get(i).Type.equals("Professional") || e <= 5) {
                                                                a2 = true;
                                                            } else {
                                                                System.out.println("General units cannot exceed 5");
                                                            }
                                                            if (course.get(i).tedaddaaneshjoo < course.get(i).zarfiat) {
                                                                a3 = true;
                                                            } else {
                                                                System.out.println("No capacity!");
                                                            }
                                                            for (int j = 0; j < student1.courses.size(); j++) {
                                                                if (input6.equals(Integer.toString(student1.courses.get(j).code))) {
                                                                    System.out.println("Course has already been taken");
                                                                    continue e;
                                                                }
                                                            }

                                                            for (int j = 0; j < student1.courses.size(); j++) {
                                                                for (String Day : student1.courses.get(j).time.keySet()) {
                                                                    for (String compDay : course1.time.keySet()) {
                                                                        if (Day.equals(compDay)) {
                                                                            if ((student1.courses.get(j).ToStringTime(Day, 0) <= course1.ToStringTime(compDay, 1) &&
                                                                                    student1.courses.get(j).ToStringTime(Day, 0) >= course1.ToStringTime(compDay, 0)) ||
                                                                                    (student1.courses.get(j).ToStringTime(Day, 1) >= course1.ToStringTime(compDay, 0) &&
                                                                                            student1.courses.get(j).ToStringTime(Day, 0) <= course1.ToStringTime(compDay, 1))) {
                                                                                System.out.println("ridi kaka, tadakhol dare");
                                                                                System.out.println();
                                                                                continue e;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }


                                                            if (a1 && a2 && a3) {
                                                                ArrayList<Course> f = student1.courses;
                                                                f.add(course.get(i));
                                                                student1.setCourses(f);
                                                                student1.setVahed(d);
                                                                if (course.get(i).Type.equals("General")) {
                                                                    student1.setGeneralvahed(e);
                                                                }
                                                                int r = course.get(i).getTedaddaaneshjoo() + 1;
                                                                course.get(i).setTedaddaaneshjoo(r);
                                                                course.get(i).getCoursesStudent().add(student1);
                                                                System.out.println("Course taken successfully!");
                                                                continue e;
                                                            } else {
                                                                System.out.println("you can't take this course!");
                                                                continue e;
                                                            }

                                                        }
                                                    }
                                                    System.out.println("code is not correct!");

                                                }
                                            } else if (input5.equals("4")) {
                                                while (true) {
                                                    System.out.println("Enter the lesson code");
                                                    System.out.println("0.back");
                                                    String input6 = sc.nextLine();
                                                    if (input6.equals("0")) {
                                                        continue e;
                                                    }
                                                    for (int i = 0; i < student1.courses.size(); i++) {
                                                        if (input6.equals(Integer.toString(student1.courses.get(i).code))) {
                                                            student1.setVahed(student1.getVahed() - student1.courses.get(i).vahed);
                                                            Course course1 = course.get(student1.courses.get(i).code);
                                                            if (student1.courses.get(i).Type.equals("General")) {
                                                                student1.setGeneralvahed(student1.getGeneralvahed()-student1.courses.get(i).vahed);
                                                            }
                                                            student1.courses.remove(i);
                                                            course1.setTedaddaaneshjoo(course1.getTedaddaaneshjoo() - 1);
                                                            course1.coursesStudent.remove(student1);
                                                            System.out.println("done!");
                                                            continue e;


                                                        }
                                                    }
                                                    System.out.println("code ia nor correct");

                                                }

                                            } else {
                                                System.out.println("try again!");
                                            }
                                        }


                                    } else {
                                        System.out.println("password is wrong");
                                        continue d;
                                    }
                                }
                            }
                        }

                    } else if (input2.equals("2")) {
                        c:
                        while (true) {
                            System.out.println("Enter your username");
                            System.out.println("0.back");
                            String input3 = sc.nextLine();

                            if (input3.equals("0")) {
                                continue b;
                            }

                            for (Student student : Students) {
                                if (student.getUsername().equals(input3)) {
                                    System.out.println("username not available");
                                    continue c;
                                }
                            }
                            System.out.println("Enter your password");
                            System.out.println("0.back");
                            String input4 = sc.nextLine();

                            if (input4.equals("0")) {
                                continue b;
                            }
                            Student student = new Student(input3, input4);
                            Students.add(student);
                            a = true;
                            continue b;
                        }


                    } else if (input2.equals("0")) {
                        continue a;
                    } else {
                        System.out.println("try again!");
                    }
                }


            } else if (input1.equals("2")) {
                while (true) {
                    System.out.println("Enter your password");
                    System.out.println("0.back");
                    String input2 = sc.nextLine();

                    if (input2.equals("0")) {
                        continue a;
                    }
                    if (input2.equals("Ap khare")) {

                        b:
                        while (true) {
                            System.out.println("1.add Course");
                            System.out.println("2.see courses list");
                            System.out.println("0.exit");
                            String input3 = sc.nextLine();
                            if (input3.equals("")) {
                                input3 = sc.nextLine();
                            }
                            if (input3.equals("0")) {
                                continue a;
                            } else if (input3.equals("1")) {
                                c:
                                while (true) {
                                    System.out.println("Select a Department");
                                    System.out.println("1.Math");
                                    System.out.println("2.Physics");
                                    System.out.println("3.Chemistry");
                                    System.out.println("4.Zabanha");
                                    System.out.println("0.back");
                                    String input4 = sc.nextLine();
                                    if (input4.equals("0")) {
                                        continue b;
                                    }
                                    for (int i = 1; i < 5; i++) {
                                        if (input4.equals(i + "")) {
                                            College college1 = college.get(i - 1);
                                            d:
                                            while (true) {
                                                System.out.println("Enter the teacher's name");
                                                System.out.println("1.back to first menu");
                                                System.out.println("0.back");
                                                String ostad = sc.nextLine();
                                                if (ostad.equals("0")) {
                                                    continue c;
                                                }
                                                if (ostad.equals("1")) {
                                                    continue b;
                                                }
                                                e:
                                                while (true) {
                                                    System.out.println("Enter the course's name");
                                                    System.out.println("1.back to first menu");
                                                    System.out.println("0.back");
                                                    String dars = sc.nextLine();
                                                    if (dars.equals("0")) {
                                                        continue d;
                                                    }
                                                    if (dars.equals("1")) {
                                                        continue b;
                                                    }
                                                    f:
                                                    while (true) {
                                                        System.out.println("Enter the exam data. Example: \"1403/04/05\"");
                                                        System.out.println("1.back to first menu");
                                                        System.out.println("0.back");
                                                        String tarikh = sc.nextLine();
                                                        if (tarikh.equals("0")) {
                                                            continue e;
                                                        }
                                                        if (tarikh.equals("1")) {
                                                            continue b;
                                                        }
                                                        g:
                                                        while (true) {
                                                            System.out.println("Enter the exam start time. Example: \"08:09\"");
                                                            System.out.println("1.back to first menu");
                                                            System.out.println("0.back");
                                                            String shoro = sc.nextLine();
                                                            if (shoro.equals("0")) {
                                                                continue f;
                                                            }
                                                            if (shoro.equals("1")) {
                                                                continue b;
                                                            }
                                                            h:
                                                            while (true) {
                                                                System.out.println("Enter the exam end time. Example: \"09:05\"");
                                                                System.out.println("1.back to first menu");
                                                                System.out.println("0.back");
                                                                String tamom = sc.nextLine();
                                                                if (tamom.equals("0")) {
                                                                    continue g;
                                                                }
                                                                if (tamom.equals("1")) {
                                                                    continue b;
                                                                }
                                                                i:
                                                                while (true) {
                                                                    System.out.println("Enter the Course capacity");
                                                                    System.out.println("1.back to first menu");
                                                                    System.out.println("0.back");
                                                                    int zarfiat = 10;
                                                                    try {
                                                                        zarfiat = sc.nextInt();
                                                                    } catch (Exception e) {
                                                                        System.out.println("Enter a number");
                                                                    }
                                                                    if (zarfiat == 0) {
                                                                        continue h;
                                                                    }
                                                                    if (zarfiat == 1) {
                                                                        continue b;
                                                                    }
                                                                    j:
                                                                    while (true) {
                                                                        System.out.println("Enter the Course units");
                                                                        System.out.println("1.back to first menu");
                                                                        System.out.println("0.back");
                                                                        int vahed = 10;
                                                                        try {
                                                                            vahed = sc.nextInt();
                                                                        } catch (Exception e) {
                                                                            System.out.println("Enter a number");
                                                                        }
                                                                        if (vahed == 0) {
                                                                            continue i;
                                                                        }
                                                                        if (vahed == 1) {
                                                                            continue b;
                                                                        }
                                                                        k:
                                                                        while (true) {
                                                                            Random rnd = new Random();
                                                                            int code = rnd.nextInt(9000) + 1000;
                                                                            for (Course course1 : course) {
                                                                                if (course1.code == code) {
                                                                                    continue k;
                                                                                }
                                                                            }
                                                                            l:
                                                                            while (true) {


                                                                                m:
                                                                                while (true) {
                                                                                    System.out.println("How many days a week is the class held?");
                                                                                    System.out.println("1.one day");
                                                                                    System.out.println("2.two days");
                                                                                    System.out.println("3.back to first menu");
                                                                                    System.out.println("0.back");
                                                                                    int adad = 10;
                                                                                    try {
                                                                                        adad = sc.nextInt();
                                                                                    } catch (Exception e) {
                                                                                        System.out.println("Enter a number");
                                                                                        continue m;
                                                                                    }
                                                                                    if (adad == 0) {
                                                                                        continue l;
                                                                                    }
                                                                                    if (adad == 3) {
                                                                                        continue b;
                                                                                    }
                                                                                    if (adad > 3 || adad < 1) {
                                                                                        System.out.println("Enter a right number");
                                                                                        continue m;
                                                                                    }
                                                                                    if (adad == 1) {

                                                                                        n:
                                                                                        while (true) {
                                                                                            System.out.println("What day will the class be held? (shanbe , yekshanbe , doshanbe , seshanbe, chaharshanbe)");
                                                                                            System.out.println("1.back to first menu");
                                                                                            System.out.println("0.back");
                                                                                            String roz = sc.next();

                                                                                            if (roz.equals("0")) {
                                                                                                continue m;
                                                                                            } else if (roz.equals("1")) {
                                                                                                continue b;
                                                                                            }
                                                                                            o:
                                                                                            while (true) {
                                                                                                System.out.println("Enter the class start time. example: \"08:30\"");
                                                                                                System.out.println("1.back to first menu");
                                                                                                System.out.println("0.back");
                                                                                                String start = sc.nextLine();
                                                                                                if (start.equals("")){
                                                                                                    start=sc.nextLine();
                                                                                                }
                                                                                                if (start.equals("0")) {
                                                                                                    continue n;
                                                                                                }
                                                                                                if (start.equals("1")) {
                                                                                                    continue b;
                                                                                                }
                                                                                                p:
                                                                                                while (true) {
                                                                                                    System.out.println("Enter the class end time. example: \"10:30\"");
                                                                                                    System.out.println("1.back to first menu");
                                                                                                    System.out.println("0.back");
                                                                                                    String end = sc.nextLine();
                                                                                                    if (end.equals("")){
                                                                                                        end=sc.nextLine();
                                                                                                    }
                                                                                                    if (end.equals("0")) {
                                                                                                        continue o;
                                                                                                    }
                                                                                                    if (end.equals("1")) {
                                                                                                        continue b;
                                                                                                    }

                                                                                                    while (true) {
                                                                                                        System.out.println("Select Course type");
                                                                                                        System.out.println("1.GeneraL");
                                                                                                        System.out.println("2.Professional");
                                                                                                        System.out.println("3.back to first menu");
                                                                                                        System.out.println("0.back");
                                                                                                        String type = sc.nextLine();
                                                                                                        if (type.equals("0")) {
                                                                                                            continue p;
                                                                                                        }
                                                                                                        if (type.equals("3")) {
                                                                                                            continue b;
                                                                                                        }
                                                                                                        if (type.equals("1")) {
                                                                                                            General name = new General(ostad, dars, ostad, shoro, tamom, code, zarfiat, vahed);
                                                                                                            name.tabdil(roz, start, end);
                                                                                                            course.add(name);
                                                                                                            college1.generals.add(name);
                                                                                                            System.out.println("Add course completed");
                                                                                                            System.out.println("Course's code is :\"" + code + "\"");

                                                                                                            continue b;
                                                                                                        } else if (type.equals("2")) {
                                                                                                            Professional name = new Professional(ostad, dars, ostad, shoro, tamom, code, zarfiat, vahed);
                                                                                                            name.tabdil(roz, start, end);
                                                                                                            course.add(name);
                                                                                                            college1.professionals.add(name);
                                                                                                            System.out.println("Add course completed");
                                                                                                            System.out.println("Course's code is :\"" + code + "\"");
                                                                                                            continue b;
                                                                                                        } else {
                                                                                                            System.out.println("Invalid Command");
                                                                                                        }
                                                                                                    }
                                                                                                }

                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    if (adad == 2) {
                                                                                        n:
                                                                                        while (true) {
                                                                                            System.out.println("Enter the first day (shanbe , yekshanbe , doshanbe , seshanbe, chaharshanbe)");
                                                                                            System.out.println("1.back to first menu");
                                                                                            System.out.println("0.back");
                                                                                            String roz = sc.nextLine();
                                                                                            if (roz.equals("0")) {
                                                                                                continue m;
                                                                                            }
                                                                                            if (roz.equals("1")) {
                                                                                                continue b;
                                                                                            }
                                                                                            o:
                                                                                            while (true) {
                                                                                                System.out.println("Enter the usual " + roz + "'s class start time. example: \"08:30\"");
                                                                                                System.out.println("1.back to first menu");
                                                                                                System.out.println("0.back");
                                                                                                String start = sc.nextLine();
                                                                                                if (start.equals("")){
                                                                                                    start=sc.nextLine();
                                                                                                }
                                                                                                if (start.equals("0")) {
                                                                                                    continue n;
                                                                                                }
                                                                                                if (start.equals("1")) {
                                                                                                    continue b;
                                                                                                }
                                                                                                p:
                                                                                                while (true) {
                                                                                                    System.out.println("Enter the usual " + roz + "'s class end time. example: \"10:30\"");
                                                                                                    System.out.println("1.back to first menu");
                                                                                                    System.out.println("0.back");
                                                                                                    String end = sc.nextLine();
                                                                                                    if (end.equals("")){
                                                                                                        end=sc.nextLine();
                                                                                                    }
                                                                                                    if (end.equals("0")) {
                                                                                                        continue o;
                                                                                                    }
                                                                                                    if (end.equals("1")) {
                                                                                                        continue b;
                                                                                                    }

                                                                                                    q:
                                                                                                    while (true) {
                                                                                                        System.out.println("Enter the second day (shanbe , yekshanbe , doshanbe , seshanbe, chaharshanbe)");
                                                                                                        System.out.println("1.back to first menu");
                                                                                                        System.out.println("0.back");
                                                                                                        String roz1 = sc.next();
                                                                                                        if (roz1.equals("0")) {
                                                                                                            continue p;
                                                                                                        }
                                                                                                        if (roz1.equals("1")) {
                                                                                                            continue b;
                                                                                                        }
                                                                                                        r:
                                                                                                        while (true) {
                                                                                                            System.out.println("Enter the usual " + roz1 + "'s class start time. example: \"08:30\"");
                                                                                                            System.out.println("1.back to first menu");
                                                                                                            System.out.println("0.back");
                                                                                                            String start1 = sc.nextLine();
                                                                                                            if (start1.equals("0")) {
                                                                                                                continue q;
                                                                                                            }
                                                                                                            if (start1.equals("1")) {
                                                                                                                continue b;
                                                                                                            }
                                                                                                            s:
                                                                                                            while (true) {
                                                                                                                System.out.println("Enter the usual " + roz1 + "'s class end time. example: \"10:30\"");
                                                                                                                System.out.println("1.back to first menu");
                                                                                                                System.out.println("0.back");
                                                                                                                String end1 = sc.nextLine();
                                                                                                                if (end1.equals("0")) {
                                                                                                                    continue r;
                                                                                                                }
                                                                                                                if (end1.equals("1")) {
                                                                                                                    continue b;
                                                                                                                }
                                                                                                                while (true) {
                                                                                                                    System.out.println("Select Course type");
                                                                                                                    System.out.println("1.GeneraL");
                                                                                                                    System.out.println("2.Professional");
                                                                                                                    System.out.println("3.back to first menu");
                                                                                                                    System.out.println("0.back");
                                                                                                                    String type = sc.nextLine();
                                                                                                                    if (type.equals("0")) {
                                                                                                                        continue s;
                                                                                                                    }
                                                                                                                    if (type.equals("3")) {
                                                                                                                        continue b;
                                                                                                                    }
                                                                                                                    if (type.equals("1")) {
                                                                                                                        General name = new General(ostad, dars, ostad, shoro, tamom, code, zarfiat, vahed);
                                                                                                                        name.tabdil(roz, start, end);
                                                                                                                        name.tabdil(roz1, start1, end1);
                                                                                                                        course.add(name);
                                                                                                                        college1.generals.add(name);

                                                                                                                        System.out.println("Add course complited");
                                                                                                                        System.out.println("Course's code is :\"" + code + "\"");
                                                                                                                        continue b;

                                                                                                                    } else if (type.equals("2")) {
                                                                                                                        Professional name = new Professional(ostad, dars, ostad, shoro, tamom, code, zarfiat, vahed);
                                                                                                                        name.tabdil(roz, start, end);
                                                                                                                        name.tabdil(roz1, start1, end1);
                                                                                                                        course.add(name);
                                                                                                                        college1.professionals.add(name);

                                                                                                                        System.out.println("Add course completed");
                                                                                                                        System.out.println("Course's code is :\"" + code + "\"");
                                                                                                                        continue b;
                                                                                                                    } else {
                                                                                                                        System.out.println("Invalid Command");
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (input3.equals("2")) {
                                c:
                                while (true) {
                                    System.out.println("Select a Department");
                                    System.out.println("1.Math");
                                    System.out.println("2.Physics");
                                    System.out.println("3.Chemistry");
                                    System.out.println("4.Zabanha");
                                    System.out.println("0.back");
                                    String input4 = sc.nextLine();
                                    if (input4.equals("0")) {
                                        continue b;
                                    }
                                    for (int i = 1; i < 5; i++) {
                                        if (input4.equals(i + "")) {
                                            College college1 = college.get(i - 1);
                                            college1.Tostring();
                                            d:
                                            while (true) {
                                                System.out.println();
                                                System.out.println();
                                                System.out.println();
                                                System.out.println("2.Add capacity");
                                                System.out.println("3.Remove capacity");
                                                System.out.println("4.Add a student to a course");
                                                System.out.println("5.Remove the student from the course");
                                                System.out.println("1.back to first menu");
                                                System.out.println("0.back");
                                                String input5 = sc.nextLine();
                                                if (input5.equals("0")) {
                                                    continue c;
                                                }
                                                if (input5.equals("1")) {
                                                    continue b;
                                                }
                                                if (input5.equals("2") || input5.equals("3") || input5.equals("4") || input5.equals("5")) {
                                                    e:
                                                    while (true) {
                                                        System.out.println("Enter the lesson code");
                                                        System.out.println("1.back to first menu");
                                                        System.out.println("0.back");
                                                        String input6 = sc.next();
                                                        if (input6.equals("0")) {
                                                            continue d;
                                                        }
                                                        if (input6.equals("1")) {
                                                            continue b;
                                                        }
                                                        int fp = 0;
                                                        for (int j = 0; j < course.size(); j++) {
                                                            if (input6.equals(Integer.toString(course.get(j).code))) {
                                                                Course course1 = course.get(j);
                                                                fp = -1;


                                                                if (input5.equals("2")) {
                                                                    f:
                                                                    while (true) {
                                                                        System.out.println("Course lesson capacity: \"" + course1.zarfiat + "\"");
                                                                        System.out.println("How much capacity do yo add?");
                                                                        System.out.println("-1.back to first menu");
                                                                        System.out.println("0.back");
                                                                        int input7 = 10;

                                                                        try {
                                                                            input7 = sc.nextInt();
                                                                        } catch (Exception e) {
                                                                            System.out.println("Enter the number");
                                                                            System.out.println();
                                                                            continue f;
                                                                        }
                                                                        if (input7 == 0) {
                                                                            continue e;
                                                                        }
                                                                        if (input7 == -1) {
                                                                            continue b;
                                                                        }
                                                                        System.out.println();
                                                                        System.out.println("Capacity added");
                                                                        course1.setZarfiat(course1.getZarfiat() + input7);
                                                                        System.out.println("Course lesson new capacity: \"" + course1.zarfiat + "\"");
                                                                        System.out.println();
                                                                        continue b;

                                                                    }
                                                                } else if (input5.equals("5")) {
                                                                    f:
                                                                    while (true) {
                                                                        System.out.println();
                                                                        course1.Students();
                                                                        System.out.println();
                                                                        System.out.println();
                                                                        System.out.println("Enter the student's username");
                                                                        System.out.println("1.back to first menu");
                                                                        System.out.println("0.back");
                                                                        String username = sc.nextLine();
                                                                        if (username.equals("")){
                                                                            username=sc.nextLine();
                                                                        }
                                                                        if (username.equals("0")) {
                                                                            continue e;
                                                                        }
                                                                        if (username.equals("1")) {
                                                                            continue b;
                                                                        }

                                                                        for (int k = 0; k < course1.coursesStudent.size(); k++) {
                                                                            if (course1.coursesStudent.get(k).Username.equals(username)) {
                                                                                Student student = course1.coursesStudent.get(k);
                                                                                course1.coursesStudent.remove(student);
                                                                                student.courses.remove(course1);
                                                                                int f = student.getVahed() - course1.vahed;
                                                                                student.setVahed(f);
                                                                                f = course1.vahed;
                                                                                if (course1.Type.equals("General")) {
                                                                                    f = student.getGeneralvahed() - f;
                                                                                    student.setGeneralvahed(f);
                                                                                }
                                                                                course1.setTedaddaaneshjoo(course1.getTedaddaaneshjoo() - 1);
                                                                                System.out.println("done!");
                                                                                System.out.println();
                                                                                continue b;


                                                                            }
                                                                        }
                                                                        System.out.println("username id not found!");
                                                                        continue f;

                                                                    }
                                                                } else if (input5.equals("4")) {
                                                                    f:
                                                                    while (true) {
                                                                        System.out.println();
                                                                        course1.Students();
                                                                        System.out.println();
                                                                        System.out.println("Enter the student's username");
                                                                        System.out.println("1.back to first menu");
                                                                        System.out.println("0.back");
                                                                        String username = sc.nextLine();
                                                                        if (username.equals("")){
                                                                            username=sc.nextLine();
                                                                        }
                                                                        if (username.equals("0")) {
                                                                            continue e;
                                                                        }
                                                                        if (username.equals("1")) {
                                                                            continue b;
                                                                        }

                                                                        boolean b = false;
                                                                        Student student1 = new Student(null, null);
                                                                        for (Student student : Students) {
                                                                            if (student.getUsername().equals(username)) {
                                                                                student1 = student;
                                                                                b = true;
                                                                                student1.courses.add(course1);
                                                                                student1.setVahed(student1.getVahed() + course1.vahed);
                                                                                if (course.get(i).Type.equals("General")) {
                                                                                    student1.setGeneralvahed(student1.getGeneralvahed() + course1.vahed);
                                                                                }
                                                                                course1.setTedaddaaneshjoo(course1.getTedaddaaneshjoo() + 1);
                                                                                course1.coursesStudent.add(student1);
                                                                                System.out.println("done!");
                                                                                System.out.println();
                                                                                continue b;
                                                                            }
                                                                        }
                                                                        if (!b) {
                                                                            System.out.println("Username is not found!");
                                                                            System.out.println();
                                                                            continue f;
                                                                        }


                                                                    }
                                                                } else {
                                                                    f:
                                                                    while (true) {
                                                                        System.out.println("Select a Department");
                                                                        System.out.println("1.Math");
                                                                        System.out.println("2.Physics");
                                                                        System.out.println("3.Chemistry");
                                                                        System.out.println("4.Zabanha");
                                                                        System.out.println("-1.back to first menu");
                                                                        System.out.println("0.back");
                                                                        String input7 = sc.nextLine();
                                                                        if (input7.equals("")){
                                                                            input7 = sc.nextLine();
                                                                        }
                                                                        if (input7.equals("-1")) {
                                                                            continue b;
                                                                        }
                                                                        if (input7.equals("0")) {
                                                                            continue e;
                                                                        }
                                                                        if (input7.equals("2") || input7.equals("3") || input7.equals("4") || input7.equals("1")) {
                                                                            College college2 = college.get(Integer.parseInt(input7)-1);
                                                                            g:
                                                                            while (true) {
                                                                                System.out.println("Select Course type");
                                                                                System.out.println("1.GeneraL");
                                                                                System.out.println("2.Professional");
                                                                                System.out.println("3.back to first menu");
                                                                                System.out.println("0.back");
                                                                                String type = sc.nextLine();
                                                                                if (type.equals("0")) {
                                                                                    continue f;
                                                                                }
                                                                                if (type.equals("3")) {
                                                                                    continue b;
                                                                                }
                                                                                if (type.equals("1") || type.equals("2")){
                                                                                    course1.delete(course1,Integer.parseInt(type),college2);
                                                                                    System.out.println();
                                                                                    continue b;
                                                                                }
                                                                                else {
                                                                                    System.out.println("Invalid input");
                                                                                    continue g;


                                                                                }


                                                                            }
                                                                        }
                                                                        System.out.println("Invalid input!");
                                                                        System.out.println();

                                                                    }


                                                                }


                                                            } else {
                                                                fp++;
                                                            }
                                                            if (fp == course.size()) {
                                                                System.out.println("code is not correct!");
                                                                continue e;
                                                            }
                                                        }

                                                    }

                                                } else {
                                                    System.out.println("Invalid input");
                                                    continue d;
                                                }
                                            }
                                        }
                                        System.out.println("Invalid input");
                                    }

                                }
                            } else {
                                System.out.println("Invalid input");

                            }
                        }

                    } else {
                        System.out.println("password is wrong");
                    }
                }
            } else {
                System.out.println("try again");
            }
        }
    }
}

