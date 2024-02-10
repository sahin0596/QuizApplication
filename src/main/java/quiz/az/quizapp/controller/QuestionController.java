package quiz.az.quizapp.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import quiz.az.quizapp.dto.QuestionResponse;
import quiz.az.quizapp.entity.QuestionEntity;
import quiz.az.quizapp.service.questionService.QuestionServiceImpl;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/question")
public class QuestionController {

    private final QuestionServiceImpl questionService;

    @GetMapping()
    public List<QuestionEntity> getAllQuestion() {
        return questionService.getAllQuestion();
    }

//    @GetMapping("/{searchQuestionById}/{pageable}")
//    public QuestionEntity getSearchQuestionById(
//            @PathVariable UUID searchQuestionById, Pageable pageable) {
//      return  questionService.getSearchQuestions(searchQuestionById,pageable);
//    }
//
    @DeleteMapping("/{deleteId}")
    public void deleteQuestion(@PathVariable UUID deleteId) {
        questionService.deleteQuestion(deleteId);

    }

}



