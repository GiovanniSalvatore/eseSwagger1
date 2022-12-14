package co.develhope.swagger.controllers;


import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "")
public class Controller {

    @GetMapping(value="/name/{nome}")
    @ApiOperation(value="get a name")
    public String stampaNome(@PathVariable String nome){
        return nome;
    }
}