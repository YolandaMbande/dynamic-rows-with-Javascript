/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package za.ac.tut.entity;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author yolan
 */
@Local
public interface tampFacadeLocal {

    void create(tamp tamp);

    void edit(tamp tamp);

    void remove(tamp tamp);

    tamp find(Object id);

    List<tamp> findAll();

    List<tamp> findRange(int[] range);

    int count();
    
}
