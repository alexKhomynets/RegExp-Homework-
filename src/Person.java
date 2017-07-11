/**
 * Created by 1 on 07.07.2017.
 */
public class Person {
    private String name;
    private String address;
    private String email;

    Person(String name, String address , String email){
        this.name = name;
        this.address = address;
        this.email = email;
    }
    Person(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAdress(String adress) {
        this.address = adress;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }
}
