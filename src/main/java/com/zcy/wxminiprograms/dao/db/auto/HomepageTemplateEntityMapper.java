package com.zcy.wxminiprograms.dao.db.auto;

import com.zcy.wxminiprograms.entity.auto.HomepageTemplateEntity;

public interface HomepageTemplateEntityMapper {
    int deleteByPrimaryKey(Long templateId);

    int insert(HomepageTemplateEntity record);

    int insertSelective(HomepageTemplateEntity record);

    HomepageTemplateEntity selectByPrimaryKey(Long templateId);

    int updateByPrimaryKeySelective(HomepageTemplateEntity record);

    int updateByPrimaryKey(HomepageTemplateEntity record);
}