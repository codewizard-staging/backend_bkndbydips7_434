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
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.bkndbydips7.repository.OrganizationRepository;
import com.app.bkndbydips7.repository.EmployeePersonalInfoRepository;
import com.app.bkndbydips7.repository.EmlpoyeeProfileRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
