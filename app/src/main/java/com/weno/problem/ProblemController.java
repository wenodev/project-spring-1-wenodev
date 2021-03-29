package com.weno.problem;

import com.weno.problem.dto.ProblemResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/v1/problems")
@RestController
public class ProblemController {

    private final ProblemService problemService;

    public ProblemController(ProblemService problemService) {
        this.problemService = problemService;
    }

    @GetMapping
    public List<ProblemResponseDto> getAllProblems(){
        return problemService.getAllProblems();
    }

    @GetMapping("/{id}")
    public ProblemResponseDto getProblem(@PathVariable Long id){
        return problemService.getProblem(id);
    }
}
