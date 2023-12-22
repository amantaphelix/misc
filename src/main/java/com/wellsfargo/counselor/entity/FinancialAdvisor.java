import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class FinancialAdvisor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "financialAdvisor")
    private List<Client> clients;

    public FinancialAdvisor() {
    }

    public FinancialAdvisor(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Client> getClients() {
        return clients;
    }

    // No setter for id

    public void setName(String name) {
        this.name = name;
    }

    
}
