package winsem;
import Climate_Temperature.*;
import Climate_SLR.*;
public class CC_Mean 
{
	Temperature obj = new Temperature();
	Sea_Level_Rise obj1 = new Sea_Level_Rise();
	
   double Mean_Temp()
   {
	   obj.Read_Temp();
	   double avg =0.0;
	   double sum =0.0;
	   for(int i=0;i<10;i++)
	   {
		   sum+=obj.temp[i];
	   }
	   return (avg =sum/10);
   }
   
   double Mean_SLR()
   {
	   obj1.Read_SLR();
	   double avg =0.0;
	   double sum =0.0;
	   for(int i=0;i<10;i++)
	   {
		   sum+=obj1.sea_level[i];
	   }
	   return (avg =sum/10);
   }
   void Disp_SLR()
   {
	   System.out.println(Mean_Temp());
	   System.out.println(Mean_SLR());
   }
   
   public static void main(String [] args)
   {
	   CC_Mean obj2 = new CC_Mean();
	   obj2.Disp_SLR();
   }
}
