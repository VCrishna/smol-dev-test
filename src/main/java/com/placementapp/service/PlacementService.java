```java
package com.placementapp.service;

import com.placementapp.model.Placement;
import java.util.List;

public interface PlacementService {

    List<Placement> getAllPlacements();

    Placement getPlacementById(Long id);

    Placement createPlacement(Placement placement);

    Placement updatePlacement(Placement placement);

    void deletePlacement(Long id);

    List<Placement> getPlacementsByUserId(Long userId);
}
```