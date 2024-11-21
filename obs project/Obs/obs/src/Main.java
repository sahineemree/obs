public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Muhammed Baykara" , "BBG" , "+90 511 111 11 11");
        Teacher t2 = new Teacher("Yaman Akbulut" , "ALG" , "+90 522 222 22 22");
        Teacher t3 = new Teacher("Fethi Dağdelen", "FZK" , "+90 533 333 33 33");


        Course bbgc = new Course("\n Bilgisayar Bilimlerine Giriş","101","BBG");
        bbgc.addTeacher(t1);

        Course algc = new Course("Algoritma" , "101" , "ALG");
        algc.addTeacher(t2);

        Course fzkc = new Course("Fizik", "101" , "FZK");
        fzkc.addTeacher(t3);



        Student s1 = new Student("Emre" , "44" , "Gece 1A" , bbgc , algc , fzkc);
        s1.addBulkExamNote(46,70,50);
        s1.isPass();

        Student s2 = new Student("Yusuf" , "38" , "Gece 1B" , bbgc , algc , fzkc);
        s2.addBulkExamNote(54,80,50);
        s2.isPass();

        Student s3 = new Student("Umut" , "34" , "Gece 1A" , bbgc , algc , fzkc);
        s3.addBulkExamNote(53,60,85);
        s3.isPass();

    }
}