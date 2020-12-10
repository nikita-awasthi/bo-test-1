import java.util.Objects;

public class Squashing2 {

  private String string1;
  private String string2;

  public Squashing2() {
  }

  public Squashing2(String string1, String string2) {
    this.string1 = string1;
    this.string2 = string2;
  }
//
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Squashing2 that = (Squashing2) o;
    return Objects.equals(string1, that.string1) &&
        Objects.equals(string2, that.string2);
  }
//comment
  @Override
  public int hashCode() {
    return Objects.hash(string1, string2);
  }
  System.out.println("squash merge");
    System.out.println("simple merge + deletion later");
    System.out.println("squash merge + deletion together(sorry the last one was also squash merge, not simple merge) with TestBranch10");
    System.out.println("double check to make sure squash merge + delete later will not give deleteSourceBranch");

}
