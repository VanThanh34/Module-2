package case_study.entity;

public class Customer {
    private String name;
    private final String phoneNumber;

    public Customer(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("""
        +----------------------------------------------------+
        |               THÔNG TIN KHÁCH HÀNG                 |
        +----------------------------------------------------+
        | Tên khách   : %-36s |
        | SĐT         : %-36s |
        +----------------------------------------------------+
        """, name, phoneNumber);
    }

}
