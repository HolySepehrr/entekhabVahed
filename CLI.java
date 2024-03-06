import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
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
                                            System.out.println("0.back");


                                            String input5 = sc.nextLine();
                                            if (input5.equals("0")) {
                                                continue d;
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
                                                            boolean a1 = false, a2 = false;
                                                            int d = student1.getVahed() + course.get(i).code;
                                                            if (d <= 20) {
                                                                a1 = true;
                                                            }
                                                            int e = student1.getGeneralvahed() + course.get(i).code;
                                                            if (course.get(i).Type.equals("Professional") || e <= 5) {
                                                                a2 = true;
                                                            }
                                                            if (a1 && a2) {
                                                                ArrayList<Course> f = student1.courses;
                                                                f.add(course.get(i));
                                                                student1.setCourses(f);
                                                                student1.setVahed(d);
                                                                if (course.get(i).Type.equals("Professional")) {
                                                                    student1.setGeneralvahed(e);
                                                                }
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
                                                            int f = student1.getVahed() - student1.courses.get(i).vahed;
                                                            student1.setVahed(f);
                                                            f = student1.courses.get(i).vahed;
                                                            if (student1.courses.get(i).Type.equals("General")) {
                                                                f = student1.getGeneralvahed() - f;
                                                                student1.setGeneralvahed(f);
                                                            }
                                                            student1.courses.remove(i);
                                                            System.out.println("done!");
                                                            continue e;


                                                        }
                                                    }

                                                }

                                            } else {
                                                System.out.println("try again");
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
                        System.out.println("try again");
                    }
                }


            } else if (input1.equals("2")) {
                //nazadam
            } else {
                System.out.println("try again");
            }
        }
    }
}

