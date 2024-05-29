package Problem_2;

public class IndividualClient implements Client{
    private String name;
    private String id;

    public IndividualClient(String name, String id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public void getClientDetails() {
        System.out.println("Individual Client: Name = " + name + ", ID = " + id);
    }
}
