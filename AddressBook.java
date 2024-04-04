import java.util.*;
 class Contacts {

    String first_name;
    String last_name;
    String address;
    String city;
    String state;
    String zipcode;
    String phone_number;
    String email_id;



    public  Contacts(String first_name,String last_name,String address,String city,String state,String zipcode,String phone_number,String email_id){

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

    public  void addContacts(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name : ");
        String first_name = sc.nextLine();
        System.out.println("Enter Last Name : ");
        String last_name = sc.nextLine();
        System.out.println("Enter Address : ");
        String address = sc.nextLine();
        System.out.println("Enter City : ");
        String city = sc.nextLine();
        System.out.println("Enter State : ");
        String state = sc.nextLine();
        System.out.println("Enter Zip Code : ");
        String zipcode = sc.nextLine();
        System.out.println("Enter Phone Number : ");
        String phone_number = sc.nextLine();
        System.out.println("Enter Email Id : ");
        String email_id = sc.nextLine();
        System.out.println();
        this.addContact(first_name, last_name, address, city, state, zipcode, phone_number, email_id);
        sc.close();
    }


    public void addContact(String first_name,String last_name,String address,String city,String state,String zipcode,String phone_number,String email_id){
        Contacts contacts = new Contacts(first_name,last_name,address,city,state,zipcode,phone_number,email_id);
        contactList.add(contacts);
        System.out.println(contacts);
    }




    public static void main(String[] args) {
        
        AddressBook addressBook = new AddressBook();
        addressBook.addContacts();
        

        
    }
}