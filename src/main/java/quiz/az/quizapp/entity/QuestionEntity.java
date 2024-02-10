package quiz.az.quizapp.entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.JdbcTypeCode;
import org.springframework.data.annotation.CreatedDate;
import quiz.az.quizapp.enums.QuestionResponseSelectionType;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

@Data
@Entity
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
@Table(name = "question")
@FieldDefaults(level = AccessLevel.PRIVATE)
@NamedEntityGraph(
        name = "Question.answers",
        attributeNodes = @NamedAttributeNode("answers")
)
public class QuestionEntity {

    @Id
    @JdbcTypeCode(java.sql.Types.VARCHAR)
    UUID id;

    @NotBlank
    @Column(columnDefinition = "TEXT")
    String description;

    @CreatedDate
    LocalDateTime createdAt;

    @NotNull
    @Max(11)
    Integer weight;

    @Enumerated(EnumType.STRING)
    QuestionResponseSelectionType type;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "question")
    Set<AnswerEntity> answers;

}
