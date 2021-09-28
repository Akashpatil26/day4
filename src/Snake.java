import java.util.Random;

public class Snake {
    public static void main(String[] args) {
      int[] player=new int[]{0,0};
      Random random=new Random();

      int i=0;
      System.out.println("GAME STARTS !!");
      while ((player[0] != 100 && player[1] != 100)) {
            System.out.println("Player " +(i+1) +" Turn");
            player[i] += random.nextInt(6);
            if ((player[i] == 10) || (player[i] == 25) || (player[i] == 50) || (player[i] == 75)) {
                System.out.println("GOT A LADDER!!");
                if (player[i] == 10)
                    System.out.println(player[i]+ "== 16");
                else if (player[i] == 25)
                    System.out.println(player[i]+ "== 40");
                else if (player[i] == 50)
                    System.out.println(player[i]+ "== 65");
                else if (player[i] == 75)
                    System.out.println(player[i]+ "== 90");
                else
                    System.out.println("In the same position");
            }
            if ((player[i] == 15 || player[i] == 35 || player[i] == 60 || player[i] == 95)) {
                System.out.println("OOPS, ITS A SNAKE!!");
                if (player[i] == 15)
                    System.out.println(player[i]+ "== 5");
                else if (player[i] == 35)
                    System.out.println(player[i]+ "== 15");
                else if (player[i] == 60)
                    System.out.println(player[i]+ "== 22");
                else if (player[i] == 75)
                    System.out.println(player[i]+ "== 1");
                else
                    System.out.println("In the same position");
            }
            i=(i+1)%2;
        }
        if (player[0]==100){
            System.out.println("PLAYER 1 WON!!!!");
        }
        else if(player[1]==100){
            System.out.println("PLAYER 2 WON");
        }

    }

}