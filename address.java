public class address {

    private String first_name;
    private String last_name;
    private String address;
    private String city;
    private String state;
    private String email;
    private int zip;
    private int phone_no;

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public int getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(int phone_no) {
        this.phone_no = phone_no;
    }


    public static void main(String[] args) {
        address Address = new address();
        Address.setFirst_name("murtaza");
        Address.setLast_name("Ahmed");
        Address.setAddress("jammu");
        Address.setCity("jammu");
        Address.setEmail("malik2123");
        Address.setState("jammu and kashmir");
        Address.setZip(182283);
        Address.setPhone_no(567364788);


        System.out.println("the details of address book : "+ Address.getFirst_name()+""+Address.getLast_name());
        System.out.println(Address.getAddress()+""+Address.getState()+""+Address.getCity()+""+Address.getEmail());

      }
}
