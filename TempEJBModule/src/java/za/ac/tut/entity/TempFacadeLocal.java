
package za.ac.tut.entity;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author yolan
 */
@Local
public interface TempFacadeLocal {

    void createTemp(Temp temp);

    void editTemp(Temp temp);

    void removeTemp(Temp temp);
    
    void removeByName(String name);
    
    List<Temp> findStudentsWithMultipleModules();

    Temp find(Object id);

    List<Temp> findAll();

    List<Temp> findRange(int[] range);

    int count();
    
}
