public class CustomerService {
    private CustomerRepository repository;
    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }
    public void showCustomer(String id) {
        System.out.println(repository.findCustomerById(id));
    }
}