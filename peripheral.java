import java.util.*;
import java.util.ArrayList;



public class Main {
  
    
 
  
  
   public static void main(String args[]){

	   
	   MotherClass main=new MotherClass();
	   main.Menu();
   }
   }
class MotherClass{      

	
	
	
	
	public void Menu() {
		
		
		int code;
		String name,employee,type;
		Scanner sc=new Scanner(System.in);
		List<info> in=new ArrayList<info>();
		Iterator<info> per=in.iterator();
int s=6;
		
		do {
		    System.out.println("Welcome To Peripheral Management System");
			System.out.println("1. Add Record");
			System.out.println("2. View Record");
			System.out.println("3. Edit Record");
			System.out.println("4. Delete Record");
			System.out.println("5. Report Record");
			System.out.println("6. Exit");
			System.out.print("Enter Your Choice (1-6) : ");
	         s=sc.nextInt();
			
			
			switch(s) {
	
			case 1:  
			    System.out.println("---------------------------------------------");
				System.out.println("Add Record");
				System.out.println("---------------------------------------------");
				System.out.print("Enter Code : ");
				code=sc.nextInt();
				System.out.print("Enter The Device Name : ");
				name=sc.next();
				System.out.print("Enter The Name of Employee : ");
				employee=sc.next();
				System.out.print("Enter Peripheral Type  :");
				type=sc.next();
						
	      
	        info j=new info(code,name,employee,type);
	        in.add(j);
				
				break;
			case 2:
			    System.out.println("---------------------------------------------------");
			    System.out.println("View record");
				System.out.println("---------------------------------------------------");
				per=in.iterator();
				while(per.hasNext()) {
				System.out.println(per.next().Information());
				}
				System.out.println("---------------------------------------------------");
				break;
			case 3:
				
				boolean perip=false;
				
				ListIterator<info> la=in.listIterator();
				System.out.println("---------------------------------------------------");
				System.out.println("Edit Record");
				System.out.println("---------------------------------------------------");
				System.out.print("Enter The Code :");
				code=sc.nextInt();
				while(la.hasNext()) {
				info p=la.next();
				if(p.Code()==code) {
				    	
						System.out.print("Enter Code : ");
						code=sc.nextInt();
						System.out.print("Enter the device Name : ");
						name=sc.next();
						System.out.println("Enter Employee Name : ");
						employee=sc.next();
						System.out.print("Enter Type Of Peripheral :");
						type=sc.next();
						
						la.set(new info(code,name,employee,type));
						perip=true;
						
                        if(!perip) {						
                    	System.out.println("Not Found, Try Again");
                        }else {
                     	System.out.println("Successfuly");
                        }
						
					}
				}break;
			
			case 4:
				per=in.iterator();
				System.out.print("Enter The Code To Delete : ");
				code=sc.nextInt();
				 perip=false;
				while(per.hasNext()) {
					info tt=per.next();
					if(tt.Code()==code) {
						per.remove();
						perip=true;
					}
				}
			
				
				if(!perip) {
					System.out.println("The you Code Enter Didn't Match, Please Try Again!!!");
				}else {
					System.out.println("It is Deleted Successfuly!!!");
				}
				
				break;
				
			case 5:
				while(per.hasNext()) {
					System.out.println(per.next().Information());
				}
				break;
			case 6:
				System.out.println("---------------------------------------------------");
				System.out.println("Thank You So Much!!!");
				System.out.println("----------------------------------------------------");
				break;
			
			}
		}while(s!=6);
	}
}
class info{
	int code;
	String name,employee,type;
	info(int code,String name,String employee,String type){
		this.code=code;
		this.name=name;
		this.employee=employee;
		this.type=type;
	}
	
	public String Information() {
		return "CODE: "+code+" "+"NAME: "+name+" "+"EMPLOYEE NAME: "+employee+" "+"PERIPHERAL TYPE : "+type;
	}
	public int Code() {
		return code;
	}
}
