package _08_collection._set;

public class Course {
  private int id;
  private String title;

  public Course(int id, String title) {
    this.id = id;
    this.title = title;
  }

  @Override
  public int hashCode() {
//    Course 의 title 과 id가 같다면, 동일한 Hash 값을 반환
    return title.hashCode() + id;
  }

  @Override
  public boolean equals(Object obj) {
//    obj 를 Course 타입으로 캐드팅 후 target 에 할당
    if (obj instanceof Course target) {
      return target.id == id && target.title.equals(title);
    }
    else {
      return false;
    }
  }

  @Override
  public String toString() {
    return "Course [id=" + id + ", title=" + title + "] ";
  }
}
