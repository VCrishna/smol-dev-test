```java
package com.placementapp.controller;

import com.placementapp.model.Placement;
import com.placementapp.service.PlacementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/placements")
public class PlacementController {

    @Autowired
    private PlacementService placementService;

    @GetMapping
    public ResponseEntity<List<Placement>> getAllPlacements() {
        return ResponseEntity.ok(placementService.getAllPlacements());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Placement> getPlacementById(@PathVariable Long id) {
        return ResponseEntity.ok(placementService.getPlacementById(id));
    }

    @PostMapping
    public ResponseEntity<Placement> createPlacement(@RequestBody Placement placement) {
        return ResponseEntity.ok(placementService.createPlacement(placement));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Placement> updatePlacement(@PathVariable Long id, @RequestBody Placement placement) {
        return ResponseEntity.ok(placementService.updatePlacement(id, placement));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePlacement(@PathVariable Long id) {
        placementService.deletePlacement(id);
        return ResponseEntity.ok().build();
    }
}
```