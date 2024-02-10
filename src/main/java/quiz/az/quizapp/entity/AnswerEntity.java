package quiz.az.quizapp.entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.JdbcTypeCode;
import java.util.UUID;

@Data
@Entity
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
@Table(name = "answers")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AnswerEntity {

    @Id
    @JdbcTypeCode(java.sql.Types.VARCHAR)
    UUID id;

    @NotBlank
    String label;

    @NotBlank
    String description;

    boolean correct;

    @ManyToOne
    @JoinColumn(name = "question_id")
    @Getter(AccessLevel.NONE)
    QuestionEntity question;
}
