```java
package com.placementapp.model;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "placements")
public class Placement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String companyName;
    private String jobRole;
    private String jobDescription;
    private String location;
    private String eligibilityCriteria;
    private String applicationLink;
    private boolean isPreparationStarted;
    private boolean isApplicationSubmitted;
    private boolean isInterviewDone;
    private boolean isJobOffered;

}
```