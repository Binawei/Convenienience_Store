package Week_000_Task;

public abstract class People extends BaseClass{
    private String gender;
    private String Phone_number;

    public People(String name, String gender, String phone_number) {
        super(name);
        this.gender = gender;
        Phone_number = phone_number;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone_number() {
        return Phone_number;
    }

    public void setPhone_number(String phone_number) {
        Phone_number = phone_number;
    }
}
