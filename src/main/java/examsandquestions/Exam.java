package examsandquestions;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;

/*
Tehtävänäsi on täydentää kokeiden ja koekysymysten hallintaan tarkoitettua sovellusta. 
Sovellukseen on toteutettu valmiiksi rungot kokeiden ja koekysymysten lisäämiseen tarvittaviin 
kontrollereihin, jonka lisäksi sovelluksessa on osittain valmiina tarvitut Exam ja Question -entiteetit.

Lisää sovellukseen tarvittavat Repository-rajapinnat ja täydennä Exam- ja Question-entiteettejä 
niin, että yhteen kokeeseen monta kysymystä ja yksi kysymys voi liittyä useampaan kokeeseen. 
Toteuta myös kontrollereille tarvittavat metodit ja toiminnallisuudet — saat näitä selville 
HTML-sivuja tarkastelemalla (älä muuta HTML-sivujen rakennetta).

Muokkaa sovellusta lopulta niin, että osoitteessa "/exams" näytettävät kokeet järjestetään koepäivämäärän mukaan.


*/

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Exam extends AbstractPersistable<Long> {

    private String subject;
    private LocalDate examDate;
    
    @ManyToMany
    private List<Question> questions = new ArrayList<>();
    


}
