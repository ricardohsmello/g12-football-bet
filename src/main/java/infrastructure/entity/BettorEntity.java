package infrastructure.entity;

import domain.model.Bet;
import domain.model.Bettor;
import domain.model.Match;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "bettor_entity")
public class BettorEntity extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "bettor_id")
    Long id;

    private String name;

    public BettorEntity(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Bettor toDomain() {
        return new Bettor(id, name);
    }

    public BettorEntity() {
    }



}
