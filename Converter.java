import java.text.DecimalFormat;
import java.util.*;
public class Converter {

public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
DecimalFormat n = new DecimalFormat() ;
double Euro,Taka,Ruble,dollar,rupee,yen,m;
System.out.println("Welcome to Currency Converter !!! \nEnter your  current currency type");
m=s.nextInt();
if(m == 1)
{
System.out.println("Enter amount in rupees:");
rupee= s.nextDouble();
Euro=rupee * 0.011;
System.out.println("Euro= "+n.format(Euro));
Taka=rupee * 1.17;
System.out.println("Taka= "+n.format(Taka));
Ruble=rupee*0.91;
System.out.println("Ruble=  "+n.format(Ruble));
dollar=rupee*0.014;
System.out.println("dollar=  "+n.format(dollar));
yen=rupee*1.48;
System.out.println("yen= "+n.format(yen));
}
if (m == 2)
{
System.out.println("Enter amount in euro:");
Euro= s.nextDouble();
rupee= Euro*85;
System.out.println("Euro= "+n.format(rupee));
Taka=Euro*100;
System.out.println("Taka= "+n.format(Taka));
Ruble=Euro*90;
System.out.println("Ruble= "+n.format(Ruble));
dollar=Euro*1.18;
System.out.println("dollar= "+n.format(dollar));
yen=Euro*130;
System.out.println("yen= "+n.format(yen));
}

if (m == 3)
{
System.out.println("Enter amount in Taka");
Taka= s.nextDouble();
Euro= Taka*0.01;
System.out.println("Euro= "+n.format(Euro));
rupee=Taka*0.85;
System.out.println("Taka= "+n.format(rupee));
Ruble=Taka*1.1;
System.out.println("Ruble= "+n.format(Ruble));
dollar=Taka*0.012;
System.out.println("dollar= "+n.format(dollar));
yen=Taka*1.24;
System.out.println("yen= "+n.format(yen));
}
if (m== 4)
{
System.out.println("Enter amount in ruble:");
Ruble= s.nextDouble();
Euro=Ruble*0.011;
System.out.println("Euro= "+n.format(Euro));
Taka=Ruble*0.82;
System.out.println("Taka= "+n.format(Taka));
rupee=Ruble*85;
System.out.println("Ruble= "+n.format(rupee));
dollar=Ruble*0.013;
System.out.println("dollar= "+n.format(dollar));
yen=Ruble*1.5;
System.out.println("yen= "+n.format(yen));
}
if (m == 5)
{
System.out.println("Enter amount in dollar:");
dollar= s.nextDouble();
Euro= dollar*0.85;
System.out.println("Euro= "+n.format(Euro));
Taka=dollar*84.50;
System.out.println("Taka= "+n.format(Taka));
Ruble=dollar*73;
System.out.println("Ruble= "+n.format(Ruble));
rupee=dollar*74;
System.out.println("dollar= "+n.format(rupee));
yen=dollar/110;
System.out.println("yen= "+n.format(yen));
}
if (m == 6)
{
System.out.println("Enter amount in yen:");
yen= s.nextDouble();
Euro= yen *0.008;
System.out.println("Euro= "+n.format(Euro));
Taka=yen*0.77;
System.out.println("Taka= "+n.format(Taka));
Ruble=yen*0.58;
System.out.println("Ruble= "+n.format(Ruble));
dollar=yen*0.0091;
System.out.println("dollar= "+n.format(dollar));
rupee=yen*0.64;
System.out.println("yen= "+n.format(rupee));
}
}
}

