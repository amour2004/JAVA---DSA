class student {
    int rollno;
    String Name;

    static String schoolname;

    void setname(String Name) {
        this.Name = Name;
    }

    String getname() {
        return this.Name;
    }
}


public class staticKeyword {
    public static void main(String args[]) {

        student s1 = new student();
        s1.schoolname = "Rakvb";

        student s2 = new student();

        System.out.println(s2.schoolname);
    }
}

