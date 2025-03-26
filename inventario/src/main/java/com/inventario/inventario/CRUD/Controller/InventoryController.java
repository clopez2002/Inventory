package com.inventario.inventario.CRUD.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/api")
public class InventoryController {

/*******************************************************************/

    @GetMapping("/homeInventoryURL")
    public String home (){

        return "homePageFile";
    }

/*******************************************************************/
/*******************************************************************/
/*******************************************************************/
/*******************************************************************/
/*******************************************************************/


}
