package quiz.az.quizapp.service.questionService;

import quiz.az.quizapp.entity.QuestionEntity;

import java.util.List;
import java.util.UUID;

public interface QuestionService {
    List<QuestionEntity> getAllQuestion();

    void deleteQuestion(UUID deleteId);


//    QuestionEntity getSearchQuestions(UUID searchQuestionById, Pageable pageable);
}