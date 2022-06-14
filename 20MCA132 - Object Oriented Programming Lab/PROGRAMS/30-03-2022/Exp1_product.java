class product
{
int pcode;
String pname;
double price;

public void getinfo(int x,String y,double z)
{
pcode=x;
pname=y;
price=z;
}

public static void main(String args[])
{
double res;
product p1=new product();
product p2=new product(); 
product p3=new product();

p1.getinfo(100,"abc",10.5);
p2.getinfo(200,"efj",14.5);
p3.getinfo(100,"eph",15);
res=compareproduct(p1,p2,p3);
System.out.println("lowest price is : "+res);


}

public static double compareproduct(product p1,product p2,product p3)
{
 double temp;
 if((p1.price<p2.price) && (p1.price<p3.price))
 {
 temp=p1.price;
 }
 else if((p2.price<p1.price) && (p2.price<p3.price))
 {
 temp=p2.price;
 }
 else{
 temp=p3.price;
 
}
return temp;
}


}
