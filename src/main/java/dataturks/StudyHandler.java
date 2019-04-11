    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataturks;

import bonsai.config.AppConfig;
import bonsai.dropwizard.dao.d.DStudys;
import bonsai.dropwizard.dao.d.DStudysDAO;
import java.util.Date;

/**
 *
 * @author vinoth.v
 */
public class StudyHandler {
    
   public Long saveStudy(String name,String  projectId){
       DStudys dStudys=new DStudys(name, projectId, new Date(),  new Date());
       DStudysDAO dao = AppConfig.getInstance().getdStudysDAO();
       dStudys=(DStudys)dao.createInternal(dStudys);
       return dStudys.getId();
   }
}
