package resources;

@SuppressWarnings("UnusedDeclaration")
public interface ResourceServerControllerMBean {
    String getName();
    int getAge();
    void setTestResource(TestResource testResource);
}
