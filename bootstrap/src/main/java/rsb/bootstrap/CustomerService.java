package rsb.bootstrap;


public interface CustomerService {
    Collection<Customer> save(String... names);
    Customer findById(Long id);
    Collection<Customer> findAll();
}
