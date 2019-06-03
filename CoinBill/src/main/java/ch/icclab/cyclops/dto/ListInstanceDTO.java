package ch.icclab.cyclops.dto;
/*
 * Copyright (c) 2017. Zuercher Hochschule fuer Angewandte Wissenschaften
 * All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

import ch.icclab.cyclops.persistence.orm.InstanceORM;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Author: Martin Skoviera (linkedin.com/in/skoviera)
 * Created: 22/02/16
 * Description: POJO object for list of instances, so we have it nicely formatted
 */
public class ListInstanceDTO {
    private List<InstanceDTO> instances;

    public ListInstanceDTO(List<InstanceORM> listOfORMs) {
        instances = new ArrayList<>();

        //iterate over instances
        for (InstanceORM instance: listOfORMs) {
            InstanceDTO dto = new InstanceDTO();
            dto.setId(instance.getId());

            try {
                // some instances don't have corresponding templates
                dto.setTemplateId(instance.getTemplateId());
            } catch (Exception ignored) {}

            dto.setName(instance.getName());
            dto.setAdded(instance.getAdded());

            Map map = instance.getFieldsAsMap();
            if (!map.isEmpty()) {
                dto.setParameters(instance.getFieldsAsMap());
            }

            // add it now
            instances.add(dto);
        }
    }

    public List<InstanceDTO> getInstances() {
        return instances;
    }
    public void setInstances(List<InstanceDTO> instances) {
        this.instances = instances;
    }
}
