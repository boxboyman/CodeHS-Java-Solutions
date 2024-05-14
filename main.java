import java.util.Scanner;
  class Main {
    public static void main(String[] args) {
      int bait;
      String fish;
      int weight;
      int yn;
      int replace;
      Scanner scan = new Scanner(System.in);
      Text.clear();
      Text.printSmooth(Text.RED + "Enter player one's name" + "\n", 75);
      String player1Name = scan.nextLine();
      Fisher p1 = new Fisher(player1Name);
      Text.clear();
      Text.printSmooth(Text.BLUE + "Enter player two's name" + "\n", 75);
      String player2Name = scan.nextLine();
      Fisher p2 = new Fisher(player2Name);
      Text.clear();
      for (int i = 0; i < 30; i++) {
        if (i % 2 == 0) {
          Text.clear();
          Text.printSmooth(Text.RED + p1.getName() + " will you use worm(1), salmon eggs(2), or fishbites(3) as your bait?" + "\n", 75);
          bait = scan.nextInt();
          fish = p1.fishing(bait);
          Text.printSmooth("Casting", 75);
          Text.wait(500);
          Text.clear();
          waiting();
          weight = p1.weighing(fish);
          Text.clear();
          Text.printSmooth("You caught " + fish + " with a weight of " + weight + "lbs" + "\n", 75);
          Text.printSmooth("Would you like to keep this fish? (yes(1)/no(2))" + "\n", 75);
          yn = scan.nextInt();
          if (yn == 1) {
            p1.fishPrint();
            Text.printSmooth("Which one will you replace? (1/2/3/4/5/release(6))" + "\n", 75);
            replace = scan.nextInt();
            if (replace == 1) {
              p1.setFish1(fish);
              p1.setFish1Weight(weight);
            } else if (replace == 2) {
              p1.setFish2(fish);
              p1.setFish2Weight(weight);
            } else if (replace == 3) {
              p1.setFish3(fish);
              p1.setFish3Weight(weight);
            } else if (replace == 4) {
              p1.setFish4(fish);
              p1.setFish4Weight(weight);
            } else if (replace == 5) {
              p1.setFish5(fish);
              p1.setFish5Weight(weight);
            } else {
              Text.printSmooth("Releasing fish back into water", 75);
              Text.wait(500);
            }
          } else {
            Text.printSmooth("Releasing fish back into water", 75);
            Text.wait(500);
          }
        } else {
          Text.clear();
          Text.printSmooth(Text.BLUE + p2.getName() + " will you use worm(1), salmon eggs(2), or fishbites(3) as your bait?" + "\n", 75);
          bait = scan.nextInt();
          fish = p2.fishing(bait);
          Text.printSmooth("Casting", 75);
          Text.wait(500);
          Text.clear();
          waiting();
          weight = p2.weighing(fish);
          Text.clear();
          Text.printSmooth("You caught " + fish + " with a weight of " + weight + "lbs" + "\n", 75);
          Text.printSmooth("Would you like to keep this fish? (yes(1)/no(2))" + "\n", 75);
          yn = scan.nextInt();
          if (yn == 1) {
            p2.fishPrint();
            Text.printSmooth("Which one will you replace? (1/2/3/4/5/release(6))" + "\n", 75);
            replace = scan.nextInt();
            if (replace == 1) {
              p2.setFish1(fish);
              p2.setFish1Weight(weight);
            } else if (replace == 2) {
              p2.setFish2(fish);
              p2.setFish2Weight(weight);
            } else if (replace == 3) {
              p2.setFish3(fish);
              p2.setFish3Weight(weight);
            } else if (replace == 4) {
              p2.setFish4(fish);
              p2.setFish4Weight(weight);
            } else if (replace == 5) {
              p2.setFish5(fish);
              p2.setFish5Weight(weight);
            } else {
              Text.printSmooth("Releasing fish back into water", 75);
              Text.wait(500);
            }
          } else {
            Text.printSmooth("Releasing fish back into water", 75);
            Text.wait(500);
          }
        }
      }
      Text.clear();
        Text.printSmooth(Text.WHITE + "The fishing has concluded.", 75);
        Text.wait(1000);
        if (p1.addAll() > p2.addAll()) {
          Text.clear();
          waiting();
          Text.printSmooth("The winner is" + "\n", 75);
          Text.wait(1000);
          Text.clear();
          waiting();
          Text.printSmooth("player" + "\n", 75 );
          Text.wait(1000);
          Text.clear();
          waiting();
          Text.printSmooth(Text.RED + "one, " + p1.getName() + "!!!" + "\n", 75);
          Text.printSmooth(Text.RED + "1st" + "\n", 75);
          p1.print();
          System.out.print("\n");
          Text.printSmooth(Text.BLUE + "2nd" + "\n", 75);
          p2.print();
        } else if (p1.addAll() < p2.addAll()) {
          Text.clear();
          waiting();
          Text.printSmooth("The winner is" + "\n", 75);
          Text.wait(1000);
          Text.clear();
          waiting();
          Text.printSmooth("player" + "\n", 75 );
          Text.wait(1000);
          Text.clear();
          waiting();
          Text.printSmooth(Text.BLUE + "two, " + p2.getName() + "!!!" + "\n", 75);
          Text.printSmooth(Text.BLUE + "1st" + "\n", 75);
          p2.print();
          System.out.print("\n");
          Text.printSmooth(Text.RED + "2nd" + "\n", 75);
          p1.print();
        } else {
          waiting();
          Text.printSmooth("It's a tie!!!" + "\n", 75);
          Text.printSmooth(Text.RED + "2nd" + "\n", 75);
          p1.print();
          System.out.print("\n");
          Text.printSmooth(Text.BLUE + "2nd" + "\n", 75);
          p2.print();
        }
    }
    public static void waiting() {
      try {
        for (int j = 0; j < 3; j++) {
          for (int i = 0;i< 3; i++) {
            Thread.sleep(500);
            System.out.print(".");
          }
          Thread.sleep(500);
          Text.clear();
        }
      }
      catch(InterruptedException ex){}
    }
  }