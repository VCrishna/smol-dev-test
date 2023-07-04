```java
package com.placementapp.service.impl;

import com.placementapp.model.Placement;
import com.placementapp.repository.PlacementRepository;
import com.placementapp.service.PlacementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlacementServiceImpl implements PlacementService {

    @Autowired
    private PlacementRepository placementRepository;

    @Override
    public List<Placement> getAllPlacements() {
        return placementRepository.findAll();
    }

    @Override
    public Placement getPlacementById(Long id) {
        return placementRepository.findById(id).orElse(null);
    }

    @Override
    public Placement createPlacement(Placement placement) {
        return placementRepository.save(placement);
    }

    @Override
    public Placement updatePlacement(Placement placement) {
        return placementRepository.save(placement);
    }

    @Override
    public void deletePlacement(Long id) {
        placementRepository.deleteById(id);
    }
}
```