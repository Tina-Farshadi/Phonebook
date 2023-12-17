public class Person {
    private String name;
    private String phone;
    static int identifier = 1;
    private final int id;
    private boolean isHidden;


    public Person(String name, String phone) {

        try {
            if (phone.length() == 11 && phone.charAt(0) == '0' && phone.charAt(1) == '9'){
                this.phone = phone;
            }
            else  throw new IllegalArgumentException();

        }catch (IllegalArgumentException e){
            System.out.println("The Number Should have 11 digits and starts with 09");
        }
        this.isHidden = false;
        this.name = name;
        this.id = identifier;
        identifier++;
}

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public int getId() {
        return id;
    }

    public boolean isHidden() {
        return isHidden;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        if(phone.length() == 11 && phone.charAt(0) == '0' && phone.charAt(1) == '9')
            this.phone = phone;
        else
            System.out.println("Not Correct Form");
    }

    public void setHidden() {
        this.isHidden = true;
    }

    public void setUnHidden() {
        this.isHidden = false;
    }

    @Override
    public String toString() {

        if (phone==null){
            System.out.println("Notice that You are NOT a member as your PhoneNumber doesn't have Value");
        }
        return "Name: " + name + " - Phone number: " + phone;
    }
}
