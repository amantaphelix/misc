import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    private FinancialAdvisor financialAdvisor;

    @OneToMany(mappedBy = "client")
    private List<Portfolio> portfolios;

    public Client() {
    }

    public Client(String name, FinancialAdvisor financialAdvisor) {
        this.name = name;
        this.financialAdvisor = financialAdvisor;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public FinancialAdvisor getFinancialAdvisor() {
        return financialAdvisor;
    }

    public List<Portfolio> getPortfolios() {
        return portfolios;
    }

    // No setter for id

    public void setName(String name) {
        this.name = name;
    }

    // Other setters as needed
}
