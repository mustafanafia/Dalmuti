import java.util.Scanner;


public class dalmuti {
    public static void shuffle() {
        
    String[] cardName = new String [80]; 
    
    Scanner scnr = new Scanner(System.in);
    
    int i;
    int k = 0;
    
    boolean valid = true;
    
    
    cardName[0] = "Dalmuti";
    cardName[1] = "Archbishop";
    cardName[2] = "Archbishop";
    cardName[3] = "Earl Marshal";
    cardName[4] = "Earl Marshal";
    cardName[5] = "Earl Marshal";
    cardName[6] = "Baroness";
    cardName[7] = "Baroness";
    cardName[8] = "Baroness";
    cardName[9] = "Baroness";
    cardName[10] = "Abbess";
    cardName[11] = "Abbess";
    cardName[12] = "Abbess";
    cardName[13] = "Abbess";
    cardName[14] = "Abbess";
    cardName[15] = "Knight";
    cardName[16] = "Knight";
    cardName[17] = "Knight";
    cardName[18] = "Knight";
    cardName[19] = "Knight";
    cardName[20] = "Knight";    
    cardName[21] = "Seamstress";
    cardName[22] = "Seamstress";
    cardName[23] = "Seamstress";
    cardName[24] = "Seamstress";
    cardName[25] = "Seamstress";
    cardName[26] = "Seamstress";
    cardName[27] = "Seamstress";    
    cardName[28] = "Mason";
    cardName[29] = "Mason";
    cardName[30] = "Mason";
    cardName[31] = "Mason";
    cardName[32] = "Mason";
    cardName[33] = "Mason";
    cardName[34] = "Mason";
    cardName[35] = "Mason";    
    cardName[36] = "Cook";
    cardName[37] = "Cook";
    cardName[38] = "Cook";
    cardName[39] = "Cook";
    cardName[40] = "Cook";
    cardName[41] = "Cook";
    cardName[42] = "Cook";
    cardName[43] = "Cook";
    cardName[44] = "Cook";   
    cardName[45] = "Shepherdess";
    cardName[46] = "Shepherdess";
    cardName[47] = "Shepherdess";
    cardName[48] = "Shepherdess";
    cardName[49] = "Shepherdess";
    cardName[50] = "Shepherdess";
    cardName[51] = "Shepherdess";
    cardName[52] = "Shepherdess";
    cardName[53] = "Shepherdess";
    cardName[54] = "Shepherdess";    
    cardName[55] = "Stonecutter";
    cardName[56] = "Stonecutter";
    cardName[57] = "Stonecutter";
    cardName[58] = "Stonecutter";
    cardName[59] = "Stonecutter";
    cardName[60] = "Stonecutter";
    cardName[61] = "Stonecutter";
    cardName[62] = "Stonecutter";
    cardName[63] = "Stonecutter";
    cardName[64] = "Stonecutter";
    cardName[65] = "Stonecutter";    
    cardName[66] = "Peasant";
    cardName[67] = "Peasant";
    cardName[68] = "Peasant";
    cardName[69] = "Peasant";
    cardName[70] = "Peasant";
    cardName[71] = "Peasant";
    cardName[72] = "Peasant";
    cardName[73] = "Peasant";
    cardName[74] = "Peasant";
    cardName[75] = "Peasant";
    cardName[76] = "Peasant";
    cardName[77] = "Peasant";    
    cardName[78] = "Jester";
    cardName[79] = "Jester";
    
  
    
    
    for(i = 0; i < cardName.length; i++) {
    
           if(k <= 80) {
               
            k++;
     
            String tempVal = (k + ": " +  cardName[i]);
             cardName[i] = tempVal;

            
            
      
           
        }
    }
    
        
   
          for (i = 0; i < cardName.length; i++) {
        k = i + (int) (Math.random() * (cardName.length-i));
        String temp = cardName[k];
        cardName[k] = cardName[i];
        cardName[i] = temp;
    

    System.out.println(cardName[i]);
        
     }



    System.out.println("Enter number of players between 4-8.");
    int numOfPlayers = scnr.nextInt();
    
    
    if(numOfPlayers > 8 || numOfPlayers < 4) {
        System.out.println("Invalid number of players.");
        
    }
    else { 
        for(i = 0; i < cardName.length; i++){
            
            
        k = (numOfPlayers / cardName.length);
        String temp = cardName[k];
        cardName[k] = cardName[i];
        cardName[i] = temp;
    
        
    
        System.out.println("player 1" + "\t" + "\t" + "player 2" + "\t" + "\t" + "player 3" + "\t" + "\t" + "player 4" + "\t" + "\t" +
        "player 5" + "\t" + "\t" + "player 6" + "\t" + "\t" + "player 7" + "\t" + "\t" + "player 8");
        
        
        System.out.println(cardName[i] + "\t" + "\t" + cardName[i] + "\t" + "\t" + cardName[i] + "\t" + "\t" + cardName[i] + "\t" + "\t" +
        cardName[i] + "\t" + cardName[i] + "\t" + cardName[i] + "\t" + cardName[i]);
        System.out.print("=====================================================================================");
        System.out.println("===================================================================================");
    }
    }

}
    
    public static void main(String [] args) {
        
        shuffle();
    
    }
 }







  


     
     





    