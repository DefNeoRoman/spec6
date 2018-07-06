package resources;

public class TestResource {
    private String name;
    private String age;

    public TestResource(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public TestResource() {
        this.name = "";
        this.age = "0";
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "TestResource{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
