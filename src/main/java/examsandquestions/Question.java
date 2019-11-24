package examsandquestions;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Question extends AbstractPersistable<Long> {

    private String title;
    private String content;

    @ManyToMany(mappedBy = "questions")
    private List<Exam> exams = new ArrayList<>();
    
    

}
