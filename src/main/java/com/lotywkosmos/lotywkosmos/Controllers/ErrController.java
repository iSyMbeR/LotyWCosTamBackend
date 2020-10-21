package com.lotywkosmos.lotywkosmos.Controllers;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ErrController implements ErrorController {

   @RequestMapping(path = "error")
   public ModelAndView showError() {
        return new ModelAndView("error");
    }

    @Override
    public String getErrorPath() {
        return "PANIE GDZIEś PAN TRAFIL, ZAWRÓĆ!!";
    }
}
