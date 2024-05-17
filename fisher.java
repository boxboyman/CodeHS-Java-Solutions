public class Fisher {
  
  
  private String name;
  private String fish1;
  private int fish1Weight;
  private String fish2;
  private int fish2Weight;
  private String fish3;
  private int fish3Weight;
  private String fish4;
  private int fish4Weight;
  private String fish5;
  private int fish5Weight;
  
  
  public Fisher(String gName) {
    name = gName;
    fish1 = "n/a";
    fish1Weight = 0;
    fish2 = "n/a";
    fish2Weight = 0;
    fish3 = "n/a";
    fish3Weight = 0;
    fish4 = "n/a";
    fish4Weight = 0;
    fish5 = "n/a";
    fish5Weight = 0;
  }


  public void setFish1(String newFish) {
    fish1 = newFish;
  }
  public void setFish2(String newFish) {
    fish2 = newFish;
  }
  public void setFish3(String newFish) {
    fish3 = newFish;
  }
  public void setFish4(String newFish) {
    fish4 = newFish;
  }
  public void setFish5(String newFish) {
    fish5 = newFish;
  }
  public void setFish1Weight(int newFishWeight) {
    fish1Weight = newFishWeight;
  }
  public void setFish2Weight(int newFishWeight) {
    fish2Weight = newFishWeight;
  }
  public void setFish3Weight(int newFishWeight) {
    fish3Weight = newFishWeight;
  }
  public void setFish4Weight(int newFishWeight) {
    fish4Weight = newFishWeight;
  }
  public void setFish5Weight(int newFishWeight) {
    fish5Weight = newFishWeight;
  }


  public String getName() {
    return name;
  }
  public String getFish1() {
    return fish1;
  }
  public String getFish2() {
    return fish2;
  }
  public String getFish3() {
    return fish3;
  }
  public String getFish4() {
    return fish4;
  }
  public String getFish5() {
    return fish5;
  }
  public int getFish1Weight() {
    return fish1Weight;
  }
  public int getFish2Weight() {
    return fish2Weight;
  }
  public int getFish3Weight() {
    return fish3Weight;
  }
  public int getFish4Weight() {
    return fish4Weight;
  }
  public int getFish5Weight() {
    return fish5Weight;
  }
  

  public void print() {
    System.out.println("////////////////////////////////////////");
    System.out.println("Name: " + name);
    System.out.println("First fish: " + fish1 + ", " + fish1Weight + "lbs");
    System.out.println("Second fish: " + fish2 + ", " + fish2Weight + "lbs");
    System.out.println("Third fish: " + fish3 + ", " + fish3Weight + "lbs");
    System.out.println("Fourth fish: " + fish4 + ", " + fish4Weight + "lbs");
    System.out.println("Fifth fish: " + fish5 + ", " + fish5Weight + "lbs");
    System.out.println("////////////////////////////////////////");
  }

  public void fishPrint() {
    System.out.println("First fish: " + fish1 + ", " + fish1Weight + "lbs");
    System.out.println("Second fish: " + fish2 + ", " + fish2Weight + "lbs");
    System.out.println("Third fish: " + fish3 + ", " + fish3Weight + "lbs");
    System.out.println("Fourth fish: " + fish4 + ", " + fish4Weight + "lbs");
    System.out.println("Fifth fish: " + fish5 + ", " + fish5Weight + "lbs");
  }
  

  public String fishing(int bait) {
    String fish;
    int fishChance = (int) (Math.random() * 100 + 1);
    if (bait == 1) {
      if (fishChance <= 75) {
        fish = "Blue gill";
      } else if (fishChance <= 88) {
        fish = "Bass";
      } else if (fishChance <= 93) {
        fish = "Catfish";
      } else if (fishChance <= 94) {
        fish = "Sturgeon";
      } else {
      fish = "Nothing";
      }
    } else if (bait == 2) {
      if (fishChance <= 5) {
        fish = "Blue gill";
      } else if (fishChance <= 20) {
        fish = "Bass";
      } else if (fishChance <= 40) {
        fish = "Catfish";
      } else if (fishChance <= 45) {
        fish = "Sturgeon";
      } else {
        fish = "Nothing";
      }
    } else if (bait == 3) {
      if (fishChance <= 50) {
        fish = "Blue gill";
      } else if (fishChance <= 70) {
        fish = "Bass";
      } else if (fishChance <= 90) {
        fish = "Catfish";
      } else if (fishChance <= 91) {
        fish = "Sturgeon";
      } else {
       fish = "Nothing";
      }
    } else {
      fish = "no fish";
    }
    return fish;
  }

  public int weighing(String f) {
    int weight;
    int weightChance = (int) (Math.random() * 100 + 1);
    if (f.equals("Blue gill")) {
      if (weightChance <= 50) {
        weight = 1;
      } else {
        weight = 2;
      }
    } else if (f.equals("Bass")) {
      if (weightChance <= 5) {
        weight = 1;
      } else if (weightChance <= 13) {
        weight = 2;
      } else if (weightChance <= 23) {
        weight = 3;
      } else if (weightChance <= 39) {
        weight = 4;
      } else if (weightChance <= 64) {
        weight = 5;
      } else if (weightChance <= 77) {
        weight = 6;
      } else if (weightChance <= 87) {
        weight = 7;
      } else if (weightChance <= 95) {
        weight = 8;
      } else {
        weight = 9;
      }
    } else if (f.equals("Catfish")) {
      if (weightChance <= 20) {
        weight = 5;
      } else if (weightChance <= 50) {
        weight = 10;
      } else if (weightChance <= 65) {
        weight = 15;
      } else if (weightChance <= 90) {
        weight = 20;
      } else {
        weight = 25;
      }
    } else if (f.equals("Sturgeon")) {
      if (weightChance <= 65) {
        weight = 10;
      } else if (weightChance <= 85) {
        weight = 25;
      } else if (weightChance <= 95) {
        weight = 50;
      } else if (weightChance <= 99) {
        weight = 100;
      } else {
        weight = 150;
      }
    } else {
        weight = 0;
    }
    return weight;
  }

  public int addAll() {
    return fish1Weight + fish2Weight + fish3Weight + fish4Weight + fish5Weight;
  }

  public void printAddAll() {
    Text.printSmooth(" " + fish1Weight + fish2Weight + fish3Weight + fish4Weight + fish5Weight + " ", 75);
  }
}
