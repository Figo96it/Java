package pl.sda.jpatraining.jpa;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Embeddable
public class Adress {
    private String city;
    @Column(name = "postal_code")
    private String postalCode;
    private String street;
}
