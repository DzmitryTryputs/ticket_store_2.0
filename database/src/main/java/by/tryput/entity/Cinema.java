package by.tryput.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@Entity
@Table(name = "cinemas")
public class Cinema extends IdentifiableEntity {

    @Column(name = "title", nullable = false,
    unique = true)
    private String title;

    @OneToMany(mappedBy = "cinema")
    private Set<CinemaHall> halls = new HashSet<>();


}
