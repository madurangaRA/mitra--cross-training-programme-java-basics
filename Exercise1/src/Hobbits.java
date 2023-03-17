class Hobbits {
  String name;
  public static void main(String[] args) {
    Hobbits[] hobbits = new Hobbits[3];
    int z = 0;
    while (z < 3) {
      hobbits[z] = new Hobbits();
      hobbits[z].name = "bilbo";
      if (z == 0) {
        hobbits[z].name = "frodo";
      }
      if (z == 1) {
        hobbits[z].name = "sam";
      }
      System.out.print(hobbits[z].name + " is a ");
      System.out.println("good Hobbit name");
      z = z + 1;
    }
  }
}