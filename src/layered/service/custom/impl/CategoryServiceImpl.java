/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package layered.service.custom.impl;

import java.util.ArrayList;
import java.util.List;
import layered.dao.DaoFactory;
import layered.dao.custom.CategoryDao;
import layered.dto.CategoryDto;
import layered.entity.CategoryEntity;
import layered.service.custom.CategoryService;

public class CategoryServiceImpl implements CategoryService {

    private CategoryDao categoryDao = (CategoryDao) DaoFactory.getInstance().getDao(DaoFactory.DaoType.CATEGORY);

    @Override
    public String addCategory(CategoryDto dto) throws Exception {
        CategoryEntity categoryEntity = new CategoryEntity(
                dto.getCategoryID(),
                dto.getCategoryName(),
                dto.getDescription(),
                dto.getPrice(),
                dto.getCapacity());

        if (categoryDao.save(categoryEntity)) {
            return "Successfully Saved";
        } else {
            return "Fail";
        }
    }

    @Override
    public String updateCategory(CategoryDto dto) throws Exception {
        CategoryEntity categoryEntity = new CategoryEntity(
                dto.getCategoryID(),
                dto.getCategoryName(),
                dto.getDescription(),
                dto.getPrice(),
                dto.getCapacity());

        if (categoryDao.update(categoryEntity)) {
            return "Successfully Updated";
        } else {
            return "Fail";
        }
    }

    @Override
    public String deleteCategory(String id) throws Exception {
        if (categoryDao.delete(id)) {
            return "Successfully Deleted";
        } else {
            return "Fail";
        }
    }

    @Override
    public CategoryDto getCategory(String id) throws Exception {
        CategoryEntity entity = categoryDao.get(id);
        if (entity != null) {
            return new CategoryDto(
                    entity.getCategoryID(),
                    entity.getCategoryName(),
                    entity.getDescription(),
                    entity.getPrice(),
                    entity.getCapacity());
        }
        return null;
    }

    @Override
    public List<CategoryDto> getAllCategories() throws Exception {
        List<CategoryDto> categoryDtos = new ArrayList<>();
        List<CategoryEntity> categoryEntities = categoryDao.getAll();
        for (CategoryEntity entity : categoryEntities) {
            categoryDtos.add(new CategoryDto(
                    entity.getCategoryID(),
                    entity.getCategoryName(),
                    entity.getDescription(),
                    entity.getPrice(),
                    entity.getCapacity()));
        }
        return categoryDtos;
    }
}

