/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package layered.service.custom;

import java.util.List;
import layered.dto.CategoryDto;
import layered.service.SuperService;

/**
 *
 * @author Admin
 */
public interface CategoryService extends SuperService{
    
    String addCategory(CategoryDto dto) throws Exception;

    String updateCategory(CategoryDto dto) throws Exception;

    String deleteCategory(String id) throws Exception;

    CategoryDto getCategory(String id) throws Exception;

    List<CategoryDto> getAllCategories() throws Exception;
}
