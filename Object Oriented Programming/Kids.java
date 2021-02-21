public class Kids extends ManKind{
  private int yearsOld;

  public Kids(int yearsOld) {
    this.yearsOld = yearsOld;
  }

  public void setYearsOld(int years) {
    this.yearsOld = years;
  }

  public int getYearsOld() {
    return yearsOld;
  }

  public void printAge() {
    System.out.println("I am " + yearsOld + " years Old");
  }
}
