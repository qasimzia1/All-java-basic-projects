/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz1;

/**
 *
 * @author Administrator
 */
abstract public class Quiz1 {
    private  String name;
   private   String email;
    private  String address;
    
    
    
    
    
//    public Quiz1(String name ,String email , String address ) {
//		this.name = name;
//                this.email = email;
//                this.address = address;
//                
//	}


	/**
	 * @return the title
	 */
//	public String getTitle() {
//		return name;
//	}
//        public String getemail(){
//		return email;
//	}
//        
//         public String getaddress(){
//		return address;
//	}


              public abstract void printinfo();
	    
    
              
              abstract class Department extends Quiz1{
                  
                  private  String dept_name;
   private   String dept_email;
    private  String dept_address;
    private  String fee_structure;
                  
                  

        public Department(String dept_name, String dept_email, String dept_address , String fee_structure ) {
            this.dept_name = name;
//                this.dept_email = email;
//                this.dept_address = address

        }   
                  
                  
    
       
    
        
        public void printinfo() {
		name="qasim";
                email="qasimziak@gmail.com";
                address="islamabad";
	}
    
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Department dpt = new Department();
        
        
        
        
    }
    
}
