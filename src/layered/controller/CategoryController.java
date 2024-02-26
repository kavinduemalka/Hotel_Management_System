/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package layered.controller;

import java.util.List;
import layered.dto.CategoryDto;
import layered.service.ServiceFactory;
import layered.service.custom.CategoryService;

/**
 *
 * @author Admin
 */
public class CategoryController {

    private CategoryService categoryService = (CategoryService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CATEGORY);

    public String saveCategory(CategoryDto categoryDto) throws Exception {
        return categoryService.addCategory(categoryDto);
    }

    public String updateCategory(CategoryDto categoryDto) throws Exception {
        return categoryService.updateCategory(categoryDto);
    }

    public String deleteCategory(String id) throws Exception {
        return categoryService.deleteCategory(id);
    }

    public CategoryDto getCategory(String id) throws Exception {
        return categoryService.getCategory(id);
    }

    public List<CategoryDto> getAllCategories() throws Exception {
        return categoryService.getAllCategories();
    }
}

