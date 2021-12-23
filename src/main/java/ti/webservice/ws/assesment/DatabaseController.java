/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ti.webservice.ws.assesment;

import java.util.ArrayList;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author asus
 */
@Controller
public class DatabaseController {
    
    @CrossOrigin
    @RequestMapping(value = "/datamahasiswaku/xml", produces = {MediaType.APPLICATION_XML_VALUE})
    @ResponseBody
    public List<Mahasiswa> getDataMahasiswakuXML(){
        List<Mahasiswa> datamahasiswaku = new ArrayList<>();
        
        MahasiswaJpaController controller = new MahasiswaJpaController();
        
        try {
            datamahasiswaku = controller.findMahasiswaEntities();
        } catch (Exception e){}
        
        return datamahasiswaku;
    }
    
    @CrossOrigin
    @RequestMapping(value = "/datamahasiswaku/json", produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public List<Mahasiswa> getDataMahasiswakuJSON(){
        List<Mahasiswa> datamahasiswaku = new ArrayList<>();
        
        MahasiswaJpaController controller = new MahasiswaJpaController();
        
        try {
            datamahasiswaku = controller.findMahasiswaEntities();
        } catch (Exception e){}
        
        return datamahasiswaku;
    }
    
}
