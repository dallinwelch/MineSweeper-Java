import java.util.Random;
class sweepDriverT{
   private int [][] map;
   private String player;
   private  Random ran = new Random();
 
   
   
   public sweepDriverT(String str){
   player = str;
   map = new int[][]{
   {0, 0, 0, 0, 0, 0, 0, 0},
   {0, 0, 0, 0, 0, 0, 0, 0},
   {0, 0, 0, 0, 0, 0, 0, 0},
   {0, 0, 0, 0, 0, 0, 0, 0},
   {0, 0, 0, 0, 0, 0, 0, 0},
   {0, 0, 0, 0, 0, 0, 0, 0},
   {0, 0, 0, 0, 0, 0, 0, 0},
   {0, 0, 0, 0, 0, 0, 0, 0}
   
   
   
   };
   int mine = ran.nextInt(5)+10;
   for(int i =0; i< mine; i++){
      map[ran.nextInt(6)+1][ran.nextInt(6)+1] = -1;
   }
  // show();
    int count = 0;
      for(int r = 1; r < map.length -1; r++){
         for(int c =1; c < map[0].length -1; c++){
        
         if(map[r][c] !=-1){
             
            if(map[r -1][c-1]==-1){
               map[r][c]++;
            }
            if(map[r-1][c]==-1){
               map[r][c] ++;
            }
            if(map[r-1][c+1]== -1){
              map[r][c] ++;
            }
            if(map[r][c-1] == -1){
               map[r][c] ++;
            }
            if(map[r][c+1]== -1){
               map[r][c] ++;
            }
            if(map[r+1][c-1]== -1){
               map[r][c] ++;
            }
            if(map[r+1][c]==-1){
               map[r][c] ++;
            }
            if(map[r+1][c+1]==-1)
               map[r][c] ++;
               
             }//ends if
         
          }//ends 1st for loop   
        }//ends second for loop
  
    // show();
   }//ends driver
   
   /*
    public int range(){
     int count = 0;
      for(int i = 0; i<map.length; i++){
         for(int j = 0; j < map.length; j++){
         
            if(map[i][i] ==-1){
               map[i][i]=-1;
         }else{
            if(map[i -1][i-1]==-1){
               count++;
            }
            if(map[i-1][i]==-1){
               count++;
            }
            if(map[i-1][i+1]== -1){
               count++;
            }
            if(map[i][i-1] == -1){
               count++;
            }
            if(map[i][i+1]== -1){
               count++;
            }
            if(map[i+1][i-1]== -1){
               count++;
            }
            if(map[i+1][i]==-1){
               count++;
            }
            if(map[i+1][i+1]==-1)
               count++;
               map[i][i]=count;
             }
             
           }//ends for 2   
         }//ends for1
       return count;
      }//ends range
       */
   
   
   /*public void show(){
      for(int r = 0; r < map.length; r++){
         for(int c =0; c < map[0].length; c++){
            System.out.print(map[r][c]  + " " );
         }
         System.out.println();
      }
   }
   */
   
   
   public int getMap(int position){
      switch (position){
      case 00:
         return map[1][1];
      case 01:
         return map[1][2];
       case 02:
         return map[1][3];
      case 03:
         return map[1][4];
       case 04:
         return map[1][5];
      case 05:
         return map[1][6];
      case 10:
         return map[2][1];
      case 11:
         return map[2][2];
       case 12:
         return map[2][3];
      case 13:
         return map[2][4];
       case 14:
         return map[2][5];
      case 15:
         return map[2][6];
         
       case 20:
         return map[3][1];
      case 21:
         return map[3][2];
       case 22:
         return map[3][3];
      case 23:
         return map[3][4];
       case 24:
         return map[3][5];
      case 25:
         return map[3][6]; 
       case 30:
         return map[4][1];
      case 31:
         return map[4][2];
       case 32:
         return map[4][3];
      case 33:
         return map[4][4];
       case 34:
         return map[4][5];
      case 35:
         return map[4][6];
      case 40:
         return map[5][1];
      case 41:
         return map[5][2];
       case 42:
         return map[5][3];
      case 43:
         return map[5][4];
       case 44:
         return map[5][5];
      case 45:
         return map[5][6];
         
       case 50:
         return map[6][1];
      case 51:
         return map[6][2];
       case 52:
         return map[6][3];
      case 53:
         return map[6][4];
       case 54:
         return map[6][5];
      case 55:
         return map[6][6];      
         
         
      
      
      default:
      return 99;
      
      }
   }
   
  public String toString(){
      String str = "Mine Sweeper\n";
      
      for(int r = 0; r < map.length; r++){
         for(int c = 0; c < map[0].length; c++){
            if(map[r][c] == 0){
            str += "\t";
            }
            else if(map[r][c] == 3){
               str+= "O \t";
            }
            
            else{
               str += map[r][c] + " \t";
            }
         }//end inner loop
         str+=   "\n";
      }//end outter loop
      
      return str;
   }

   
  

}