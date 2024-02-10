package quiz.az.quizapp.service.questionService;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import quiz.az.quizapp.entity.QuestionEntity;
import quiz.az.quizapp.repository.QuestionRepository;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class QuestionServiceImpl implements QuestionService {

    private final QuestionRepository questionRepository;
    private final ModelMapper modelMapper;


    @Override
    public List<QuestionEntity> getAllQuestion() {
        return questionRepository.findAll();
    }

    @Override
    public void deleteQuestion(UUID deleteId) {
        questionRepository.findById(deleteId);

    }

//    @Override
//    public QuestionEntity getSearchQuestions(UUID searchQuestionById, Pageable pageable) {
//        return null;
//    }
}




