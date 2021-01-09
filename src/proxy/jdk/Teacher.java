package proxy.jdk;

/**
 * @author light
 * @date 13/6/2020 下午 5:17
 */
public class Teacher implements Person {

  private String course = "语文";

  @Override
  public void study() {
    System.out.println(course);
  }

  public String getCourse() {
    return course;
  }

  public void setCourse(String course) {
    this.course = course;
  }
}
