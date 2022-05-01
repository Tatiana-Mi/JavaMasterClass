public class PlayerName {

    public static void main(String[] args) {
        System.out.println("hi");

    }


    int highScorePosition = calculateHighScorePosition(1500);

        public static void displayHighScorePosition (String playerName, int highScorePosition){
            System.out.println("Hi everyone!");

        }
        public static int calculateHighScorePosition(int playerScore){

            if (playerScore > 1000) {
                return 1;
            } else if(playerScore > 500 && playerScore < 1000){
                return 2;
            } else if(playerScore > 100 && playerScore < 500){
                return 3;
            } else{
                return 4;
            }
        }



}
