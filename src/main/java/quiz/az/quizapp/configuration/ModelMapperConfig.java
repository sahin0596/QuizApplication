package quiz.az.quizapp.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

@Controller
public class ModelMapperConfig {
    @Bean
    public ModelMapper getModelMapper() {
        return new ModelMapper();
    }
}
