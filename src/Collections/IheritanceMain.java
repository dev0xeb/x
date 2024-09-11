package Collections;

public class IheritanceMain extends Inheritance {
    private String Id;

    public String getId() {
        return Id;
    }
    public void setId(String id) {
        Id = id;
    }
}

class IheritanceExample {
    public static void main(String[] args) {
        Inheritance person1 = new Inheritance();
        person1.setName("CAN");
        person1.setAge(23);
        System.out.printf("%s %d", person1.getName(), person1.getAge());

        IheritanceMain person2 = new IheritanceMain();
        person2.setName("Pan");
        person2.setAge(23);
        person2.setId("090-30-7317");
        System.out.printf("Name: %s Age: %d Id NUmber: %s", person2.getName(), person2.getAge(), person2.getId());

    }
}

