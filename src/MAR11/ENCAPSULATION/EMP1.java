package MAR11.ENCAPSULATION;

public class EMP1 {

    private int id;
    private String name;

    ///  creating constructor

    public EMP1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    ///  creating getter and setter

    public int getId() {
        return id;
    }

    /*public void setId(int id) {
        this.id = id;
    }*/

    public String getName() {
        return name;
    }

   /* public void setName(String name) {
        this.name = name;
    }*/

    ///  CASE 1==> NO ONE CAN MODIFY THE VALUE BUT ACCESS THE VALUE
    ///  ANS = >  REMOVE SETTER METHOD

}
