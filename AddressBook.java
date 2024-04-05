import java.util.Scanner;
import java.util.*;

class UserData {

    private String first_name;
    private String last_name;
    private String address;
    private String city;
    private String state;
    private String zipcode;
    private String phone_number;
    private String email_id;



    public UserData(String first_name,String last_name,String address,String city,String state,String zipcode,String phone_number,String email_id){

        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.phone_number = phone_number;
        this.email_id = email_id;
    }

    public void setFirstName(String first_name){
        this.first_name = first_name;
    }
    public String getFirstName(){
        return first_name;
    }
    public void setLastName(String last_name){
        this.last_name = last_name;
    }
    public String getLastName(){
        return last_name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return address;
    }
    public void setCity(String city){
        this.city = city;
    }
    public String getCity(){
        return city;
    }
    public void setState(String state){
        this.state = state;
    }
    public String getState(){
        return state;
    }
    public void setZipcode(String zipcode){
        this.zipcode = zipcode;
    }
    public String getZipcode(){
        return zipcode;
    }
    public void setPhonenumber(String phone_number){
        this.phone_number = phone_number;
    }
    public String getPhonenumber(){
        return phone_number;
    }
    public void setEmailid(String email_id){
        this.email_id = email_id;
    }
    public String getEmailid(){
        return email_id;
    }

   @Override
   public String toString(){

        return "*** Address Book ***"+
        " \n First Name : "+first_name+
        " \n Last Name : "+last_name+
        " \n Address : "+address+
        " \n City : "+city+
        " \n State : "+state+
        " \n ZipCode : "+zipcode+
        " \n Phone Number : "+phone_number+
        " \n Email Id : "+email_id+"";
   }
//    UserData data = new UserData(first_name, last_name, address, city, state, zipcode, phone_number, email_id);
   
}

class Contact{

    ArrayList<UserData> userdata = new ArrayList<>();
    Scanner sc = new Scanner(System.in);


    public void addContacts(){

        System.out.println("Enter the First Name : ");
        String first_name = sc.next();
        System.out.println("Enter the Last Name : ");
        String last_name = sc.next();
        System.out.println("Enter the Address : ");
        String address = sc.next();
        System.out.println("Enter the City : ");
        String city = sc.next();
        System.out.println("Enter the State : ");
        String state = sc.next();
        System.out.println("Enter the Zip Code : ");
        String zipcode = sc.next();
        System.out.println("Enter the Phone Number : ");
        String phone_number = sc.next();
        System.out.println("Enter the Email Id : ");
        String email_id = sc.next();

        UserData data = new UserData(first_name, last_name, address, city, state, zipcode, phone_number, email_id);
        userdata.add(data);

    }

    public void viewContacts(){

        if(userdata.size()==0){
            System.out.println("Address Book is Empty!");
        }
        else{
            for(int i=0;i<userdata.size();i++){
                UserData data1 = userdata.get(i);
                System.out.println(data1);
            }
        }
    }


}

public class AddressBook {   

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Contact contact = new Contact();
        int n = 1;

        while (n>0) {
            System.out.println("***  Welcome To Address Book  ***");
            System.out.println(" 1.Add Contact \n 2.Update Contact \n 3.Delete Contact \n 4.View Contact  \n 5.Exit");

            switch (sc.nextInt()) { 
                case 1:
                    contact.addContacts();
                    System.out.println();
                    System.out.println("Added Successfully ");
                    System.out.println();
                    break;
            
                case 2:
                
                    break;

                case 3:

                    break;

                case 4:
                    contact.viewContacts();
                    System.out.println();
                    break;

                case 5:
                    System.exit(0);
                    break;
                default:
                    break;
            }
            

        }
        sc.close();
    }     
}