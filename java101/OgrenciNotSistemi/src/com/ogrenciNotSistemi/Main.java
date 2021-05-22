package com.ogrenciNotSistemi;

public class Main {
    public static void main(String[] args) {

        Course mat = new Course("Matematik", "MAT101", "MAT",10);
        Course fizik = new Course("Fizik", "FZK101", "FZK",20);
        Course kimya = new Course("Kimya", "KMY101", "KMY",15);

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayþe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("Ýnek Þaban", 4, "140144015", mat, fizik, kimya);
        s1.addBulkExamNote(50,20,40); // 45 + 16 + 34 
        s1.addBulkVerbalNote(80, 70, 60); // 8 + 14 + 9  
        s1.isPass(); // 53 + 30 + 43 => 42 false 

        Student s2 = new Student("Güdük Necmi", 4, "2211133", mat, fizik, kimya);
        s2.addBulkExamNote(100,50,40);
        s2.addBulkVerbalNote(60, 70, 80);
        s2.isPass();

        Student s3 = new Student("Hayta Ýsmail", 4, "221121312", mat, fizik, kimya);
        s3.addBulkExamNote(50,20,40);
        s3.addBulkVerbalNote(50, 50, 50);
        s3.isPass();
        
    }
}
