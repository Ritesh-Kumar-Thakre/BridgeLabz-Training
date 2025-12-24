import java.util.*;
public class RockPaperScissorsGame{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of games:");
        int games=sc.nextInt();

		// Applying the required logic and Printing the results
        String[][] results=playGames(games);
        String[][] stats=calculateStats(results);
        displayResults(results,stats);
        sc.close();
    }

    // Method to get computer choice
    static String computerChoice(){
        int n=(int)(Math.random()*3);
        if(n==0) {
			return "Rock";
		}
        if(n==1) {
			return "Paper";
		}
        return "Scissors";
    }

    // Method to find winner
    static String findWinner(String user,String comp){
        if(user.equals(comp)) {
			return "Draw";
		}
        if(user.equals("Rock")&&comp.equals("Scissors")){
			return "User";
		}
        if(user.equals("Paper")&&comp.equals("Rock")){
			return "User";
		}
        if(user.equals("Scissors")&&comp.equals("Paper")){
			return "User";
		}
        return "Computer";
    }

    // Method to play games
    static String[][] playGames(int games){
        Scanner sc=new Scanner(System.in);
        String[][] data=new String[games][3];
        for(int i=0;i<games;i++){
            System.out.println("Game "+(i+1)+" Enter choice (Rock/Paper/Scissors):");
            String user=sc.next();
            String comp=computerChoice();
            String winner=findWinner(user,comp);
            data[i][0]=user;
            data[i][1]=comp;
            data[i][2]=winner;
        }
        return data;
    }

    // Method to calculate average and percentage
    static String[][] calculateStats(String[][] data){
        int userWin=0,compWin=0;
        for(int i=0;i<data.length;i++){
            if(data[i][2].equals("User")){
				userWin++;
			}else if(data[i][2].equals("Computer")){
				compWin++;
			}
        }
        double userPer=(userWin*100.0)/data.length;
        double compPer=(compWin*100.0)/data.length;
        String[][] stats=new String[2][3];
        stats[0][0]="User";
        stats[0][1]=String.valueOf(userWin);
        stats[0][2]=String.format("%.2f",userPer);
        stats[1][0]="Computer";
        stats[1][1]=String.valueOf(compWin);
        stats[1][2]=String.format("%.2f",compPer);
        return stats;
    }

    // Method to display results
    static void displayResults(String[][] games,String[][] stats){
        System.out.println("\nGame Results:");
        System.out.println("User\tComputer\tWinner");
        for(int i=0;i<games.length;i++){
            System.out.println(games[i][0]+"\t"+games[i][1]+"\t\t"+games[i][2]);
        }
        System.out.println("\nStatistics:");
        System.out.println("Player\tWins\tWin%");
        for(int i=0;i<stats.length;i++){
            System.out.println(stats[i][0]+"\t"+stats[i][1]+"\t"+stats[i][2]);
        }
    }
}
