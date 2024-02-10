package quiz.az.quizapp.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;
import quiz.az.quizapp.entity.AnswerEntity;
import quiz.az.quizapp.enums.QuestionResponseSelectionType;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class QuestionResponse {

    UUID id;

    String description;

    LocalDateTime createdAt;

    Integer weight;

    QuestionResponseSelectionType type;

    Set<AnswerEntity> answers;


}

