package com.hms;


import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
import org.springframework.stereotype.Component;

import com.hms.model.Appointment;
import com.hms.model.Complaint;
import com.hms.model.FollowUp;
import com.hms.model.History;
import com.hms.model.Invoice;
import com.hms.model.Kase;
import com.hms.model.Mind;
import com.hms.model.Patient;
import com.hms.model.PhyGen;
import com.hms.model.Remedy;
import com.hms.model.User;

@Component
public class ExposeEntityIdRestMvcConfiguration extends RepositoryRestConfigurerAdapter {

  @Override
  public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
    config.exposeIdsFor(User.class, Appointment.class, Complaint.class, FollowUp.class, 
    		History.class, Invoice.class, Kase.class, Mind.class, Patient.class, PhyGen.class, Remedy.class);
  }
}
