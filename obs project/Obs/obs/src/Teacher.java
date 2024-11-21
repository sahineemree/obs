import javax.xml.namespace.QName;

public class Teacher {
    String name;
    String phoneNumber;
    String branch;

    Teacher (String name , String branch , String phoneNumber){

        this.name = name;
        this.phoneNumber = phoneNumber;
        this.branch = branch;

    }
    void print (){
        System.out.println("Adı : " + this.name);
        System.out.println("Branşı : " + this.branch);
        System.out.println("Telefon Numarası : " + this.phoneNumber);

    }
}
