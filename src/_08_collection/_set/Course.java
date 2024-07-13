package _08_collection._set;

public class Course {
  private int id;
  private String title;

  public Course(int id, String title) {
    this.id = id;
    this.title = title;
  }

  @Override
  public String toString() {
    return "Course [id=" + id + ", title=" + title + "] ";
  }
}
