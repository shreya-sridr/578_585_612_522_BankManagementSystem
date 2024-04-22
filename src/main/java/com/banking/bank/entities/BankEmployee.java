package com.banking.bank.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

//import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Getter
@Setter
@Entity
public class BankEmployee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String name;
    public String empID;
    public String address;
    public String contact;
    public int salary;

    // @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    // private List<Account> accounts;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "branch_id")
    private Branch branch;

    public void verifyTransaction() {
        // Implement transaction verification logic
    }
}
