import java.util.*;  
class employee {
    int eNo;
    String eName;
    int eSalary;

    public void read(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter ID : ");
        eNo = Integer.parseInt(sc.nextLine());
        System.out.print("Enter Name : ");
        eName = sc.nextLine();
        System.out.print("Enter monthly salary : ");
        eSalary = Integer.parseInt(sc.nextLine());
    }

    public void display(){
        System.out.println("Employee Details Are:");
        System.out.println("Name : "+ eName );
        System.out.println("Salary : "+ eSalary );
    }
    public static void main(String []args){
        int i,n,c=0;
        System.out.println("Enter the limit:");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int No;
        employee emp[] = new employee[n];
        for(i=0;i<n;i++){
            emp[i] = new employee();
            emp[i].read();
        }
        System.out.println("Search");
        do{
            Scanner sc= new Scanner(System.in);
            System.out.print("Enter ID : ");
            No = Integer.parseInt(sc.nextLine());
            for(i=0;i<n;i++){
                if(emp[i].eNo == No){
                    emp[i].display();
                    break;                    
                }
            }
            System.out.println("Do you want to continue(1/0):");            
            c=sc.nextInt();
        }while(c==1);

    }
}