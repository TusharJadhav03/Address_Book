import java.util.*;
 class Contacts {

    String first_name;
    String last_name;
    String address;
    String city;
    String state;
    long zipcode;
    String phone_number;
    String email_id;



    public  Contacts(String first_name,String last_name,String address,String city,String state,long zipcode,String phone_number,String email_id){

        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.phone_number = phone_number;
        this.email_id = email_id;
    }

   @Override
   public String toString(){

        System.out.println("First Name :"+first_name);
        System.out.println("Last Name :"+last_name);
        System.out.println("Address : "+address);
        System.out.println("City : "+city);
        System.out.println("State : "+state);
        System.out.println("Zip code : "+zipcode);
        System.out.println("Phone Number : "+phone_number);
        System.out.println("Email Id : "+email_id);
        return "";
   }
}

public class AddressBook {

    ArrayList<Contacts> contactList;
    

    public  AddressBook(){

        contactList=new ArrayList<>();
    }


    public void addContact(String first_name,String last_name,String address,String city,String state,long zipcode,String phone_number,String email_id){
        Contacts contacts = new Contacts(first_name,last_name,address,city,state,zipcode,phone_number,email_id);
        contactList.add(contacts);
        System.out.println(contacts);
    }




    public static void main(String[] args) {
        
        AddressBook addressBook = new AddressBook();
        addressBook.addContact("Tushar", "Jadhav", "Asalfa village Ghatkopar West", "Mumbai", "Maharashtra", 400084, "8108342683", "tusharjadhav228@gmail.com");

        
    }
}