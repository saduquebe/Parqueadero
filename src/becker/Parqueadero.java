package becker;

import becker.robots.*;

public class Parqueadero
{
   public static void main(String[] args)
   {  
       City ciudad= new City();
       Wall pared0= new Wall(ciudad,0,0,Direction.WEST);
       Wall pared1= new Wall(ciudad,1,0,Direction.WEST);
       Wall pared2= new Wall(ciudad,2,0,Direction.WEST);
       Wall pared3= new Wall(ciudad,3,0,Direction.WEST);
       Wall pared4= new Wall(ciudad,4,0,Direction.WEST);
       Wall pared5= new Wall(ciudad,5,0,Direction.WEST);
       Wall pared6= new Wall(ciudad,0,0,Direction.NORTH);
       Wall pared7= new Wall(ciudad,0,1,Direction.NORTH);
       Wall pared8= new Wall(ciudad,0,2,Direction.NORTH);
       Wall pared9= new Wall(ciudad,0,3,Direction.NORTH);
       Wall pared10= new Wall(ciudad,0,4,Direction.NORTH);
       Wall pared11= new Wall(ciudad,0,5,Direction.NORTH);
       Wall pared12= new Wall(ciudad,0,6,Direction.NORTH);
       Wall pared13= new Wall(ciudad,0,7,Direction.NORTH);
       Wall pared14= new Wall(ciudad,0,2,Direction.EAST);
       Wall pared15= new Wall(ciudad,1,2,Direction.EAST);
       Wall pared16= new Wall(ciudad,2,2,Direction.EAST);
       Wall pared17= new Wall(ciudad,3,2,Direction.EAST);
       Wall pared18= new Wall(ciudad,4,2,Direction.EAST);
       Wall pared19= new Wall(ciudad,5,0,Direction.SOUTH);
       Wall pared20= new Wall(ciudad,5,1,Direction.SOUTH);
       Wall pared21= new Wall(ciudad,5,2,Direction.SOUTH);
       Wall pared22= new Wall(ciudad,5,3,Direction.SOUTH);
       Wall pared23= new Wall(ciudad,5,4,Direction.SOUTH);
       Wall pared24= new Wall(ciudad,5,5,Direction.SOUTH);
       Wall pared25= new Wall(ciudad,5,6,Direction.SOUTH);
       Wall pared26= new Wall(ciudad,5,7,Direction.SOUTH);
       Wall pared27= new Wall(ciudad,0,5,Direction.EAST);
       Wall pared28= new Wall(ciudad,1,5,Direction.EAST);
       Wall pared29= new Wall(ciudad,2,5,Direction.EAST);
       Wall pared30= new Wall(ciudad,3,5,Direction.EAST);
       Wall pared31= new Wall(ciudad,4,5,Direction.EAST);
       Wall pared32= new Wall(ciudad,0,8,Direction.EAST);
       Wall pared33= new Wall(ciudad,1,8,Direction.EAST);
       Wall pared34= new Wall(ciudad,2,8,Direction.EAST);
       Wall pared35= new Wall(ciudad,3,8,Direction.EAST);
       Wall pared36= new Wall(ciudad,4,8,Direction.EAST);
       Wall pared37= new Wall(ciudad,0,8,Direction.NORTH); 
       Wall pared38= new Wall(ciudad,2,10,Direction.WEST);
       Wall pared39= new Wall(ciudad,1,10,Direction.WEST);
       Wall pared40= new Wall(ciudad,1,11,Direction.NORTH);    
       Wall pared41= new Wall(ciudad,1,10,Direction.NORTH);
       Wall pared42= new Wall(ciudad,1,12,Direction.NORTH); 
       Wall pared43= new Wall(ciudad,1,13,Direction.NORTH); 
       Wall pared44= new Wall(ciudad,1,14,Direction.NORTH); 
       Wall pared45= new Wall(ciudad,1,14,Direction.EAST); 
       Wall pared46= new Wall(ciudad,2,14,Direction.EAST);   
       Wall pared48= new Wall(ciudad,3,10,Direction.NORTH);
       Wall pared49= new Wall(ciudad,3,12,Direction.NORTH); 
       Wall pared50= new Wall(ciudad,3,13,Direction.NORTH); 
       Wall pared51= new Wall(ciudad,3,14,Direction.NORTH);
       
   }
}
