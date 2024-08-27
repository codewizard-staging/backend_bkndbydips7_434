package com.app.bkndbydips7.function;

import com.app.bkndbydips7.model.Organization;
import com.app.bkndbydips7.model.EmployeePersonalInfo;
import com.app.bkndbydips7.model.EmlpoyeeProfile;




import com.app.bkndbydips7.enums.EmploymentType;
import com.app.bkndbydips7.enums.OrgDept;
import com.app.bkndbydips7.enums.OrgBranch;
import com.app.bkndbydips7.converter.OrgBranchConverter;
import com.app.bkndbydips7.converter.EmploymentTypeConverter;
import com.app.bkndbydips7.converter.OrgDeptConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmAction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataAction;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transactional;

@Component
public class JavaActions implements ODataAction {
    private final EntityManager entityManager;

    public JavaActions(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

	
	
}
  