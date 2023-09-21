import java.util.Scanner;
public class Towers_Of_Hanoi {
    private int totalDisks;
    public Towers_Of_Hanoi(int i) {
        totalDisks = i;
    }
    public void solve() {
        moveTower(totalDisks, 1, 3, 2);
    }
    private void moveTower(int disks, int tower1, int tower2, int tower3) {
        if (disks == 1) {
            moveOneDisk(tower1, tower2);
        }
        else {
            moveTower(disks - 1, tower1, tower3, tower2);
            moveOneDisk(tower1, tower2);
            moveTower(disks - 1, tower3, tower2, tower1);
        }
    }
    private void moveOneDisk(int tower1, int tower2) {
        System.out.println("Move one disk from " + tower1 + " to " + tower2 + ".");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of disks you want for the Towers of Hanoi: ");
        int disks = sc.nextInt();
        Towers_Of_Hanoi t = new Towers_Of_Hanoi(disks);
        t.solve();
        sc.close();
    }
}
