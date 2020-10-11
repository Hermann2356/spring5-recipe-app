package guru.springframework.controllers;

import guru.springframework.domain.Category;
import guru.springframework.domain.UnitOfMeasurement;
import guru.springframework.repositories.CategoryRepository;
import guru.springframework.repositories.UnitOfMeasurementRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

/*
 * created by Hermann Sterling on 10/10/20
 */
@Controller
public class IndexController {
    private CategoryRepository categoryRepository;
    private UnitOfMeasurementRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasurementRepository unitOfMeasurementRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasurementRepository;
    }

    @RequestMapping({"/","/index","/index.html"})
    public String getIndexPage(Model model){
        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasurement> unitOfMeasurementOptional = unitOfMeasureRepository.findByDescription("Teaspoon");
        model.addAttribute("categoryOptional", categoryOptional.get().getDescription());
        model.addAttribute("unitOfMeasurementOptional", unitOfMeasurementOptional.get().getDescription());

        return "index";
    }
}
